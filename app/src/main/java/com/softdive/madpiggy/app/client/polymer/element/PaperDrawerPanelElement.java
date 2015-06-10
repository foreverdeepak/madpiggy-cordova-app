package com.softdive.madpiggy.app.client.polymer.element;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;
import com.softdive.madpiggy.app.client.polymer.PolymerElement;

@JsType
public interface PaperDrawerPanelElement extends PolymerElement {


    @JsProperty String drawerWidth();
    @JsProperty void drawerWidth(String value);

    @JsProperty String responsiveWidth();
    @JsProperty void responsiveWidth(String value);

    @JsProperty String selected();
    @JsProperty void selected(String value);

    @JsProperty String defaultSelected();
    @JsProperty void defaultSelected(String value);

    @JsProperty boolean narrow();
    @JsProperty void narrow(boolean value);

    @JsProperty boolean rightDrawer();
    @JsProperty void rightDrawer(boolean value);

    @JsProperty boolean disableSwipe();
    @JsProperty void disableSwipe(boolean value);

    @JsProperty boolean forceNarrow();
    @JsProperty void forceNarrow(boolean value);

    @JsProperty boolean disableEdgeSwipe();
    @JsProperty void disableEdgeSwipe(boolean value);



    void togglePanel();

    void openDrawer();

    void closeDrawer();

}