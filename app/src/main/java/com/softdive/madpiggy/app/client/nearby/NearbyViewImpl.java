package com.softdive.madpiggy.app.client.nearby;

import java.util.HashMap;
import java.util.Map;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.Scheduler;
import com.google.gwt.core.client.Scheduler.ScheduledCommand;
import com.google.gwt.dom.client.Style;
import com.google.gwt.event.dom.client.ScrollEvent;
import com.google.gwt.event.dom.client.ScrollHandler;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.ScrollPanel;
import com.google.gwt.user.client.ui.Widget;
import com.googlecode.mgwt.ui.client.widget.panel.flex.FlexPanel;
import com.softdive.madpiggy.app.client.DrawerHeaderPanel;
import com.softdive.madpiggy.app.client.widget.viewpager.ViewPager;
import com.softdive.madpiggy.app.client.widget.viewpager.ViewPagerAdapter;
import com.vaadin.components.gwt.polymer.client.element.PaperTabsElement;
import com.vaadin.components.gwt.polymer.client.element.event.CoreSelectEvent;

/**
 * Created by deepakc on 02/06/15.
 */
@SuppressWarnings("unused")
public class NearbyViewImpl extends Composite implements NearbyView, ViewPagerAdapter {

    interface NearbyViewImplUiBinder extends UiBinder<HTMLPanel, NearbyViewImpl> {
    }

    private static NearbyViewImplUiBinder ourUiBinder = GWT.create(NearbyViewImplUiBinder.class);

	private Presenter presenter;

    @UiField DrawerHeaderPanel drawerHeaderPanel;
    @UiField FlexPanel flexPanel;
    @UiField PaperTabsElement paperTabsElement;
    
    private Map<Integer, Integer> indexToScrol;
    private ViewPager viewPager;
    
    public NearbyViewImpl() {
        initWidget(ourUiBinder.createAndBindUi(this));
        
        indexToScrol = new HashMap<Integer, Integer>();
        
        viewPager = new ViewPager();
        viewPager.setShowCarouselIndicator(false);

        viewPager.getElement().getStyle().setVisibility(Style.Visibility.HIDDEN);

        flexPanel.add(viewPager);
        new Timer() {
            @Override
            public void run() {
                viewPager.getElement().getStyle().setVisibility(Style.Visibility.VISIBLE);
            }
        }.schedule(350);


        paperTabsElement.addEventListener(CoreSelectEvent.NAME, new CoreSelectEvent.Listener() {
            @Override
            protected void handleEvent(CoreSelectEvent event) {
                Integer index = Integer.parseInt(paperTabsElement.selected().toString());
                viewPager.setSelectedPage(index.intValue());
            }
        });

        viewPager.setAdapter(this);
    }

    @Override
    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public DrawerHeaderPanel getDrawerHeaderPanel() {
        return drawerHeaderPanel;
    }

	@Override
	public Widget getWidget(final int i) {
		final ScrollPanel scrollPanel = new ScrollPanel();
        scrollPanel.setHeight(Window.getClientHeight() -128 + "px");
        scrollPanel.getElement().getStyle().setWidth(100, Style.Unit.PCT);
        FlowPanel flowPanel3 = new FlowPanel();
        flowPanel3.getElement().getStyle().setWidth(100, Style.Unit.PCT);
        flowPanel3.add(new HTML("top"));

        for (int j = 0; j < 200; j++) {
            HTML html = new HTML("Slide: " + (i) + "-" + j);
            flowPanel3.add(html);
        }
        flowPanel3.add(new HTML("bottom"));
        scrollPanel.add(flowPanel3);
        
        if (indexToScrol.get(i) != null) {
        	Scheduler.get().scheduleDeferred(new ScheduledCommand() {
				
				@Override
				public void execute() {
					scrollPanel.setVerticalScrollPosition(indexToScrol.get(i));
				}
			});
        }
        
        scrollPanel.addScrollHandler(new ScrollHandler() {
			
			@Override
			public void onScroll(ScrollEvent event) {
				indexToScrol.put(i, scrollPanel.getVerticalScrollPosition());
			}
		});
        
		return scrollPanel;
	}

	@Override
	public int getItemCount() {
		return 9;
	}

	@Override
	public void onItemSelected(int index) {
		paperTabsElement.selected(index + "");
	}
}