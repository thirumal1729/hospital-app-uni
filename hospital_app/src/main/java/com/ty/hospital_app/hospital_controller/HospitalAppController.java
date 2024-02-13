package com.ty.hospital_app.hospital_controller;

import com.ty.hospital_app.dao.BranchDao;
import com.ty.hospital_app.dao.EncounterDao;
import com.ty.hospital_app.dao.HospitalDao;
import com.ty.hospital_app.dao.MedOrdersDao;
import com.ty.hospital_app.dao.PersonDao;
import com.ty.hospital_app.dto.HospitalAppFactory;
import com.ty.hospital_app.entity.MedOrders;

public class HospitalAppController {
	public static void main(String[] args) {
		
		HospitalAppFactory hospitalAppFactory = new HospitalAppFactory();
//		HospitalDao hospitalDao = new HospitalDao();
//		hospitalDao.saveHospital(hospitalAppFactory.getHospitalObject());
//		
//		BranchDao branchDao = new BranchDao();
//		branchDao.saveBranch(hospitalAppFactory.getBranchObject(), "101");
		
//		PersonDao personDao = new PersonDao();
//		personDao.savePerson(hospitalAppFactory.getPersonObject());
		
//		EncounterDao encounterDao = new EncounterDao();
//		encounterDao.saveEncounter(hospitalAppFactory.getEncounterObject(), "b101", "p101");
		
		MedOrdersDao medOrdersDao =new MedOrdersDao();
		medOrdersDao.saveMedOrders(hospitalAppFactory.getMedOrdersObject(), "e101");
		
		
		
		
	}
	
	
}
