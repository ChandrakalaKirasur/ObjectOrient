/**
 * 
 */
package com.blz.oops.service;

import com.blz.oops.model.Stock;

/**
 * @author user
 *
 */
public interface StockService {
	public void saveToJson(Stock stock);
	public String getTotalStock(int stocks);
}
