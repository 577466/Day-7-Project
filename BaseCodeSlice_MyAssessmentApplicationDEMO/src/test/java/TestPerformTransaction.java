

package test.java;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cognizant.entity.TransactionDetails;
import com.cognizant.entity.User;
import com.cognizant.service.PerformTransactionService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:beans.xml")
public class TestPerformTransaction {
	
	@Autowired
	PerformTransactionService performtransactionservice;
	
	User u;
	TransactionDetails transactiondetails;
	List<TransactionDetails> transactionlist;

	//@Test
	public void addUserDetails() 
	{
		u=new User(687988585523614245l,"Savings","pooja",200000.00);
		 
		System.out.println("in test");
		performtransactionservice.addUserDetails(u);
		System.out.println("after test");
		assertTrue(true);
			
	}
	
/*	//@Test
	public void updateTransactionDetails(){
//		System.out.println("intest1");
		userdetails=new UserDetails(125478585523614245l,"Savings","Amir Khan",200000.00);
//		System.out.println(userdetails);
		TransactionDetails trans1=new TransactionDetails("TR_12","vacation","withdrawl",50000.00,userdetails);
		TransactionDetails trans2=new TransactionDetails("TR_13","vacation","withdrawl",80000.00,userdetails);
//		System.out.println(trans1);
		transactionlist=new ArrayList<TransactionDetails>();
		transactionlist.add(trans1);
		transactionlist.add(trans2);
//		System.out.println(transactionlist);
//		System.out.println("intest2");
		userdetails.setTransactionDetails(transactionlist);
		
		performtransactionservice.updateTransactionDetails(userdetails);
	}
	*/
	@Test
	public void updateTransactionDetails(){
		long accountNumber=687988585523614245l;
		
		TransactionDetails trans1=new TransactionDetails("watch","deposit",5000.00);
		performtransactionservice.updateTransactionDetails(trans1, accountNumber);
		
	}
	
	
	
	//@Test
	public void retriveTransactionDetails(){
		long accountNumber=125478585523614245l;
		
		performtransactionservice.retriveTransactionDetails(accountNumber);
	}
	
	//@Test
	public void updateTransactionBalance(){
		
		//userdetails=new UserDetails()
	}
	

}


/*package test.java;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cognizant.entity.TransactionDetails;
import com.cognizant.entity.User;
import com.cognizant.service.PerformTransactionService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:beans.xml")
public class TestPerformTransaction {

	@Autowired
	PerformTransactionService service;
	private List<TransactionDetails> tdList;
	private User u;
	@Before
	public void setUp() throws Exception
	{
		 u=new User("Savings", "pooja",500000);
	
		
				
		TransactionDetails td1 = new TransactionDetails("xyz","deposit",4654655,u);
		TransactionDetails td2 = new TransactionDetails("abcd","withdrawal",2161361,u);
		TransactionDetails td3 = new TransactionDetails("SFFF","deposit",7677776,u);
		tdList=new ArrayList<TransactionDetails>();
		
		tdList.add(td1);
		tdList.add(td2);
		tdList.add(td3);
		u.setTransactions(tdList);;

	}

	@Test
	public void testUpdateTransactionDetails (){
		
		try {
			u.setTransactions(tdList);
			service.updateTransactionDetails(u);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//assertTrue(true);
	
	}
	 
		

	
	
	
	
}*/
