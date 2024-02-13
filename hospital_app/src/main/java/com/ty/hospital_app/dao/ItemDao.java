package com.ty.hospital_app.dao;

import com.ty.hospital_app.dto.EntityFactoryDto;
import com.ty.hospital_app.entity.Item;

public class ItemDao {

	// save item
	public Item saveItem(Item item) {
		
		if(item != null) {
			EntityFactoryDto.entityTransaction.begin();
			EntityFactoryDto.entitManager.persist(item);
			EntityFactoryDto.entityTransaction.commit();
		}
		
		return item;
	}
	
	// find item
	public Item findItem(String itemId) {
		return EntityFactoryDto.entitManager.find(Item.class, itemId);
	}
	
	// update item
	public Item updatePerson(String itemId, Item item) {
		if(itemId.equalsIgnoreCase(item.getItem_Id()) && item != null) {
			EntityFactoryDto.entityTransaction.begin();
			EntityFactoryDto.entitManager.merge(item);
			EntityFactoryDto.entityTransaction.commit();
		}
		return item;
	}
	
	// remove item
	public boolean removeItem(String itemId) {
		
		if(itemId != null) {
			Item item = findItem(itemId);
			EntityFactoryDto.entityTransaction.begin();
			EntityFactoryDto.entitManager.remove(item);
			EntityFactoryDto.entityTransaction.commit();
			return true;
		}
		return false;
	}
}
