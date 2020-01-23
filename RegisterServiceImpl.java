/**
 * 
 */
package com.blz.oops.service.impl;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.blz.oops.model.RegisterBean;
import com.blz.oops.service.RegisterService;

/**
 * @author chandrakala 
 *
 */
public class RegisterServiceImpl implements RegisterService{
	private String info;
	@Override
	public String saveInfo(RegisterBean bean) {
		BufferedReader br=null;
		FileReader fr=null;
		try {
			fr=new FileReader("/home/user/Documents/userInfo");
			br=new BufferedReader(fr);
			info=br.readLine();
			Pattern p=Pattern.compile("<<name>>");
			Matcher m=p.matcher(info);
			info=m.replaceAll(bean.getName());
			
			p=Pattern.compile("<<full name>>");
			m=p.matcher(info);
			info=m.replaceAll(bean.getFullName());
			
			p=Pattern.compile("91­xxxxxxxxxx");
			m=p.matcher(info);
			info=m.replaceAll(bean.getPhoneNum());
			
			p=Pattern.compile("01/01/2016");
			m=p.matcher(info);
			info=m.replaceAll(bean.getDate());
			br.close();
			
		}
		catch(Throwable e) {
			e.printStackTrace();
		}
		finally {
			if(br!=null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(fr!=null) {
				try {
					fr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return info;
	}
	@Override
	public void saveToFile(String info) {
		BufferedWriter bw=null;
		FileWriter fr=null;
		try{
			fr=new FileWriter("/home/user/Documents/userRegister");
			bw=new BufferedWriter(fr);
			bw.append(info);
			bw.flush();
		}
		catch(Throwable t) {
			t.printStackTrace();
		}
		finally {
			if(bw!=null) {
				try {
					bw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(fr!=null) {
				try {
					fr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
