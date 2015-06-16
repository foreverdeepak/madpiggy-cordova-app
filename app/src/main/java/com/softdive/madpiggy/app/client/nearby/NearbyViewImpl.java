package com.softdive.madpiggy.app.client.nearby;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Widget;
import com.googlecode.mgwt.ui.client.widget.panel.flex.FlexPanel;
import com.softdive.madpiggy.app.client.DrawerHeaderPanel;
import com.softdive.madpiggy.app.client.jsinterop.Native;
import com.softdive.madpiggy.app.client.tab.Tab;
import com.softdive.madpiggy.app.client.widget.Spinner;
import com.softdive.madpiggy.app.client.widget.viewpager.ViewPager;
import com.softdive.madpiggy.app.client.widget.viewpager.ViewPagerAdapter;
import com.vaadin.components.gwt.polymer.client.element.event.CoreSelectEvent;
import com.vaadin.components.gwt.polymer.client.widget.CoreAnimatedPages;
import com.vaadin.components.gwt.polymer.client.widget.PaperTab;
import com.vaadin.components.gwt.polymer.client.widget.PaperTabs;

/**
 * Created by deepakc on 02/06/15.
 */
public class NearbyViewImpl extends Composite implements NearbyView, ViewPagerAdapter {

    interface NearbyViewImplUiBinder extends UiBinder<HTMLPanel, NearbyViewImpl> {
    }

    private static NearbyViewImplUiBinder ourUiBinder = GWT.create(NearbyViewImplUiBinder.class);

	private Presenter presenter;
    @UiField DrawerHeaderPanel drawerHeaderPanel;
    @UiField FlexPanel flexPanel;
    @UiField PaperTabs paperTabs;
    @UiField CoreAnimatedPages animatedPages;
    @UiField FlowPanel detailView;
    private ViewPager viewPager;
    private Tab[] tabs;
    private Widget spinner = new Spinner();
    
    public NearbyViewImpl() {
        initWidget(ourUiBinder.createAndBindUi(this));
        animatedPages.setHeight(Native.getWindowHeight()+String.valueOf(Unit.PX));
        animatedPages.setWidth(Native.getWindowWidth()+String.valueOf(Unit.PX));
        viewPager = new ViewPager();
        viewPager.setShowCarouselIndicator(false);
        flexPanel.add(spinner);
    }

    @Override
    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;
        spinner.removeFromParent();
        flexPanel.add(viewPager);
        viewPager.setAdapter(this);
    }

    @Override
    public DrawerHeaderPanel getDrawerHeaderPanel() {
        return drawerHeaderPanel;
    }

	@Override
	public Widget getWidget(final int i) {
		return presenter.getWidget(tabs[i]);
	}

	@Override
	public int getItemCount() {
		return tabs.length;
	}

	@Override
	public void onItemSelected(int index) {
		paperTabs.getPolymerElement().selected(index + "");
	}
	
	public void clearDetailView() {
		detailView.getElement().removeAllChildren();
	}

	public void setDetailView(Widget widget) {
		detailView.getElement().appendChild(widget.getElement());
	}
	
	@Override
	public void setTabs(Tab[] tabs) {
		this.tabs = tabs;
		
		for (Tab tab : tabs) {
        	paperTabs.add(new PaperTab(tab.getName()));
		}
        
        paperTabs.getPolymerElement().addEventListener(CoreSelectEvent.NAME, new CoreSelectEvent.Listener() {
            @Override
            protected void handleEvent(CoreSelectEvent event) {
                Integer index = Integer.parseInt(paperTabs.getPolymerElement().selected().toString());
                viewPager.setSelectedPage(index.intValue());
            }
        });
	}
	
	@Override
	public FlowPanel getDetailView() {
		return detailView;
	}
	
	@Override
	public void togglePage() {
		String selected =  animatedPages.getPolymerElement().selected().toString();
		if(selected == "0") {
			animatedPages.getPolymerElement().selected("1");
		} else {
			animatedPages.getPolymerElement().selected("0");
		}
	}
}