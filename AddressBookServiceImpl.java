/**
 * 
 */
package com.blz.oops.service.impl;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Set;
import java.util.TreeSet;

import com.blz.oops.model.PersonBean;
import com.blz.oops.service.AddresssBookService;

/**
 * @author user
 *
 */
public class AddressBookServiceImpl implements AddresssBookService {
	private String addrList="";
	@Override
	public void saveToFile(PersonBean person) {
		BufferedWriter bw=null;
		FileWriter fr=null;
		try{
			fr=new FileWriter("/home/user/Documents/userRegister");
			bw=new BufferedWriter(fr);
			addrList +=person.toString()+"\n";
			bw.append(addrList);
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
	@Override
	public String getNames() {
		String names="";
		BufferedReader br=null;
		FileReader fr=null;
		try{
			fr=new FileReader("/home/user/Documents/userRegister");
			br=new BufferedReader(fr);
			String line;
			while((line=br.readLine())!=null) {
				String[] s=line.split(" ");
				names +=s[1]+"\n";
			}
			
		}
		catch(Throwable t) {
			t.printStackTrace();
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
		}return names;
	}
	@Override
	public String editInfo(String mname,PersonBean person) {
		BufferedReader br=null;String s="";
		FileReader fr=null;
		BufferedWriter bw=null;
		try{
			fr=new FileReader("/home/user/Documents/userRegister");
			br=new BufferedReader(fr);
			String line;
			while((line=br.readLine())!=null) {
				String[] words=line.split(" ");
				if(words[1].equals(mname)) {
					System.out.println("true");
					s +=person+"\n";
				}
				else
				{
					s +=line+"\n";
				}
			}
			br.close();
			bw=new BufferedWriter(new FileWriter("/home/user/Documents/userRegister"));
			bw.append(s);
			bw.close();
		}
		catch(Throwable t) {
			t.printStackTrace();
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
			if(bw!=null) {
				try {
					bw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
		}
		return s;
	}
	@Override
	public String deleteInfo(String mname) {
		BufferedReader br=null;String s="";
		FileReader fr=null;
		BufferedWriter bw=null;
		try{
			fr=new FileReader("/home/user/Documents/userRegister");
			br=new BufferedReader(fr);
			String line;
			while((line=br.readLine())!=null) {
				String[] words=line.split(" ");
				if(!(words[1].equals(mname))) {
					s +=line+"\n";
				}
			}
			br.close();
			bw=new BufferedWriter(new FileWriter("/home/user/Documents/userRegister"));
			bw.append(s);
			bw.close();
		}
		catch(Throwable t) {
			t.printStackTrace();
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
			if(bw!=null) {
				try {
					bw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
		}
		return s;
	}

}
