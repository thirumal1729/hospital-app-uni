package com.ty.hospital_app.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Encounter {

	@Id
	private String Encounter_Id;
	private String diagonosis;
	private String chiefComplaint;
	private String consultDepartmentName;
	private boolean isSerious;
	
	@ManyToOne
	private Person person;
	
	@OneToMany
	private List<MedOrders> medOrders;

	public String getEncounter_Id() {
		return Encounter_Id;
	}

	public void setEncounter_Id(String encounter_Id) {
		Encounter_Id = encounter_Id;
	}

	public String getDiagonosis() {
		return diagonosis;
	}

	public void setDiagonosis(String diagonosis) {
		this.diagonosis = diagonosis;
	}

	public String getChiefComplaint() {
		return chiefComplaint;
	}

	public void setChiefComplaint(String chiefComplaint) {
		this.chiefComplaint = chiefComplaint;
	}

	public String getConsultDepartmentName() {
		return consultDepartmentName;
	}

	public void setConsultDepartmentName(String consultDepartmentName) {
		this.consultDepartmentName = consultDepartmentName;
	}

	public boolean isSerious() {
		return isSerious;
	}

	public void setSerious(boolean isSerious) {
		this.isSerious = isSerious;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public List<MedOrders> getOrders() {
		return medOrders;
	}

	public void setOrders(List<MedOrders> orders) {
		this.medOrders = orders;
	}
	
	
}
