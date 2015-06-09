package com.softdive.madpiggy.app.client.nearby;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.fusesource.restygwt.client.Method;
import org.fusesource.restygwt.client.MethodCallback;

import com.google.gwt.core.client.Scheduler;
import com.google.gwt.core.client.Scheduler.ScheduledCommand;
import com.google.gwt.dom.client.Style;
import com.google.gwt.event.dom.client.ScrollEvent;
import com.google.gwt.event.dom.client.ScrollHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.ScrollPanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.web.bindery.event.shared.EventBus;
import com.softdive.madpiggy.app.client.BaseActivity;
import com.softdive.madpiggy.app.client.ClientFactory;
import com.softdive.madpiggy.app.client.dealslisting.DealListView;
import com.softdive.madpiggy.app.client.dealslisting.DealListViewImpl;
import com.softdive.madpiggy.app.client.model.Advertisement;
import com.softdive.madpiggy.app.client.model.helper.AdCriteria;
import com.softdive.madpiggy.app.client.model.helper.DealWrapper;
import com.softdive.madpiggy.app.client.storage.ListingDataStore;
import com.softdive.madpiggy.app.client.tab.Tab;
import com.softdive.madpiggy.app.client.widget.Spinner;

/**
 * Created by deepakc on 02/06/15.
 */
public class NearbyActivity extends BaseActivity implements NearbyView.Presenter {
	
	private Map<Integer, Integer> indexToScrol;
	private Tab[] tabs;

    public NearbyActivity(ClientFactory clientFactory) {
        super(clientFactory);
    }

    @Override
    public void start(AcceptsOneWidget panel, EventBus eventBus) {
        super.start(panel, eventBus);
        tabs = ListingDataStore.getTabs();
        indexToScrol = new HashMap<Integer, Integer>();
        
        loadData();
    }

	private void loadData() {
		mainPanel.setWidget(new Spinner());
		if (ListingDataStore.getList() == null || ListingDataStore.getList().getAdDtos() == null || ListingDataStore.getList().getAdDtos().size() == 0) {
			clientFactory.getAdApi().getDealWrapper(new AdCriteria(), 0, 50, new MethodCallback<DealWrapper>() {
				
				@Override
				public void onSuccess(Method method, DealWrapper response) {
					ListingDataStore.saveList(response);
					renderView();
				}
				
				@Override
				public void onFailure(Method method, Throwable exception) {
				}
			});
		} else {
			renderView();
		}
	}

	@Override
	public Widget getWidget(final int i) {
		final ScrollPanel scrollPanel = new ScrollPanel();
        scrollPanel.setHeight(Window.getClientHeight() -128 + "px");
        scrollPanel.getElement().getStyle().setWidth(100, Style.Unit.PCT);
        
        FlowPanel flowPanel3 = new FlowPanel();
        flowPanel3.getElement().getStyle().setWidth(100, Style.Unit.PCT);
        flowPanel3.add(getWidgetInternal(i));
        scrollPanel.add(flowPanel3);
        
        addScrollHandler(i, scrollPanel);
        updateLastScrollPosition(i, scrollPanel);
		
        return scrollPanel;
	}

	public void addScrollHandler(final int i, final ScrollPanel scrollPanel) {
		scrollPanel.addScrollHandler(new ScrollHandler() {
			
			@Override
			public void onScroll(ScrollEvent event) {
				indexToScrol.put(i, scrollPanel.getVerticalScrollPosition());
			}
		});
	}

	public void updateLastScrollPosition(final int i, final ScrollPanel scrollPanel) {
		if (indexToScrol.get(i) != null) {
        	Scheduler.get().scheduleDeferred(new ScheduledCommand() {
        		
        		@Override
        		public void execute() {
        			scrollPanel.setVerticalScrollPosition(indexToScrol.get(i));
        		}
        	});
        }
	}
	
	private Widget getWidgetInternal(int index) {
		switch (tabs[index].getTabType()) {
		case DEALS:
			return getDealListView(index, ListingDataStore.getList().getAdvertisements());
		case CATEGORY:
			return getDealListView(index, ListingDataStore.getAdsByCategory(tabs[index].getName()));
		case OUTLETS:
			return new HTML("HTML");
		case MALLS:
			return new HTML("HTML");
		default:
			return getDealListView(index, ListingDataStore.getList().getAdvertisements());
		}
	}

	private Widget getDealListView(int index, Collection<Advertisement> ads) {
		DealListView view = new DealListViewImpl();
		view.render(ads, 0);
		return view.asWidget();
	}

	private void renderView() {
		NearbyView nearbyView = new NearbyViewImpl(tabs);
		nearbyView.setPresenter(NearbyActivity.this);
		mainPanel.setWidget(nearbyView);
	}
}
