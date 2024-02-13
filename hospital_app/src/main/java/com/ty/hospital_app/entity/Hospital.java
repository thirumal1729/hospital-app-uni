package com.ty.hospital_app.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Hospital {

	@Id
	private String hospital_Id;
	private String hospital_Name;
	private String hospital_Specialization;
	private String hospital_head_office;
	
	@OneToMany
	private List<Branch> hospital_Branches;

	public String getHospital_Id() {
		return hospital_Id;
	}

	public void setHospital_Id(String hospital_Id) {
		this.hospital_Id = hospital_Id;
	}

	public String getHospital_Name() {
		return hospital_Name;
	}

	public void setHospital_Name(String hospital_Name) {
		this.hospital_Name = hospital_Name;
	}

	public String getHospital_Specialization() {
		return hospital_Specialization;
	}

	public void setHospital_Specialization(String hospital_Specialization) {
		this.hospital_Specialization = hospital_Specialization;
	}

	public String getHospital_head_office() {
		return hospital_head_office;
	}

	public void setHospital_head_office(String hospital_head_office) {
		this.hospital_head_office = hospital_head_office;
	}

	public List<Branch> getHospital_Branches() {
		return hospital_Branches;
	}

	public void setHospital_Branches(List<Branch> hospital_Branches) {
		this.hospital_Branches = hospital_Branches;
	}
	
	
}
