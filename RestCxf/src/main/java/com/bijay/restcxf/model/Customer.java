package com.bijay.restcxf.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Customer {

	public String name;
	public String phone;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

}
