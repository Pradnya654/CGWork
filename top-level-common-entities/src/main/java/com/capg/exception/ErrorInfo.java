package com.capg.exception;

public class ErrorInfo {

	private String errorMessage;
	private String timestamp;
	private String uri;

	public ErrorInfo() {
		super();
	}

	public ErrorInfo(String errorMessage, String timestamp, String uri) {
		super();
		this.errorMessage = errorMessage;
		this.timestamp = timestamp;
		this.uri = uri;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	
	

}
