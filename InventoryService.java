package com.blz.oops.service;

import com.blz.oops.model.InventoryBean;

public interface InventoryService {

	public void writeToFile(InventoryBean bean,String word);
	public int[] readFromFile(int[] total);
	public int getTotalPrice(int[] total);
}
