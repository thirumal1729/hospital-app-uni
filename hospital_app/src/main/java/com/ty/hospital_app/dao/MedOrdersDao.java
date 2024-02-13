package com.ty.hospital_app.dao;

import java.util.List;

import com.ty.hospital_app.dto.EntityFactoryDto;
import com.ty.hospital_app.entity.Encounter;
import com.ty.hospital_app.entity.Item;
import com.ty.hospital_app.entity.MedOrders;

public class MedOrdersDao {

	// save med orders
	public MedOrders saveMedOrders(MedOrders orders, String encounterId) {
		Encounter encounter = EntityFactoryDto.entitManager.find(Encounter.class, encounterId);
		if(orders != null && encounter != null) {
			List<MedOrders> medOrders = encounter.getOrders();
			ItemDao itemDao = new ItemDao();
			List<Item> items1 = orders.getItems();
			for(int i=0; i<items1.size(); i++) {
				itemDao.saveItem(items1.get(i));
			}
			EntityFactoryDto.entityTransaction.begin();
			EntityFactoryDto.entitManager.persist(orders);
			List<Item> items = orders.getItems();
			for (Item item : items) {
				if(EntityFactoryDto.entitManager.find(Item.class, item.getItem_Id()) == null) {
					itemDao.saveItem(item);
				}
			}
			medOrders.add(orders);
			encounter.setOrders(medOrders);
			EntityFactoryDto.entitManager.merge(encounter);
			EntityFactoryDto.entityTransaction.commit();
		}
		return orders;
	}
	
	// find med order
	public MedOrders findOrder(String orderId) {
		return EntityFactoryDto.entitManager.find(MedOrders.class, orderId);
	}
	
	// remove med order
	public boolean removeMedOrder(String orderId) {

		if (orderId != null) {
			MedOrders order = findOrder(orderId);
			EntityFactoryDto.entityTransaction.begin();
			EntityFactoryDto.entitManager.remove(order);
			EntityFactoryDto.entityTransaction.commit();
			return true;
		}
		return false;
	}
}
