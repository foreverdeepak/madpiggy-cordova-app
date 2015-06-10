package com.softdive.madpiggy.app.client.nearby;

import com.google.gwt.user.client.ui.Widget;
import com.softdive.madpiggy.app.client.ClientFactory;
import com.softdive.madpiggy.app.client.tab.Tab;

/**
 * Created by deepakc on 10/06/15.
 */
public class DealsPresenterImpl implements NearbyView.DealsPresenter {

    private ClientFactory clientFactory;

    public DealsPresenterImpl(ClientFactory clientFactory) {
        this.clientFactory = clientFactory;
    }

    @Override
    public Widget getWidget(Tab tab) {
        return null;
    }

}
