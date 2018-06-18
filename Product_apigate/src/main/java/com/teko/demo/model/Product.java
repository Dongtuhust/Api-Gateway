package com.teko.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="films")
public class Product {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="Id")
	private Integer id;
	
    @Column(name="SKU")
	private String sku;
	
    @Column(name="Title")
	private String title;
	
    @Column(name="Price")
	private int price;
	
    @Column(name="Category")
	private String category;
	
    @Column(name="CreateAt")
	private String createAt;
	
    @Column(name="modijedAt")
	private String modijedAt;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getCreateAt() {
		return createAt;
	}
	public void setCreateAt(String createAt) {
		this.createAt = createAt;
	}
	public String getModijedAt() {
		return modijedAt;
	}
	public void setModijedAt(String modijedAt) {
		this.modijedAt = modijedAt;
	}

	
}
