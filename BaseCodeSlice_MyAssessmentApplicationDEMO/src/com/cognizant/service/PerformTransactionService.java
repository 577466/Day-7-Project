


package com.cognizant.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.dao.PerformTransactionDAO;
import com.cognizant.entity.TransactionDetails;
import com.cognizant.entity.User;
@Component
public class PerformTransactionService {
	@Autowired
	PerformTransactionDAO ptDao;
	public void addUserDetails(User u) {
		System.out.println("in service");
		ptDao.addUserDetails(u);
		System.out.println("after service");
	}
	@Transactional
	public void updateTransactionDetails(TransactionDetails trans1, long accountNumber) {
		// TODO Auto-generated method stub
//		for(TransactionDetails obj:userdetails)
		ptDao.updateTransactionDetails(accountNumber);
		User usd=ptDao.updateTransactionDetails(accountNumber);
		double transactionAmount=trans1.getAccountBalance();
		if(trans1.getTransactiontype().equals("withdrawl")){
			
			usd.setAccountBalance(usd.getAccountBalance()-transactionAmount);
			
		}
		else{
			usd.setAccountBalance(usd.getAccountBalance()+transactionAmount);
		}
		
		trans1.setUser(usd);
		List<TransactionDetails> transactionList=new ArrayList<TransactionDetails>();
		System.out.println(trans1);
		transactionList.add(trans1);
		usd.setTransactionDetails(transactionList);
		System.out.println(usd);
		
		
		//usd.getAccountBalance()
		
	}
	public void retriveTransactionDetails(long accountNumber) {
		// TODO Auto-generated method stub
		ptDao.retriveTransactionDetails(accountNumber);
	}
	
	//public void

}


/*package com.cognizant.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;


import com.cognizant.dao.PerformTransactionDAO;
import com.cognizant.entity.TransactionDetails;
import com.cognizant.entity.User;


@Component
public class PerformTransactionService {

	@Autowired
	PerformTransactionDAO ptDAO;
	/*public void addUserDetails(User u)
	{
		System.out.println("in service");
		ptDAO.addUserDetails(u);
		System.out.println("after service");
	}
	@Transactional
	public void updateTransactionDetails(TransactionDetails trans1, long accountNumber) {
		// TODO Auto-generated method stub
//		for(TransactionDetails obj:userdetails)
		ptDAO.updateTransactionDetails(accountNumber);
		User ud=performTransactionDao.updateTransactionDetails(accountNumber);
		double transactionAmount=trans1.getAccountBalance();
		if(trans1.getTransactiontype().equals("withdrawl")){
			
			ud.setAccountBalance(ud.getAccountBalance()-transactionAmount);
			
		}
		else{
			ud.setAccountBalance(ud.getAccountBalance()+transactionAmount);
		}
		
	}*/
	
	
	/*public void updateTransactionDetails(User u) 
	{
		
		
		
		//for(TransactionDetails td: u)
		
		ptDAO.updateTransactionDetails(u);
		
		//return null;
			
	}*/

