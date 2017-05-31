package com.cognizant.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.entity.User;



	
	@Component
	public class ViewTransactionDao 
	{
		 @PersistenceContext
		    private EntityManager em;

		
		
	
	
		
}
