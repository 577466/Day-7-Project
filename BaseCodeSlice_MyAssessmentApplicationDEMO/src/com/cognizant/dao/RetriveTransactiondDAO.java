/*package com.cognizant.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.entity.TransactionDetails;
import com.cognizant.entity.User;

@Component
public class RetriveTransactiondDAO {
	
	 @PersistenceContext
	  private EntityManager em;
	 	
	@Transactional

	public List<TransactionDetails> retrieveTransactionDetails(Long i) 
	
	{
		User retrive=em.find(User.class,i);
		
		System.out.println(retrive);
		System.out.println(retrive.getTransactions());
		return null;
	}

}*/


