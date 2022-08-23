package com.BikkadIT.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BikkadIT.Entity.Contact;
import com.BikkadIT.Repositery.ContactRepositery;
@Service
public class ServiceImpI implements ServiceI{

	@Autowired
	private ContactRepositery contactRepositery;

	@Override
	public boolean savedata(Contact contact) {
		
		Contact save = contactRepositery.save(contact);
		
		if(save!=null) {
			return true;
			
		}
		return false;
	}
	
	
	
	
	
	
}
