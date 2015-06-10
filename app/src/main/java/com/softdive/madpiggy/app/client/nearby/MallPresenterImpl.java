package com.softdive.madpiggy.app.client.nearby;

import com.google.gwt.user.client.ui.Widget;
import com.softdive.madpiggy.app.client.ClientFactory;

/**
 * Created by deepakc on 10/06/15.
 */
public class MallPresenterImpl implements NearbyView.MallsPresenter {

    private ClientFactory clientFactory;

    public MallPresenterImpl(ClientFactory clientFactory) {
        this.clientFactory = clientFactory;
    }

    @Override
    public Widget getWidget() {
        return null;
    }
}
