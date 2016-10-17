package com.appdirect.domain;

public class AbstractDomain {
	private String  code;
	private String text;
	private String appName;
	boolean fatelError;
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
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
