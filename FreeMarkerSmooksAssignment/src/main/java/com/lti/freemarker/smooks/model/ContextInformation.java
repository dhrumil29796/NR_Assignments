package com.lti.freemarker.smooks.model;

/**
 * @author Dhrumil Shah
 * @version 1.0
 * @since 2020-05-25
 */
public class ContextInformation {
	private String sessionId;
	private String bookingMode;
	private String country;
	private String state;
	private String city;

	public ContextInformation() {
	}

	public ContextInformation(String sessionId, String bookingMode, String country, String state, String city) {
		super();
		this.sessionId = sessionId;
		this.bookingMode = bookingMode;
		this.country = country;
		this.state = state;
		this.city = city;
	}

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public String getBookingMode() {
		return bookingMode;
	}

	public void setBookingMode(String bookingMode) {
		this.bookingMode = bookingMode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
