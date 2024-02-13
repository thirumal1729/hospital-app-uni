package com.ty.hospital_app.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class MedOrders {

	@Id
	private String order_Id;
	private String prescribedDoctor;
	private String orderDosage;
	private String orderMedicationType;
	private boolean isOrderCompleted;
	
	@ManyToMany
	private List<Item> items;

	public String getOrder_Id() {
		return order_Id;
	}

	public void setOrder_Id(String order_Id) {
		this.order_Id = order_Id;
	}

	public String getPrescribedDoctor() {
		return prescribedDoctor;
	}

	public void setPrescribedDoctor(String prescribedDoctor) {
		this.prescribedDoctor = prescribedDoctor;
	}

	public String getOrderDosage() {
		return orderDosage;
	}

	public void setOrderDosage(String orderDosage) {
		this.orderDosage = orderDosage;
	}

	public String getOrderMedicationType() {
		return orderMedicationType;
	}

	public void setOrderMedicationType(String orderMedicationType) {
		this.orderMedicationType = orderMedicationType;
	}

	public boolean isOrderCompleted() {
		return isOrderCompleted;
	}

	public void setOrderCompleted(boolean isOrderCompleted) {
		this.isOrderCompleted = isOrderCompleted;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}
	
	
}
