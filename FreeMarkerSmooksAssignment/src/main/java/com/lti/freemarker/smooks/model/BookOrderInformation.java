package com.lti.freemarker.smooks.model;

import java.util.List;

/**
 * @author Dhrumil Shah
 * @version 1.0
 * @since 2020-05-25
 */
public class BookOrderInformation {
	private ContextInformation contextInformation;
	private List<Book> bookOrderItems;

	public BookOrderInformation() {
	}

	public BookOrderInformation(ContextInformation contextInformation, List<Book> bookOrderItems) {
		super();
		this.contextInformation = contextInformation;
		this.bookOrderItems = bookOrderItems;
	}

	public ContextInformation getContextInformation() {
		return contextInformation;
	}

	public void setContextInformation(ContextInformation contextInformation) {
		this.contextInformation = contextInformation;
	}

	public List<Book> getBookOrderItems() {
		return bookOrderItems;
	}

	public void setBookOrderItems(List<Book> bookOrderItems) {
		this.bookOrderItems = bookOrderItems;
	}

}
