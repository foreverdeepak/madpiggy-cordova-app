package com.softdive.madpiggy.app.client.nearby;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Widget;
import com.googlecode.mgwt.ui.client.widget.panel.flex.FlexPanel;
import com.softdive.madpiggy.app.client.DrawerHeaderPanel;
import com.softdive.madpiggy.app.client.tab.Tab;
import com.softdive.madpiggy.app.client.widget.Spinner;
import com.softdive.madpiggy.app.client.widget.viewpager.ViewPager;
import com.softdive.madpiggy.app.client.widget.viewpager.ViewPagerAdapter;
import com.vaadin.components.gwt.polymer.client.element.event.CoreSelectEvent;
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
    
    private ViewPager viewPager;
    private Tab[] tabs;
    private Widget spinner = new Spinner();
    
    public NearbyViewImpl() {
    	
        initWidget(ourUiBinder.createAndBindUi(this));
        
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
}