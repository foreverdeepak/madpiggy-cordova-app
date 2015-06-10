package com.softdive.madpiggy.app.client.nearby;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Style;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Widget;
import com.googlecode.mgwt.ui.client.widget.panel.flex.FlexPanel;
import com.softdive.madpiggy.app.client.DrawerHeaderPanel;
import com.softdive.madpiggy.app.client.polymer.element.PaperTabsElement;
import com.softdive.madpiggy.app.client.polymer.element.event.PaperSelectEvent;
import com.softdive.madpiggy.app.client.widget.viewpager.ViewPager;
import com.softdive.madpiggy.app.client.widget.viewpager.ViewPagerAdapter;

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
    @UiField PaperTabsElement paperTabsElement;
    
    private ViewPager viewPager;
    
    public NearbyViewImpl() {
        initWidget(ourUiBinder.createAndBindUi(this));
    }

	public void init() {
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


        paperTabsElement.addEventListener(PaperSelectEvent.NAME, new PaperSelectEvent.Listener() {
            @Override
            protected void handleEvent(PaperSelectEvent event) {
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
		return presenter.getWidget(i);
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