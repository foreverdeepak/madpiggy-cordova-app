package com.softdive.madpiggy.app.client.polymer.element;

import java.util.HashMap;

public class ImportsMap extends HashMap<String, String> {

    private static ImportsMap instance = new ImportsMap();
    
    static { 
        instance.put("context-free-parser", "context-free-parser/context-free-parser.html");
        instance.put("core-a11y-keys", "core-a11y-keys/core-a11y-keys.html");
        instance.put("core-ajax", "core-ajax/core-ajax.html");
        instance.put("core-xhr", "core-ajax/core-xhr.html");
        instance.put("Entity", "core-ajax/demo-progress.html");
        instance.put("core-animated-pages", "core-animated-pages/core-animated-pages.html");
        instance.put("core-animation-group", "core-animation/core-animation-group.html");
        instance.put("core-animation", "core-animation/core-animation.html");
        instance.put("core-animation-keyframe", "core-animation/core-animation.html");
        instance.put("core-animation-prop", "core-animation/core-animation.html");
        instance.put("Entity", "core-animation/web-animations.html");
        instance.put("core-collapse", "core-collapse/core-collapse.html");
        instance.put("Entity", "core-component-page/core-component-page.html");
        instance.put("core-doc-viewer", "core-doc-viewer/core-doc-viewer.html");
        instance.put("core-drag-drop", "core-drag-drop/core-drag-drop.html");
        instance.put("core-drawer-panel", "core-drawer-panel/core-drawer-panel.html");
        instance.put("core-dropdown-base", "core-dropdown/core-dropdown-base.html");
        instance.put("core-dropdown", "core-dropdown/core-dropdown.html");
        instance.put("core-dropdown-menu", "core-dropdown-menu/core-dropdown-menu.html");
        instance.put("core-field", "core-field/core-field.html");
        instance.put("core-elements", "core-elements/core-elements.html");
        instance.put("Entity", "core-focusable/core-focusable.html");
        instance.put("core-header-panel", "core-header-panel/core-header-panel.html");
        instance.put("core-icon", "core-icon/core-icon.html");
        instance.put("core-icon-button", "core-icon-button/core-icon-button.html");
        instance.put("Entity", "core-icons/av-icons.html");
        instance.put("Entity", "core-icons/communication-icons.html");
        instance.put("Entity", "core-icons/core-icons.html");
        instance.put("Entity", "core-icons/device-icons.html");
        instance.put("Entity", "core-icons/editor-icons.html");
        instance.put("Entity", "core-icons/hardware-icons.html");
        instance.put("Entity", "core-icons/image-icons.html");
        instance.put("Entity", "core-icons/maps-icons.html");
        instance.put("Entity", "core-icons/notification-icons.html");
        instance.put("Entity", "core-icons/social-icons.html");
        instance.put("core-iconset", "core-iconset/core-iconset.html");
        instance.put("core-iconset-svg", "core-iconset-svg/core-iconset-svg.html");
        instance.put("Entity", "core-iconset-svg/svg-sample-icons.html");
        instance.put("core-image", "core-image/core-image.html");
        instance.put("core-input", "core-input/core-input.html");
        instance.put("core-item", "core-item/core-item.html");
        instance.put("core-label", "core-label/core-label.html");
        instance.put("core-layout-grid", "core-layout-grid/core-layout-grid.html");
        instance.put("core-layout-trbl", "core-layout-trbl/core-layout-trbl.html");
        instance.put("Entity", "core-layout-trbl/core-slide.html");
        instance.put("core-list", "core-list/core-list.html");
        instance.put("core-localstorage", "core-localstorage/core-localstorage.html");
        instance.put("core-media-query", "core-media-query/core-media-query.html");
        instance.put("core-menu", "core-menu/core-menu.html");
        instance.put("core-submenu", "core-menu/core-submenu.html");
        instance.put("core-menu-button", "core-menu-button/core-menu-button.html");
        instance.put("core-meta", "core-meta/core-meta.html");
        instance.put("core-key-helper", "core-overlay/core-key-helper.html");
        instance.put("core-overlay-layer", "core-overlay/core-overlay-layer.html");
        instance.put("core-overlay", "core-overlay/core-overlay.html");
        instance.put("core-pages", "core-pages/core-pages.html");
        instance.put("core-range", "core-range/core-range.html");
        instance.put("CoreResizable", "core-resizable/core-resizable.html");
        instance.put("CoreResizer", "core-resizable/core-resizable.html");
        instance.put("core-scaffold", "core-scaffold/core-scaffold.html");
        instance.put("core-scroll-header-panel", "core-scroll-header-panel/core-scroll-header-panel.html");
        instance.put("core-scroll-threshold", "core-scroll-threshold/core-scroll-threshold.html");
        instance.put("core-selection", "core-selection/core-selection.html");
        instance.put("core-selector", "core-selector/core-selector.html");
        instance.put("core-shared-lib", "core-shared-lib/core-shared-lib.html");
        instance.put("core-signals", "core-signals/core-signals.html");
        instance.put("core-splitter", "core-splitter/core-splitter.html");
        instance.put("core-style", "core-style/core-style.html");
        instance.put("Entity", "core-style/elements.html");
        instance.put("Entity", "core-style/my-theme.html");
        instance.put("Entity", "core-tests/runner.html");
        instance.put("core-toolbar", "core-toolbar/core-toolbar.html");
        instance.put("core-tooltip", "core-tooltip/core-tooltip.html");
        instance.put("core-transition-css", "core-transition/core-transition-css.html");
        instance.put("core-transition", "core-transition/core-transition.html");
        instance.put("Entity", "font-roboto/roboto.html");
        instance.put("Entity", "google-code-prettify/CHANGES.html");
        instance.put("Entity", "google-code-prettify/README-zh-Hans.html");
        instance.put("Entity", "google-code-prettify/README.html");
        instance.put("marked-element", "marked-element/marked-element.html");
        instance.put("Entity", "marked-element/marked-import.html");
        instance.put("paper-button-base", "paper-button/paper-button-base.html");
        instance.put("paper-button", "paper-button/paper-button.html");
        instance.put("paper-checkbox", "paper-checkbox/paper-checkbox.html");
        instance.put("paper-action-dialog", "paper-dialog/paper-action-dialog.html");
        instance.put("paper-dialog-base", "paper-dialog/paper-dialog-base.html");
        instance.put("Entity", "paper-dialog/paper-dialog-transition.html");
        instance.put("paper-dialog", "paper-dialog/paper-dialog.html");
        instance.put("paper-dropdown-transition", "paper-dropdown/paper-dropdown-transition.html");
        instance.put("paper-dropdown", "paper-dropdown/paper-dropdown.html");
        instance.put("paper-dropdown-menu", "paper-dropdown-menu/paper-dropdown-menu.html");
        instance.put("paper-elements", "paper-elements/paper-elements.html");
        instance.put("paper-fab", "paper-fab/paper-fab.html");
        instance.put("paper-icon-button", "paper-icon-button/paper-icon-button.html");
        instance.put("paper-autogrow-textarea", "paper-input/paper-autogrow-textarea.html");
        instance.put("paper-char-counter", "paper-input/paper-char-counter.html");
        instance.put("paper-input-decorator", "paper-input/paper-input-decorator.html");
        instance.put("paper-input", "paper-input/paper-input.html");
        instance.put("paper-item", "paper-item/paper-item.html");
        instance.put("paper-menu-button", "paper-menu-button/paper-menu-button.html");
        instance.put("paper-progress", "paper-progress/paper-progress.html");
        instance.put("paper-radio-button", "paper-radio-button/paper-radio-button.html");
        instance.put("paper-radio-group", "paper-radio-group/paper-radio-group.html");
        instance.put("paper-ripple", "paper-ripple/paper-ripple.html");
        instance.put("paper-shadow", "paper-shadow/paper-shadow.html");
        instance.put("paper-slider", "paper-slider/paper-slider.html");
        instance.put("paper-spinner", "paper-spinner/paper-spinner.html");
        instance.put("paper-tab", "paper-tabs/paper-tab.html");
        instance.put("paper-tabs", "paper-tabs/paper-tabs.html");
        instance.put("paper-toast", "paper-toast/paper-toast.html");
        instance.put("paper-toggle-button", "paper-toggle-button/paper-toggle-button.html");
        instance.put("Entity", "polymer/layout.html");
        instance.put("Entity", "polymer/polymer.html");
        instance.put("Entity", "polymer-test-tools/tools.html");
        instance.put("prettify-element", "prettify-element/prettify-element.html");
        instance.put("Entity", "prettify-element/prettify-import.html");
        instance.put("sampler-scaffold", "sampler-scaffold/sampler-scaffold.html");
        instance.put("Entity", "web-animations-js/web-animations-next-lite.dev.html");
        instance.put("Entity", "web-animations-js/web-animations-next.dev.html");
        instance.put("Entity", "web-animations-js/web-animations.dev.html");
        instance.put("Entity", "web-animations-js/web-animations.html");
    }

    public static ImportsMap getInstance() {
        return instance;
    }

    private ImportsMap() {
    }
    
    @Override
    public String get(Object key) {
        String value = super.get(key);
        if (value == null) {
            throw new RuntimeException("You have to generate GWT API for " + key);
        }
        return value;
    }
}
