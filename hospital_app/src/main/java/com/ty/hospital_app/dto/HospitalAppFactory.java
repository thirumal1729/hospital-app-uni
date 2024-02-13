package com.ty.hospital_app.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.ty.hospital_app.dao.EncounterDao;
import com.ty.hospital_app.entity.Address;
import com.ty.hospital_app.entity.Branch;
import com.ty.hospital_app.entity.Encounter;
import com.ty.hospital_app.entity.Hospital;
import com.ty.hospital_app.entity.Item;
import com.ty.hospital_app.entity.MedOrders;
import com.ty.hospital_app.entity.Person;

public class HospitalAppFactory {
	private static Scanner scan = new Scanner(System.in);
	
	public static Hospital getHospitalObject() {
		Hospital hospital = new Hospital();
		System.out.print("Enter the hospital id : ");
		String hospitalId = scan.next();
		System.out.print("Enter the hospital name : ");
		String hospitalName = scan.next();
		System.out.print("Enter the hospital specialization : ");
		String hospitalSpecialization = scan.next();
		System.out.print("Enter the hospital head office : ");
		String hospitalHeadOffice = scan.next();
		hospital.setHospital_Id(hospitalId);
		hospital.setHospital_Name(hospitalName);
		hospital.setHospital_Specialization(hospitalSpecialization);
		hospital.setHospital_head_office(hospitalHeadOffice);
		List<Branch> branches = new ArrayList<>();
		hospital.setHospital_Branches(branches);
		return hospital;
	}
	
	public static Branch getBranchObject() {
		Branch branch = new Branch();
		System.out.print("Enter the branch id : ");
		String branchId = scan.next();
		System.out.print("Enter the hospital branch name : ");
		String branchName = scan.next();
		System.out.print("Enter the brach phone number : ");
		long branchPhoneNumber = scan.nextLong();
		System.out.print("Enter the branch email : ");
		String branchEmail = scan.next();
		System.out.print("Enter the branch specialization : ");
		String branchSpecialization = scan.next();
		System.out.print("Enter the number of doctors : ");
		int numberOfDoctors = scan.nextInt();
		
		Address address = getAddressObject();
		List<Encounter> encounters = new ArrayList<Encounter>();
		
		branch.setBranch_Id(branchId);
		branch.setBranchName(branchName);
		branch.setBranchPhoneNumber(branchPhoneNumber);
		branch.setBranchEmail(branchEmail);
		branch.setBranchSpecialization(branchSpecialization);
		branch.setNumberOfDoctors(numberOfDoctors);
		branch.setAddress(address);
		branch.setEncounters(encounters);
		return branch;
	}
	
	public static Encounter getEncounterObject() {
		System.out.print("Enter the encounter id : ");
		String encounterId = scan.next();
		System.out.print("Enter the diagonosis : ");
		String diagonosis = scan.next();
		System.out.print("ChiefComplaint : ");
		String chiefComplaint = scan.next();
		System.out.print("ConsultantDepartmentName : ");
		String consultDepartmentName = scan.next();
		System.out.println("isSerious");
		boolean isSerious = scan.nextBoolean();
		Person person = new Person();
		List<MedOrders> medOrders = new ArrayList<MedOrders>();
		Encounter encounter = new Encounter();
		encounter.setEncounter_Id(encounterId);
		encounter.setDiagonosis(diagonosis);
		encounter.setChiefComplaint(chiefComplaint);
		encounter.setConsultDepartmentName(consultDepartmentName);
		encounter.setSerious(isSerious);
		encounter.setPerson(person);
		encounter.setOrders(medOrders);
		return encounter;
	}
	
