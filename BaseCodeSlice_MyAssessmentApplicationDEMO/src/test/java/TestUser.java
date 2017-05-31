




/*package test.java;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import com.cognizant.entity.Employee;
import com.cognizant.entity.TransactionDetails;
import com.cognizant.entity.User;
import com.cognizant.service.EmployeeService;
import com.cognizant.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:beans.xml")

public class TestUser {

	@Autowired
	UserService service;
	private List<User> users;
	
	@Before
	public void setup(){
		User u1 = new User("saving","Pooja",67478.0);
		User u2 = new User("saving","purva",4555.0);
		users = new ArrayList<>();
		users.add(u1);
		users.add(u2);
	}
	@Test
	public void addEuser(){
		try {
			service.addUsers(users);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("Not supplied valid Details");
		}
	}

	
	

	//@Test 
	/*public void testAdd(){
		UserDetails user=new UserDetails(11486544,"Current","Raj",45200);
		userDao.add(user);
		assertTrue(true);


	}*/
	
	
	
	
	//TO INSERT TRANSACTIONDETAILS ONLY
	//@Test
	/*public void testPerformTransaction(){
		TransactionDetails transactionList=new TransactionDetails(11486544,"gym","Withdraw");
		userDao.InsertTransaction(transactionList);
		assertTrue(true);

	}
	//TO INSERT TRANSACTIONDETAILS AND MAPPED USERDETAILS SIMULTANIOUSLY
	@Test 
	public void testPerformTransaction1(){
		TransactionDetails transactionList=new TransactionDetails(1148654554,"ghgh","deposit");
		List<TransactionDetails> list=new ArrayList<TransactionDetails>();
		list.add(transactionList);
		UserDetails user1=new UserDetails(114854554,"Current","Raj",45200,list);
		userDao.InsertTransaction1(user1);
		assertTrue(true);


	}*/



