package com.saraya.model;
public class Laptop {
	private String user;
	private int id;
	private String bench;
	private String model;
	private String description;
	private int price;
	private String picture;
	
	
	public Laptop() {
		super();
	}

	public Laptop( int id, String bench, String model, String description, int price, String picture) {
		super();
		this.id = id;
		this.bench = bench;
		this.model = model;
		this.description = description;
		this.price = price;
		this.picture = picture;
	}
	
	public Laptop(String user, int id, String bench, String model, String description, int price, String picture) {
		super();
		this.user = user;
		this.id = id;
		this.bench = bench;
		this.model = model;
		this.description = description;
		this.price = price;
		this.picture = picture;
	}

	/**
	 * @return the user
	 */
	public String getUser() {
		return user;
	}
	/**
	 * @param user the user to set
	 */
	public void setUser(String user) {
		this.user = user;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the bench
	 */
	public String getBench() {
		return bench;
	}
	/**
	 * @param bench the bench to set
	 */
	public void setBench(String bench) {
		this.bench = bench;
	}
	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}
	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}
	/**
	 * @return the picture
	 */
	public String getPicture() {
		return picture;
	}
	/**
	 * @param picture the picture to set
	 */
	public void setPicture(String picture) {
		this.picture = picture;
	}
	
	
	
}
