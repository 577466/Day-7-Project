/*package test.java;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cognizant.entity.TransactionDetails;
import com.cognizant.service.RetriveTransactionService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:beans.xml")
public class testRetriveTransaction 

{

	@Autowired
	RetriveTransactionService rService;
	private List<TransactionDetails> tdList=new ArrayList<TransactionDetails>();
	
	@Test
	public void testretrieveTransactionDetails ()
	{
		tdList=rService.retrieveTransactionDetails(9L);
		System.out.println(tdList);
		
		//assertTrue(true);

	}
	
}*/


