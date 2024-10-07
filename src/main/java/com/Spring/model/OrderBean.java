package com.Spring.model;

import java.util.Date;

public class OrderBean {
	private int id;
	private int quantity;
	private Date order_date;
	private String order_destination;
	private String ph_no;
	private Double total_price;
	private int drink_id;
	private int desert_id;
	private int myanmar_food_id;
	private int chinese_food_id;
	private int indian_food_id;
	private boolean order_status;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Date getOrder_date() {
		return order_date;
	}
	public void setOrder_date(Date order_date) {
		this.order_date = order_date;
	}
	public String getOrder_destination() {
		return order_destination;
	}
	public void setOrder_destination(String order_destination) {
		this.order_destination = order_destination;
	}
	public String getPh_no() {
		return ph_no;
	}
	public void setPh_no(String ph_no) {
		this.ph_no = ph_no;
	}
	public Double getTotal_price() {
		return total_price;
	}
	public void setTotal_price(Double total_price) {
		this.total_price = total_price;
	}
	public int getDrink_id() {
		return drink_id;
	}
	public void setDrink_id(int drink_id) {
		this.drink_id = drink_id;
	}
	public int getDesert_id() {
		return desert_id;
	}
	public void setDesert_id(int desert_id) {
		this.desert_id = desert_id;
	}
	public int getMyanmar_food_id() {
		return myanmar_food_id;
	}
	public void setMyanmar_food_id(int myanmar_food_id) {
		this.myanmar_food_id = myanmar_food_id;
	}
	public int getChinese_food_id() {
		return chinese_food_id;
	}
	public void setChinese_food_id(int chinese_food_id) {
		this.chinese_food_id = chinese_food_id;
	}
	public int getIndian_food_id() {
		return indian_food_id;
	}
	public void setIndian_food_id(int indian_food_id) {
		this.indian_food_id = indian_food_id;
	}
	public boolean isOrder_status() {
		return order_status;
	}
	public void setOrder_status(boolean order_status) {
		this.order_status = order_status;
	}
	
	
}
