package com.softdive.madpiggy.app.client.nearby;

import java.util.HashMap;
import java.util.Map;

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

/**
 * Created by deepakc on 02/06/15.
 */
public class NearbyActivity extends BaseActivity implements NearbyView.Presenter {
	
	private Map<Integer, Integer> indexToScrol;

    public NearbyActivity(ClientFactory clientFactory) {
        super(clientFactory);
    }

    @Override
    public void start(AcceptsOneWidget panel, EventBus eventBus) {
        super.start(panel, eventBus);
        indexToScrol = new HashMap<Integer, Integer>();
        NearbyView nearbyView = new NearbyViewImpl();
        nearbyView.setPresenter(this);
        nearbyView.init();
        panel.setWidget(nearbyView);
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
}
