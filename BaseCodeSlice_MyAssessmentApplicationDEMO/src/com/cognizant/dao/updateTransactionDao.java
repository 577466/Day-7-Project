package com.cognizant.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

import com.cognizant.entity.TransactionDetails;

public class updateTransactionDao


{
	@PersistenceContext
	  private EntityManager em;
	 	
	@Transactional
	public void updateTransactionDetails(TransactionDetails trans,Long AccountNumber)
	{
		
	}
	
}