	public static MedOrders getMedOrdersObject() {
		System.out.print("Enter the order id : ");
		String order_Id = scan.next();
		System.out.print("Enter prescribed doctor : ");
		String prescribedDoctor = scan.next();
		System.out.print("Enter order dosage : ");
		String orderDosage = scan.next();
		System.out.print("Enter order medication type: ");
		String orderMedicationType = scan.next();
		System.out.println("Enter isOrderCompleted");
		boolean isOrderCompleted = scan.nextBoolean();
		
		MedOrders medOrders = new MedOrders();
		List<Item> items = new ArrayList<>();
		System.out.print("Enter number of items : ");
		int noOfItems = scan.nextInt();
		for (int i = 0; i < noOfItems; i++) {
			items.add(getItemObject());
		}
		
		medOrders.setOrder_Id(order_Id);
		medOrders.setPrescribedDoctor(prescribedDoctor);
		medOrders.setOrderDosage(orderDosage);
		medOrders.setOrderMedicationType(orderMedicationType);
		medOrders.setItems(items);
		return medOrders;
	}
	
	
	public static Item getItemObject() {
		System.out.print("Enter the item id : ");
		String item_Id = scan.next();
		System.out.print("Enter item name : ");
		String item_Name = scan.next();
		System.out.print("Enter item manufacturer : ");
		String item_Manufacturer = scan.next();
		System.out.print("Enter item cost: ");
		double item_Cost = scan.nextDouble();
		System.out.println("Enter item quantity");
		String item_quantity = scan.next();
		
		Item item = new Item();
		item.setItem_Id(item_Id);
		item.setItem_Name(item_Name);
		item.setItem_Manufacturer(item_Manufacturer);
		item.setItem_Cost(item_Cost);
		item.setItem_quantity(item_quantity);
		
		return item;
	}
	
	public static Person getPersonObject() {
		System.out.print("Enter the person id : ");
		String person_Id = scan.next();
		System.out.print("Enter the person name : ");
		String person_Name = scan.next();
		System.out.print("Enter the person email : ");
		String person_email = scan.next();
		System.out.print("Enter the person phone number : ");
		long person_PhoneNumber = scan.nextLong();
		System.out.print("Enter the person age : ");
		int person_Age = scan.nextInt();
		System.out.print("Enter the person address : ");
		String person_Address = scan.next();
		System.out.print("Enter the person blood group : ");
		String person_BloodGroup = scan.next();
		
		Person person = new Person();
		person.setPerson_Id(person_Id);
		person.setPerson_Name(person_Name);
		person.setPerson_email(person_email);
		person.setPerson_PhoneNumber(person_PhoneNumber);
		person.setPerson_Age(person_Age);
		person.setPerson_Address(person_Address);
		person.setPerson_BloodGroup(person_BloodGroup);
		
		return person;
	}
	
	public static Address getAddressObject() {
		System.out.print("Enter the address id : ");
		String address_Id = scan.next();
		System.out.print("Enter the street name : ");
		String streetName = scan.next();
		System.out.print("Enter the city name : ");
		String cityName = scan.next();
		System.out.print("Enter the district name : ");
		String districtName = scan.next();
		System.out.print("Enter the state name : ");
		String stateName = scan.next();
		System.out.print("Enter the postal id : ");
		int postalCode = scan.nextInt();
		
		Address address = new Address();
		address.setAddress_Id(address_Id);
		address.setStreetName(streetName);
		address.setCityName(cityName);
		address.setDistrictName(districtName);
		address.setStateName(stateName);
		address.setPostalCode(postalCode);
		
		return address;
	}
	
//	public static void deleteBranch(String brachId, String hospitalId) {
//		Hospital hospital = EntityFactoryDto.entitManager.find(Hospital.class, hospitalId);
//		List<Branch> branches = hospital.getHospital_Branches();
//		String encounterId = null;
//		for (int i = 0; i < branches.size(); i++) {
//			Branch branch = branches.get(i);
//			if(branch.getBranch_Id().equals(brachId)) {
//				List<Encounter> encounters = branch.getEncounters();
//				for(int j=0; j<encounters.size(); j++) {
//					Encounter encounter = encounters.get(j);
//					encounters.remove(encounter);
//				}
//				branches.remove(branch);
//				branch.setEncounters(encounters);
//			}
//			hospital.setHospital_Branches(branches);
//			EntityFactoryDto.entityTransaction.begin();
//			EntityFactoryDto.entitManager.merge(branch);
//			EntityFactoryDto.entitManager.merge(hospital);
//			EntityFactoryDto.entityTransaction.commit();
//			
//			EncounterDao encounterDao = new EncounterDao();
//			encounterDao.removeEncounter();
//		}
//		
//	}
}
