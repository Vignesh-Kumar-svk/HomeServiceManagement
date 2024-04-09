package com.example.homeservices.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	private String fullname;
	private String password;
	@Column(nullable=false,unique=true)
	private String email;
	private String currentaddress;
	private String deliveryaddress;
	private String containerreq;
	private Integer days;
	private String servicerequired;
	private String phonenumber;
	private String gender;
	
	public Customer() {
		
	}
	public Customer(Long id, String fullname, String password, String currentaddress, String containerreq,String phonenumber, String gender, String servicerequired, Integer days, String deliveryaddress, String email) {
		super();
		this.id = id;
		this.fullname = fullname;
		this.password = password;
		this.email=email;
		this.currentaddress = currentaddress;
		this.deliveryaddress=deliveryaddress;
		this.containerreq= containerreq;
		this.days = days;
		this.servicerequired= servicerequired;
		this.phonenumber = phonenumber;
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getCurrentaddress() {
		return currentaddress;
	}
	public void setCurrentaddress(String currentaddress) {
		this.currentaddress = currentaddress;
	}
	public String getContainerreq() {
		return containerreq;
	}
	public void setContainerreq(String containerreq) {
		this.containerreq = containerreq;
	}
	public Integer getDays() {
		return days;
	}
	public void setDays(Integer days) {
		this.days = days;
	}
	public String getServicerequired() {
		return servicerequired;
	}
	public void setServicerequired(String servicerequired) {
		this.servicerequired = servicerequired;
	}
	public String getDeliveryaddress() {
		return deliveryaddress;
	}
	public void setDeliveryaddress(String deliveryaddress) {
		this.deliveryaddress = deliveryaddress;
	}
	
	
}
