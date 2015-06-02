package com.softdive.madpiggy.app.client.model;

public class UserNotification extends Persistable {

	private long id;
	private long userId;
	private long foreignId;
	private Source source;
	private State state;
	private String text;
	private UserActivity activity;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public long getForeignId() {
		return foreignId;
	}

	public void setForeignId(long foreignId) {
		this.foreignId = foreignId;
	}

	public Source getSource() {
		return source;
	}

	public void setSource(Source source) {
		this.source = source;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public State getState() {
		if (state == null) {
			state = State.UNREAD;
		}
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public static enum State {
		READ, UNREAD
	}

	public void setActivity(UserActivity activity) {
		this.activity = activity;
	}

	public UserActivity getActivity() {
		return activity;
	}

}
