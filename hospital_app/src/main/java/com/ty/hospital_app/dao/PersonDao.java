package com.ty.hospital_app.dao;

import com.ty.hospital_app.dto.EntityFactoryDto;
import com.ty.hospital_app.entity.Person;

public class PersonDao {
	
	public Person savePerson(Person person) {
		
		if(person != null) {
			EntityFactoryDto.entityTransaction.begin();
			EntityFactoryDto.entitManager.persist(person);
			EntityFactoryDto.entityTransaction.commit();
		}
		
		return person;
	}
	
	// find person
	public Person findPerson(String personId) {
		return EntityFactoryDto.entitManager.find(Person.class, personId);
	}
	
	// update person
	public Person updatePerson(String personId, Person person) {
		if(personId.equalsIgnoreCase(person.getPerson_Id()) && person != null) {
			EntityFactoryDto.entityTransaction.begin();
			EntityFactoryDto.entitManager.merge(person);
			EntityFactoryDto.entityTransaction.commit();
		}
		return person;
	}
	
	// remove person
	public boolean removePerson(String personId) {
		
		if(personId != null) {
			Person item = findPerson(personId);
			EntityFactoryDto.entityTransaction.begin();
			EntityFactoryDto.entitManager.remove(item);
			EntityFactoryDto.entityTransaction.commit();
			return true;
		}
		return false;
	}
}
