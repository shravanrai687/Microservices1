package com.s2.price.model;


import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;




@Document(collection = "stock")
public class Stock {

	@Transient
	public static final String  SEQUENCE_NAME = "user_sequence";
	
	@Id
	 private int id;
	    private int companyId;
		private String name;
		 @DateTimeFormat(pattern = "yyyy-MM-dd")
	    private Date date;
	    private int price;
	    
	    public int getCompanyId() {
			return companyId;
		}
		public void setCompanyId(int companyId) {
			this.companyId = companyId;
		}
		public Stock() {
			super();
		}
		public Stock(int id,int companyId, String name, Date date, int price) {
			super();
			this.id=id;
			this.companyId=companyId;
			this.name = name;
			this.date = date;
			this.price = price;
		}
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
		public Date getDate() {
			return date;
		}
		public void setDate(Date date) {
			this.date = date;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		@Override
		public String toString() {
			return "Stock [companyId=" + companyId + ", name=" + name + ", date=" + date + ", price=" + price + "]";
		}
	    
}
