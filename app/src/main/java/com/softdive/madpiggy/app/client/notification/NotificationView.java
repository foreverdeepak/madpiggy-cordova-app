package com.softdive.madpiggy.app.client.notification;

import com.google.gwt.user.client.ui.IsWidget;
import com.softdive.madpiggy.app.client.DrawerHeaderPanel;

/**
 * Created by deepakc on 02/06/15.
 */
public interface NotificationView extends DrawerHeaderPanel.DrawableLayoutView, IsWidget {

    void setPresenter(Presenter presenter);

    public static interface Presenter {

    }
}
