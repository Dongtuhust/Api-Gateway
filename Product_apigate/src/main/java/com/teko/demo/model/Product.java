package com.teko.demo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="product")
public class Product {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
	
    @Column(name="CreatedAt")
	private String createAt;
	
    @Column(name="modifiedAt")
	private Date modijedAt;
    
    @Column(name="Attbute")
	private String attibute;
	
    @Column(name="Brand")
	private String brand;
    
    public Product() {};
    public Product(String sku, String title, int price, String category, Date modijedAt,
			String attibute, String brand) {
		super();
		this.sku = sku;
		this.title = title;
		this.price = price;
		this.category = category;
		this.modijedAt = modijedAt;
		this.attibute = attibute;
		this.brand = brand;
	}
	public String getAttibute() {
		return attibute;
	}
	public void setAttibute(String attibute) {
		this.attibute = attibute;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
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
	public Date getModijedAt() {
		return modijedAt;
	}
	public void setModijedAt(Date today) {
		this.modijedAt = today;
	}

	
}
