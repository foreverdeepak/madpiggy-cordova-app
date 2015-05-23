package com.vaadin.components.gwt.polymer.client.widget;

import com.vaadin.components.gwt.polymer.client.PolymerWidget;
import com.vaadin.components.gwt.polymer.client.element.*;
import com.vaadin.components.gwt.polymer.client.webapi.element.*;
import com.vaadin.components.gwt.polymer.client.webapi.widget.alias.*;
import com.vaadin.components.gwt.polymer.client.widget.event.*;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;

public class CoreAnimation extends PolymerWidget {

    public CoreAnimation(String html) {
        this("core-animation", html);
    }
    
    public CoreAnimation(String tag, String html) {
        super(tag, html);

        getPolymerElement().addEventListener(
                com.vaadin.components.gwt.polymer.client.element.event.CoreAnimationFinishEvent.NAME,
                new com.vaadin.components.gwt.polymer.client.element.event.CoreAnimationFinishEvent.Listener() {
            @Override
            protected void handleEvent(com.vaadin.components.gwt.polymer.client.element.event.CoreAnimationFinishEvent event) {
                fireEvent(new CoreAnimationFinishEvent(event));
            }
        });

        getPolymerElement().addEventListener(
                com.vaadin.components.gwt.polymer.client.element.event.CoreAnimationChangeEvent.NAME,
                new com.vaadin.components.gwt.polymer.client.element.event.CoreAnimationChangeEvent.Listener() {
            @Override
            protected void handleEvent(com.vaadin.components.gwt.polymer.client.element.event.CoreAnimationChangeEvent event) {
                fireEvent(new CoreAnimationChangeEvent(event));
            }
        });

    }

    public CoreAnimationElement getPolymerElement() {
        return (CoreAnimationElement) getElement();
    }
    


    public Object getTarget(){
        return getPolymerElement().target();
    }
    public void setTarget(Object value) {
        getPolymerElement().target(value);
    }

    public Object getKeyframes(){
        return getPolymerElement().keyframes();
    }
    public void setKeyframes(Object value) {
        getPolymerElement().keyframes(value);
    }

    public Object getCustomEffect(){
        return getPolymerElement().customEffect();
    }
    public void setCustomEffect(Object value) {
        getPolymerElement().customEffect(value);
    }

    public Object getComposite(){
        return getPolymerElement().composite();
    }
    public void setComposite(Object value) {
        getPolymerElement().composite(value);
    }

    public Object getDuration(){
        return getPolymerElement().duration();
    }
    public void setDuration(Object value) {
        getPolymerElement().duration(value);
    }

    public Object getFill(){
        return getPolymerElement().fill();
    }
    public void setFill(Object value) {
        getPolymerElement().fill(value);
    }

    public String getEasing(){
        return getPolymerElement().easing();
    }
    public void setEasing(String value) {
        getPolymerElement().easing(value);
    }

    public double getDelay(){
        return getPolymerElement().delay();
    }
    public void setDelay(double value) {
        getPolymerElement().delay(value);
    }

    public double getEndDelay(){
        return getPolymerElement().endDelay();
    }
    public void setEndDelay(double value) {
        getPolymerElement().endDelay(value);
    }

    public Object getIterations(){
        return getPolymerElement().iterations();
    }
    public void setIterations(Object value) {
        getPolymerElement().iterations(value);
    }

    public double getIterationStart(){
        return getPolymerElement().iterationStart();
    }
    public void setIterationStart(double value) {
        getPolymerElement().iterationStart(value);
    }

    public Object getIterationComposite(){
        return getPolymerElement().iterationComposite();
    }
    public void setIterationComposite(Object value) {
        getPolymerElement().iterationComposite(value);
    }

    public Object getDirection(){
        return getPolymerElement().direction();
    }
    public void setDirection(Object value) {
        getPolymerElement().direction(value);
    }

    public double getPlaybackRate(){
        return getPolymerElement().playbackRate();
    }
    public void setPlaybackRate(double value) {
        getPolymerElement().playbackRate(value);
    }

    public boolean isAutoplay(){
        return getPolymerElement().autoplay();
    }
    public void setAutoplay(boolean value) {
        getPolymerElement().autoplay(value);
    }


    public void play() {
        getPolymerElement().play();
    }

    public void cancel() {
        getPolymerElement().cancel();
    }

    public void finish() {
        getPolymerElement().finish();
    }

    public void pause() {
        getPolymerElement().pause();
    }

    public void hasTarget() {
        getPolymerElement().hasTarget();
    }

    public void apply() {
        getPolymerElement().apply();
    }


    public HandlerRegistration addCoreAnimationFinishHandler(CoreAnimationFinishEventHandler handler) {
        return addHandler(handler, CoreAnimationFinishEvent.TYPE);
    }

    public HandlerRegistration addCoreAnimationChangeHandler(CoreAnimationChangeEventHandler handler) {
        return addHandler(handler, CoreAnimationChangeEvent.TYPE);
    }

}
