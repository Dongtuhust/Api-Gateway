package com.javainuse.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModelProperty;

@Entity
@Table(name="films")
public class Film {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @ApiModelProperty(notes = "The database generated film ID")
    @Column(name="Id")
	private Integer id;
	
	@ApiModelProperty(notes = "The SKU of film")
    @Column(name="SKU")
	private String sku;
	
	@ApiModelProperty(notes = "The title of film")
    @Column(name="Title")
	private String title;
	
	@ApiModelProperty(notes = "The price of film")
    @Column(name="Price")
	private int price;
	
	@ApiModelProperty(notes = "The category of film")
    @Column(name="Category")
	private String category;
	
	@ApiModelProperty(notes = "The createday of film")
    @Column(name="CreateAt")
	private String createAt;
	
	@ApiModelProperty(notes = "The updateday of film")
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