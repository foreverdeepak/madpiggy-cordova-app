package com.softdive.madpiggy.app.client.signin;

import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.web.bindery.event.shared.EventBus;
import com.softdive.madpiggy.app.client.BaseActivity;
import com.softdive.madpiggy.app.client.ClientFactory;

/**
 * Created by deepakc on 03/06/15.
 */
public class LoginActivity extends BaseActivity implements LoginView.Presenter {

    public LoginActivity(ClientFactory clientFactory) {
        super(clientFactory);
    }

    @Override
    public void start(AcceptsOneWidget panel, EventBus eventBus) {
        super.start(panel, eventBus);
        LoginView loginView = new LoginViewImpl();
        loginView.setPresenter(this);
        panel.setWidget(loginView);
    }
}
