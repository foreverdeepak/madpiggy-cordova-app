package com.softdive.madpiggy.app.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.place.shared.PlaceChangeEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.softdive.madpiggy.app.client.element.event.CoreTapEvent;
import com.softdive.madpiggy.app.client.nearby.NearbyPlace;
import com.vaadin.components.gwt.polymer.client.element.PaperItemElement;
import com.vaadin.components.gwt.polymer.client.widget.PaperMenuButton;

/**
 * Created by deepakc on 02/06/15.
 */
public class DefaultMenu extends Composite implements Menu {
    interface DefaultMenuUiBinder extends UiBinder<PaperMenuButton, DefaultMenu> {
    }

    private static DefaultMenuUiBinder ourUiBinder = GWT.create(DefaultMenuUiBinder.class);

    @UiField PaperItemElement inviteFriends;
    @UiField PaperItemElement refresh;

    public DefaultMenu() {
        initWidget(ourUiBinder.createAndBindUi(this));

        inviteFriends.addEventListener(CoreTapEvent.NAME, new CoreTapEvent.Listener() {
            @Override
            protected void handleEvent(CoreTapEvent event) {

            }
        });
        refresh.addEventListener(CoreTapEvent.NAME, new CoreTapEvent.Listener() {
            @Override
            protected void handleEvent(CoreTapEvent event) {
            	if (App.get().getClientFactory().getPlaceController().getWhere() instanceof NearbyPlace) {
            		App.getListingDataStore().clearStore();
            	}
            	App.get().getClientFactory().getEventBus().fireEvent(new PlaceChangeEvent(App.get().getClientFactory().getPlaceController().getWhere()));
            }
        });

    }
}