package com.softdive.madpiggy.app.client.rest;

import java.util.logging.Logger;

import org.fusesource.restygwt.client.Dispatcher;
import org.fusesource.restygwt.client.Method;
import org.fusesource.restygwt.client.dispatcher.DefaultDispatcher;

import com.google.gwt.core.client.GWT;
import com.google.gwt.http.client.Request;
import com.google.gwt.http.client.RequestBuilder;
import com.google.gwt.http.client.RequestException;
import com.google.gwt.logging.client.LogConfiguration;
import com.softdive.madpiggy.app.client.model.User;
import com.softdive.madpiggy.app.client.storage.user.UserStorage;

public class MadpiggyRestIntercepter implements Dispatcher {
	
	public static final MadpiggyRestIntercepter INSTANCE = new MadpiggyRestIntercepter();

	@Override
	public Request send(Method method, RequestBuilder builder) throws RequestException {
		User user = UserStorage.USER_STORAGE.retrieveSavedUser();
		if (user != null && user.getId() != 0l) {
			builder.setHeader("userId", String.valueOf(user.getId()));
		}
		
		builder.setHeader("Content-Encoding", "gzip, deflate");
		
		if(GWT.isClient() && LogConfiguration.loggingIsEnabled() ){
            Logger logger = Logger.getLogger( DefaultDispatcher.class.getName() );
            logger.fine("Sending http request: " + builder.getHTTPMethod() + " "
                + builder.getUrl() + " ,timeout:"
                + builder.getTimeoutMillis());

            String content = builder.getRequestData();
            if (content != null && content.length() > 0) {
                logger.fine(content);
            }
        }
        return builder.send();
	}

}
