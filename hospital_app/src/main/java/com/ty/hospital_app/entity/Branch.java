package com.ty.hospital_app.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Branch {

	@Id
	private String branch_Id;
	private String branchName;
	private long branchPhoneNumber;
	private String branchEmail;
	private String branchSpecialization;
	private int numberOfDoctors;
	
	@OneToOne
	private Address address;
	
	@OneToMany
	private List<Encounter> encounters;

	public String getBranch_Id() {
		return branch_Id;
	}

	public void setBranch_Id(String branch_Id) {
		this.branch_Id = branch_Id;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public long getBranchPhoneNumber() {
		return branchPhoneNumber;
	}

	public void setBranchPhoneNumber(long branchPhoneNumber) {
		this.branchPhoneNumber = branchPhoneNumber;
	}

	public String getBranchEmail() {
		return branchEmail;
	}

	public void setBranchEmail(String branchEmail) {
		this.branchEmail = branchEmail;
	}

	public String getBranchSpecialization() {
		return branchSpecialization;
	}

	public void setBranchSpecialization(String branchSpecialization) {
		this.branchSpecialization = branchSpecialization;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Encounter> getEncounters() {
		return encounters;
	}

	public void setEncounters(List<Encounter> encounters) {
		this.encounters = encounters;
	}

	public int getNumberOfDoctors() {
		return numberOfDoctors;
	}

	public void setNumberOfDoctors(int numberOfDoctors) {
		this.numberOfDoctors = numberOfDoctors;
	}
	
	
}
