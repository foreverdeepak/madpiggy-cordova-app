package com.softdive.madpiggy.app.client.signin;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;

/**
 * Created by deepakc on 03/06/15.
 */
public class LoginViewImpl extends Composite implements LoginView {
    interface LoginViewImplUiBinder extends UiBinder<HTMLPanel, LoginViewImpl> {
    }

    private static LoginViewImplUiBinder ourUiBinder = GWT.create(LoginViewImplUiBinder.class);

    private Presenter presenter;

    public LoginViewImpl() {
        initWidget(ourUiBinder.createAndBindUi(this));
    }

    @Override
    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;
    }
}