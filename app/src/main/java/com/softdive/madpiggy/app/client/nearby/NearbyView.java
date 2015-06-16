package com.softdive.madpiggy.app.client.nearby;

import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;
import com.softdive.madpiggy.app.client.DrawerHeaderPanel;
import com.softdive.madpiggy.app.client.detail.ItemData;
import com.softdive.madpiggy.app.client.tab.Tab;
import com.softdive.madpiggy.app.client.tab.Tab.TabType;

/**
 * Created by deepakc on 02/06/15.
 */
public interface NearbyView extends DrawerHeaderPanel.DrawableLayoutView, IsWidget {

    void setPresenter(Presenter presenter);
    
    FlowPanel getDetailView();
    
    void togglePage();
    
    public void setTabs(Tab[] tabs);
    
    public static interface Presenter {

    	Widget getWidget(Tab tab);
    	
    	void showDetailView(TabType tabType, ItemData data);
    	
    	void hideDetailView();
    }

    public static interface  DealsPresenter {
        Widget getWidget(Tab tab);
        void onStop();
    }

    public static interface  OutletsPresenter {
        Widget getWidget();
        
        void onStop();
    }

    public static interface  MallsPresenter {
        Widget getWidget();
        
        void onStop();
    }
    
}
