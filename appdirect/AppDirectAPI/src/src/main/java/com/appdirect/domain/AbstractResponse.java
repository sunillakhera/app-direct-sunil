package com.appdirect.domain;

public class AbstractResponse {
	private String  responseCode;
	private String text;
	private String appName;
	boolean fatelError;
	public String getResponseCode() {
		return responseCode;
	}
	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getAppName() {
		return appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}
	public boolean isFatelError() {
		return fatelError;
	}
	public void setFatelError(boolean fatelError) {
		this.fatelError = fatelError;
	}
}
