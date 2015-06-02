package com.softdive.madpiggy.app.client.model;

public class ApplicationException extends Exception {

	private static final long serialVersionUID = 1L;

	public final int code;
	public final String message;
	private Throwable linkedException;

	public ApplicationException(String message) {
		super(message);
		code = 500;
		this.message = message;
	}

	public ApplicationException(int code, String message) {
		super(message);
		this.code = code;
		this.message = message;
	}

	public ApplicationException(ResponseCode responseCode, String message) {
		this(responseCode.getValue(), message);
	}

	public ApplicationException(int code, String message, Throwable linkedException) {
		super(message);
		this.code = code;
		this.message = message;
		this.linkedException = linkedException;
	}

	public ApplicationException(Throwable linkedException) {
		super(linkedException.getMessage());
		this.code = 500;
		this.message = linkedException.getMessage();
		this.linkedException = linkedException;
	}

	public int getCode() {
		return code;
	}

	@Override
	public String getMessage() {
		return this.message;
	}

	public Throwable getLinkedException() {
		return linkedException;
	}

}
