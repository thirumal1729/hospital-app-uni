package com.ty.hospital_app.dao;

import java.util.List;

import com.ty.hospital_app.dto.EntityFactoryDto;
import com.ty.hospital_app.entity.Branch;
import com.ty.hospital_app.entity.Encounter;
import com.ty.hospital_app.entity.Person;

public class EncounterDao {

	// save encounter
	public Encounter saveEncounter(Encounter encounter, String branchId, String personId) {
		Branch branch = EntityFactoryDto.entitManager.find(Branch.class, branchId);
		Person person = EntityFactoryDto.entitManager.find(Person.class, personId);
		if(encounter!=null && branch!=null && person!=null) {
			encounter.setPerson(person);
			List<Encounter> encounters = branch.getEncounters();
			EntityFactoryDto.entityTransaction.begin();
			EntityFactoryDto.entitManager.persist(encounter);
			encounters.add(encounter);
			branch.setEncounters(encounters);
			EntityFactoryDto.entitManager.merge(branch);
			EntityFactoryDto.entityTransaction.commit();
		}
		return encounter;
	}
	
	// find encounter
	public Encounter findEncounter(String encounterId) {
		return EntityFactoryDto.entitManager.find(Encounter.class, encounterId);
	}

	// remove encounter
	public boolean removeEncounter(String encounterId) {

		if (encounterId != null) {
			Encounter encounter = findEncounter(encounterId);
			EntityFactoryDto.entityTransaction.begin();
			EntityFactoryDto.entitManager.remove(encounter);
			EntityFactoryDto.entityTransaction.commit();
			return true;
		}
		return false;
	}
}
