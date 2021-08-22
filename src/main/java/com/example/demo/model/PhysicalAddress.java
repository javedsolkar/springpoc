package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "mmst_phyaddress")
public class PhysicalAddress {

	@Column(name = "mmst_phyaddress_id")
	@Id
	private String id;

	@Column(name = "sname")
	private String name;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
