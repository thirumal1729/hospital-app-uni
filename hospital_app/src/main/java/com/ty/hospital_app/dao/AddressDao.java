package com.ty.hospital_app.dao;

import com.ty.hospital_app.dto.EntityFactoryDto;
import com.ty.hospital_app.entity.Address;

public class AddressDao {

	// save address
	public Address saveAddress(Address address) {
		if(address != null) {
			EntityFactoryDto.entityTransaction.begin();
			EntityFactoryDto.entitManager.persist(address);
			EntityFactoryDto.entityTransaction.commit();
		}
		
		return address;
	}
	
	// find address
	public Address findAddress(String addressId) {
		return EntityFactoryDto.entitManager.find(Address.class, addressId);
	}
	
	// update person
	public Address updateAddress(String personId, Address address) {
		if(personId.equalsIgnoreCase(address.getAddress_Id()) && address != null) {
			EntityFactoryDto.entityTransaction.begin();
			EntityFactoryDto.entitManager.merge(address);
			EntityFactoryDto.entityTransaction.commit();
		}
		return address;
	}
	
	// remove person
	public boolean removeAddress(String addressId) {
		
		if(addressId != null) {
			Address item = findAddress(addressId);
			EntityFactoryDto.entityTransaction.begin();
			EntityFactoryDto.entitManager.remove(item);
			EntityFactoryDto.entityTransaction.commit();
			return true;
		}
		return false;
	}
}
