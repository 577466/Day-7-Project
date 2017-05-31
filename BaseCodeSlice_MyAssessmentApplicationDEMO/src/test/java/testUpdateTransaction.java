/*package test.java;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cognizant.dao.updateTransactionDao;
import com.cognizant.entity.TransactionDetails;
import com.cognizant.entity.User;
import com.cognizant.service.RetriveTransactionService;
import com.cognizant.service.updateTransactionService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:beans.xml")
public class testUpdateTransaction

{

	@Autowired
	updateTransactionService uService;
	private List<TransactionDetails> tdList=new ArrayList<TransactionDetails>();
	
	User u;
	updateTransactionDao udao;
	
	
	
	
	//@Test
	public void testupdateTransactionDetails ()
	{
		tdList=uService.updateTransactionDetails();
		udao.updateTransactionDetails(accountNumber);
		
		double transactionAmount=trans.getAccountBalance();
		if(trans.getTransactiontype().equals("withdrawl")){
			
			u.setAccountBalance(u.getAccountBalance()-transactionAmount);
			
		}
		else{
			u.setAccountBalance(u.getAccountBalance()+transactionAmount);
		}
		System.out.println(tdList);
		
		//assertTrue(true);

	}
	
	
}*/
