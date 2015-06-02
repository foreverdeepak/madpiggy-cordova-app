package com.softdive.madpiggy.app.client.model;

public enum ResponseCode {

	SUCCESS(200, "success"), UNAUTHORIZED(401, "UNAUTHORIZED"), SERVER_ERROR(500, "Internal Server Error"), USER_CONNECTION_ALREADY_EXISTS(
			501, "You are already in a connection with a user."), NO_USER_CONNECTION(502, "There is no such user connection."), NO_ENOUGH_BALANCE(
			503, "You dont have enough balance."), USER_ALREADY_EXIST(504, "User already exist"), NO_SUCH_PARENT(505,
			"The entered parent doesnot exist"), ALREADY_IN_KINGDOM(506, "This user is already a child in your kingdom"), INVALID_VOUCHER(
			507, "Invalid Voucher"), INVENTORY_SOLD_OUT(508, "Inventory Sold out"), USER_DOES_NOT_EXIST(509, "User Id does not exist"), WRONG_PASSWORD(
			510, "Wrong password"), CAN_NOT_EDIT_CAMPAIGN(511, "Campaign either in PUBLISH/UNPUBLISH state"), NO_RUNNING_CAMPAIGN_FOUND(
			512, "No running campaign found"), INVALID_DATA(513, "INVALID_DATA"), PROFILE_TYPE_NOT_SUPPORTED_WT_PWD(514,
			"profile type not supported"), NOT_PUBLISHED(515, "Not published"), CAMPAIGN_CLOSED(516,
			"Campaign is closed or completed the cap limit"), ONE_CAMPAIGN_ALREADY_RUNNING(517, "One campaign already running."), ALREADY_EARNED(
			518, "Earned already. Reattemt not allowed"), RETRY(519, "Please attempt a retry for this call"), CANT_ADD(520,
			"You can't add yorself as Parent");

	private int value;
	private String message;

	ResponseCode(int value, String messgae) {
		this.value = value;
		this.message = messgae;
	}

	public int getValue() {
		return value;
	}

	public String getMessage() {
		return message;
	}

	public static ResponseCode getCode(int value) {
		for (ResponseCode code : ResponseCode.values()) {
			if (code.getValue() == value) {
				return code;
			}
		}
		return SERVER_ERROR;
	}

}
