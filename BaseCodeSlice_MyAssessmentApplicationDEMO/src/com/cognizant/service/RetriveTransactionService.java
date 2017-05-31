/*package com.cognizant.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cognizant.dao.RetriveTransactiondDAO;
import com.cognizant.entity.TransactionDetails;
@Component
public class RetriveTransactionService

{
	@Autowired
	RetriveTransactiondDAO rtDao;
	private List<TransactionDetails> tdList=new ArrayList<TransactionDetails>();
	
	public List<TransactionDetails>retrieveTransactionDetails(Long i)
	{
		tdList=rtDao.retrieveTransactionDetails(i);
		return tdList;
		
	}
	
}*/
