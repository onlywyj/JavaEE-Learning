package com.wyj.domain;

public class Book {
	
	private String id;  
	private String bookname;  
	private String author;  
	private String publishHouse;  
	private String price;  
	private String nums;  //该书的库存量  
	private int buyNums=1;  //已经购买的数量
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublishHouse() {
		return publishHouse;
	}
	public void setPublishHouse(String publishHouse) {
		this.publishHouse = publishHouse;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getNums() {
		return nums;
	}
	public void setNums(String nums) {
		this.nums = nums;
	}
	public int getBuyNums() {
		return buyNums;
	}
	public void setBuyNums(int buyNums) {
		this.buyNums = buyNums;
	}
	
}
