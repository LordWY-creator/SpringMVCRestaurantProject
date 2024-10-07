package com.Spring.model;

import java.sql.Timestamp;
import java.util.Date;

public class BookingBean {
	private int id;
	private int customer_id;
	private int reserve_table_id;
	private Date booking_date;
	private Timestamp booking_time;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public int getReserve_table_id() {
		return reserve_table_id;
	}
	public void setReserve_table_id(int reserve_table_id) {
		this.reserve_table_id = reserve_table_id;
	}
	public Date getBooking_date() {
		return booking_date;
	}
	public void setBooking_date(Date booking_date) {
		this.booking_date = booking_date;
	}
	public Timestamp getBooking_time() {
		return booking_time;
	}
	public void setBooking_time(Timestamp booking_time) {
		this.booking_time = booking_time;
	}

}
