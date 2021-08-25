package com.s2.company.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Company {
	

@GeneratedValue(strategy = GenerationType.IDENTITY)
@Id
private int id;
private String name;
private String sector;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSector() {
	return sector;
}
public void setSector(String sector) {
	this.sector = sector;
}
@Override
public String toString() {
	return "Company [id=" + id + ", name=" + name + ", sector=" + sector + "]";
}




}
