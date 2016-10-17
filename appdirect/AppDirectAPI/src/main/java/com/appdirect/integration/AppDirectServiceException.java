package com.appdirect.integration;
/**
 * @author sunil.kumar.lakhera
 *
 */
public class AppDirectServiceException extends RuntimeException{
	
	
	private String errorCode;

	public AppDirectServiceException(String errorCode , Throwable t){
		super(t);
		this.errorCode = errorCode;
		
	}
	AppDirectServiceException(Throwable t){
		super(t);
	}
	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	

}
