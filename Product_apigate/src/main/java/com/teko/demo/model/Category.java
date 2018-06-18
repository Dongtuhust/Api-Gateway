package com.teko.demo.model;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="category")
public class Category {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
	private Integer id;
	
    @Column(name="name")
	private String name;
    
    @Column(name="createdAt")
   	private String createAt;
    
    @Column(name="modifiedAt")
   	private Date modijedAt;
   	public Category() {}
    public Category(Integer id, String name, String createAt, Date modijedAt) {
		super();
		this.id = id;
		this.name = name;
		this.createAt = createAt;
		this.modijedAt = modijedAt;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
