package com.softdive.madpiggy.app.client.nearby;

import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;
import com.softdive.madpiggy.app.client.DrawerHeaderPanel;

/**
 * Created by deepakc on 02/06/15.
 */
public interface NearbyView extends DrawerHeaderPanel.DrawableLayoutView, IsWidget {

    void setPresenter(Presenter presenter);
    
    void init();

    public static interface Presenter {

    	Widget getWidget(int index);
    }
}
