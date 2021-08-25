package com.s2.price.model;



import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Document (collection = "stocks")
public class Stocks {
	@Id
    private int id;
    
	private String name;
    private String date;
    private int price;
    
    @Override
	public String toString() {
		return "Stocks [id=" + id + ", name=" + name + ", date=" + date + ", price=" + price + "]";
	}
	/*public int getId() {
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
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}*/
    
}
