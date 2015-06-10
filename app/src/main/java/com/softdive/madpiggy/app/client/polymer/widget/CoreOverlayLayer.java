package com.softdive.madpiggy.app.client.polymer.widget;

import com.softdive.madpiggy.app.client.polymer.PolymerWidget;
import com.softdive.madpiggy.app.client.polymer.element.CoreOverlayLayerElement;

public class CoreOverlayLayer extends PolymerWidget {

    public CoreOverlayLayer(String html) {
        this("core-overlay-layer", html);
    }
    
    public CoreOverlayLayer(String tag, String html) {
        super(tag, html);

    }

    public CoreOverlayLayerElement getPolymerElement() {
        return (CoreOverlayLayerElement) getElement();
    }
    




}
