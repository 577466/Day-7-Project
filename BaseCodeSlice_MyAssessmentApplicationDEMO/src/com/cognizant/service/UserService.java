package com.cognizant.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cognizant.dao.PerformTransactionDAO;
import com.cognizant.dao.UserDetailsDAO;
import com.cognizant.entity.TransactionDetails;
import com.cognizant.entity.User;


@Component
public class UserService {

	@Autowired
	UserDetailsDAO uDAO;
	
	public void addUsers(List<User> users) throws Exception {
		
		for(User tod: users)
		{
			uDAO.addUsers(tod);
		
		//return null;
		
		}

}
}