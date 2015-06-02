package com.softdive.madpiggy.app.client.model;

public enum Source {

	CAMPAIGN("ca") ,AD("ad"), COMPANY("c"), VOUCHER("v"), USER("u"), OUTLET("o"), WALLET("w"), MALL_NOTIFICATION("mn"), MALL("m"),MERCHANT_NOTIFICATION("mhn");

	private String folderName;

	private Source(String folderName) {
		this.folderName = folderName;
	}

	public String getFolderName() {
		return folderName;
	}

}
