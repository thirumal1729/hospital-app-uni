package com.ty.hospital_app.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Item {

	@Id
	private String item_Id;
	private String item_Name;
	private String item_Manufacturer;
	private double item_Cost;
	private String item_quantity;
	public String getItem_Id() {
		return item_Id;
	}
	public void setItem_Id(String item_Id) {
		this.item_Id = item_Id;
	}
	public String getItem_Name() {
		return item_Name;
	}
	public void setItem_Name(String item_Name) {
		this.item_Name = item_Name;
	}
	public String getItem_Manufacturer() {
		return item_Manufacturer;
	}
	public void setItem_Manufacturer(String item_Manufacturer) {
		this.item_Manufacturer = item_Manufacturer;
	}
	public double getItem_Cost() {
		return item_Cost;
	}
	public void setItem_Cost(double item_Cost) {
		this.item_Cost = item_Cost;
	}
	public String getItem_quantity() {
		return item_quantity;
	}
	public void setItem_quantity(String item_quantity) {
		this.item_quantity = item_quantity;
	}
	
	
}
