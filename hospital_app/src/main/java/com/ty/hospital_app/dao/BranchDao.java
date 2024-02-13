package com.ty.hospital_app.dao;

import java.util.List;

import com.ty.hospital_app.dto.EntityFactoryDto;
import com.ty.hospital_app.entity.Branch;
import com.ty.hospital_app.entity.Hospital;

public class BranchDao {

	// save branch
	public Branch saveBranch(Branch branch, String hospitalId) {
		if(EntityFactoryDto.entitManager.find(Hospital.class, hospitalId) != null && branch != null) {
			Hospital hospital = EntityFactoryDto.entitManager.find(Hospital.class, hospitalId);
			List<Branch> branches = hospital.getHospital_Branches();
			AddressDao addressDao = new AddressDao();
			addressDao.saveAddress(branch.getAddress());
			EntityFactoryDto.entityTransaction.begin();
			EntityFactoryDto.entitManager.persist(branch);
			branches.add(branch);
			hospital.setHospital_Branches(branches);
			EntityFactoryDto.entitManager.merge(hospital);
			EntityFactoryDto.entityTransaction.commit();

		}
		
		return branch;
	}
	
	// find branch
	public Branch findBranch(String branchId) {
		return EntityFactoryDto.entitManager.find(Branch.class, branchId);
	}

	// update branch
	public Branch updatePerson(String branchId, Branch branch) {
		if (branchId.equalsIgnoreCase(branch.getBranch_Id()) && branch != null) {
			EntityFactoryDto.entityTransaction.begin();
			EntityFactoryDto.entitManager.merge(branch);
			EntityFactoryDto.entityTransaction.commit();
		}
		return branch;
	}

	// remove person
	public boolean removeBranch(String branchId) {

		if (branchId != null) {
			Branch branch = findBranch(branchId);
			EntityFactoryDto.entityTransaction.begin();
			EntityFactoryDto.entitManager.remove(branch);
			EntityFactoryDto.entityTransaction.commit();
			return true;
		}
		return false;
	}
}
