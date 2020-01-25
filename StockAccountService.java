/**
 * 
 */
package com.blz.oops.service;

/**
 * @author Chandrakala Kirasur
 *
 */
public interface StockAccountService {
public void createAccount(String file);
public String valueOf();
public void buyStock(int amount,String symbol);
public void sell(int amount,String symbol);
public String printReport();
}
