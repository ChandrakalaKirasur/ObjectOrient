/**
 * 
 */
package com.blz.oops.service;

import com.blz.oops.model.PersonBean;

/**
 * @author chandrakala
 *
 */
public interface AddresssBookService {
	public void saveToFile(PersonBean person);
	public String getNames();
	public String editInfo(String name,PersonBean person);
	public String deleteInfo(String mname);
}
