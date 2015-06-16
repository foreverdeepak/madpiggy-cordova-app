package com.softdive.madpiggy.app.client.nearby;

import org.fusesource.restygwt.client.Method;
import org.fusesource.restygwt.client.MethodCallback;

import com.google.gwt.dom.client.Style;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.ScrollPanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.web.bindery.event.shared.EventBus;
import com.softdive.madpiggy.app.client.App;
import com.softdive.madpiggy.app.client.BaseActivity;
import com.softdive.madpiggy.app.client.ClientFactory;
import com.softdive.madpiggy.app.client.detail.ItemData;
import com.softdive.madpiggy.app.client.detail.deal.DealDetailPresenter;
import com.softdive.madpiggy.app.client.model.helper.AdCriteria;
import com.softdive.madpiggy.app.client.model.helper.DealWrapper;
import com.softdive.madpiggy.app.client.model.helper.GeoCriteria;
import com.softdive.madpiggy.app.client.model.helper.Latlng;
import com.softdive.madpiggy.app.client.tab.Tab;
import com.softdive.madpiggy.app.client.tab.Tab.TabType;

/**
 * Created by deepakc on 02/06/15.
 */
public class NearbyActivity extends BaseActivity implements NearbyView.Presenter {
	
	private NearbyView.DealsPresenter dealsPresenter;
	private NearbyView.MallsPresenter mallsPresenter;
	private NearbyView.OutletsPresenter outletsPresenter;
	
	private NearbyView nearbyView;

    public NearbyActivity(ClientFactory clientFactory) {
        super(clientFactory);
        nearbyView = new NearbyViewImpl();
		dealsPresenter = new DealsPresenterImpl(clientFactory, this);
		mallsPresenter = new MallsPresenterImpl(clientFactory);
		outletsPresenter = new OutletsPresenterImpl(clientFactory);
    }

    @Override
    public void start(AcceptsOneWidget panel, EventBus eventBus) {
        super.start(panel, eventBus);

        mainPanel.setWidget(nearbyView);
        loadData();
    }

	private void loadData() {
		if (App.getListingDataStore().getList() == null || App.getListingDataStore().getList().getAdDtos() == null || App.getListingDataStore().getList().getAdDtos().size() == 0) {
			
			AdCriteria adCriteria = new AdCriteria();
			Latlng position = clientFactory.getCurrentLocation();
			GeoCriteria geoCriteria = new GeoCriteria();
			if (position != null) {
				geoCriteria.setLatitude(position.getLat());
				geoCriteria.setLongitude(position.getLng());
				//geoCriteria.setRadius(10);
			}
			adCriteria.setGeoCriteria(geoCriteria);
			
			clientFactory.getAdApi().getDealWrapper(adCriteria, 0, 50, new MethodCallback<DealWrapper>() {
				
				@Override
				public void onSuccess(Method method, DealWrapper response) {
					App.getListingDataStore().saveList(response);
					onDataLoad();
				}
				
				@Override
				public void onFailure(Method method, Throwable exception) {
				}
			});
		} else {
			onDataLoad();
		}
	}
	
	public void onItemClick() {
		//create the detail presenter
		//page change animation
		//start presenter
	}

	@Override
	public Widget getWidget(Tab tab) {
		final ScrollPanel scrollPanel = new ScrollPanel();
        scrollPanel.setHeight(Window.getClientHeight() -128 + "px");
        scrollPanel.getElement().getStyle().setWidth(100, Style.Unit.PCT);
        
        FlowPanel flowPanel3 = new FlowPanel();
        flowPanel3.getElement().getStyle().setWidth(100, Style.Unit.PCT);
        flowPanel3.add(getWidgetInternal(tab));
        scrollPanel.add(flowPanel3);
        
        return scrollPanel;
	}


	private Widget getWidgetInternal(Tab tab) {
		switch (tab.getTabType()) {
		case DEALS:
		case CATEGORY:
			return dealsPresenter.getWidget(tab);
		case OUTLETS:
			return outletsPresenter.getWidget();
		case MALLS:
			return mallsPresenter.getWidget();
		default:
			return dealsPresenter.getWidget(tab);
		}
	}

	private void onDataLoad() {
		nearbyView.setTabs(App.getListingDataStore().getTabs());
		nearbyView.setPresenter(NearbyActivity.this);
	}
	
	@Override
	public void onStop() {
		super.onStop();
		outletsPresenter.onStop();
		mallsPresenter.onStop();
		dealsPresenter.onStop();
	}

	@Override
	public void showDetailView(TabType tabType, ItemData data) {
		switch (tabType) {
		case DEALS:
		case CATEGORY:
			nearbyView.togglePage();
			DealDetailPresenter dealDetailPresenter = new DealDetailPresenter(clientFactory, data);
			dealDetailPresenter.start(nearbyView.getDetailView());
			break;
		case OUTLETS:
			break;
		case MALLS:
			break;
		default:
			break;
		}
	}

	@Override
	public void hideDetailView() {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
