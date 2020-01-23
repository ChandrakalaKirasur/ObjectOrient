/**
 * 
 */
package com.blz.oops.service;

import com.blz.oops.model.RegisterBean;

/**
 * @author chandrakala kirasur
 *
 */
public interface RegisterService {

	public String saveInfo(RegisterBean bean);
	public void saveToFile(String info);
}
