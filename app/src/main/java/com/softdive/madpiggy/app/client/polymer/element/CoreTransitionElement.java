package com.softdive.madpiggy.app.client.polymer.element;

import com.google.gwt.core.client.js.JsType;

@JsType
public interface CoreTransitionElement extends CoreMetaElement {




    void go(Object node, Object state);

    void setup(Object node);

    void teardown(Object node);

    void complete(Object node);

    void listenOnce(Object node, String event, Object fn, Object args);

}