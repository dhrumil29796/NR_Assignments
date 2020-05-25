package com.lti.freemarker.smooks.model;

import java.time.LocalDate;

/**
 * @author Dhrumil Shah
 * @version 1.0
 * @since 2020-05-25
 */
public class Book {

	private String bookName;
	private int bookPrice;
	private String authorName;
	private String publisherName;
	private LocalDate orderBookingDate;
	private String bookOrderId;
	private LocalDate deliveryDate;
	private LocalDate dispatchDate;

	public Book() {
	}

	public Book(String bookName, int bookPrice, String authorName, String publisherName, LocalDate orderBookingDate) {
		super();
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		this.authorName = authorName;
		this.publisherName = publisherName;
		this.orderBookingDate = orderBookingDate;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public double getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getPublisherName() {
		return publisherName;
	}

	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}

	public LocalDate getOrderBookingDate() {
		return orderBookingDate;
	}

	public void setOrderBookingDate(LocalDate orderBookingDate) {
		this.orderBookingDate = orderBookingDate;
	}

	public Book(String bookName, int bookPrice, String authorName, String publisherName, LocalDate orderBookingDate,
			String bookOrderId, LocalDate deliveryDate, LocalDate dispatchDate) {
		super();
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		this.authorName = authorName;
		this.publisherName = publisherName;
		this.orderBookingDate = orderBookingDate;
		this.bookOrderId = bookOrderId;
		this.deliveryDate = deliveryDate;
		this.dispatchDate = dispatchDate;
	}

	public String getBookOrderId() {
		return bookOrderId;
	}

	public void setBookOrderId(String bookOrderId) {
		this.bookOrderId = bookOrderId;
	}

	public LocalDate getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(LocalDate deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public LocalDate getDispatchDate() {
		return dispatchDate;
	}

	public void setDispatchDate(LocalDate dispatchDate) {
		this.dispatchDate = dispatchDate;
	}

}