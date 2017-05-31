

package com.cognizant.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.JoinColumn;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.entity.User;
@Component
public class PerformTransactionDAO {
	
	@PersistenceContext
	private EntityManager em;
	@Transactional
	public void addUserDetails(User u) {
		// TODO Auto-generated method stub
		System.out.println("before dao");
		em.persist(u);
		System.out.println("after dao");
	}
	@PersistenceContext
	private EntityManager em1;
	
	public User updateTransactionDetails(long accountNumber) {
		// TODO Auto-generated method stub
		//em1.persist(accountNumber);
		User ud=em.find(User.class, accountNumber);
		return ud;
	}
	public void retriveTransactionDetails() {
		// TODO Auto-generated method stub
		
		
	}
	@Transactional
	public void retriveTransactionDetails(long accountNumber) {
		// TODO Auto-generated method stub
	/*	Query query=em.createQuery("from transaction_details  where userdetails_ACCOUNT_NUMBER=? AND TRANSACTION_ID=?");
		query.setParameter(1, accountNumber);
		query.setParameter(2, transitionId);
		List<TransactionDetails> retriveList=new ArrayList<TransactionDetails>();
		retriveList=query.getResultList();
		System.out.println(retriveList);*/
		
		User retrive=em.find(User.class, accountNumber);
		System.out.println(retrive);
		System.out.println(retrive.getTransactionDetails());
		
	}

}




























/*package com.cognizant.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.entity.TransactionDetails;
import com.cognizant.entity.User;

@Component
public class PerformTransactionDAO {
	 @PersistenceContext
	  private EntityManager em;
	 	
	@Transactional
	public void updateTransactionDetails(User u) {
		
		em.persist(u);
		//return null;
		
		
	}

	
	
	 
		//u.setTdDetails(tdList); 
		public void retrieveTransactionDetails(Long acountNumber)
		{
		
				User retrieve=em.find(User.class, acountNumber);
				System.out.println(retrieve);
				System.out.println(retrieve.getTransactions()); 
				
			}




		public void addUserDetails(User u) {
			// TODO Auto-generated method stub
			
		} 

	
}



/*public class TestViewHomeLoan {

	
	@Autowired
	ViewHomeLoanService viewHOmeLoanService;
	private List<HomeLoan> homeLoan=new ArrayList<HomeLoan>();
	@Test
	public void test() {
		System.out.println("1");
		
		 homeLoan = viewHOmeLoanService.retrieveHomeDetails("HL-456",56901593875617l);
		System.out.println(homeLoan);
	}

} 
@Component
public class ViewHomeLoanService {
@Autowired
ViewHomeLoanDao viewHomeLoanDao;
private List<HomeLoan> homeLoan=new ArrayList<HomeLoan>();
	public List<HomeLoan> retrieveHomeDetails(String string, long l) {
		
		homeLoan=viewHomeLoanDao.retrieveHomeDetails(string,l);
		// TODO Auto-generated method stub
		return homeLoan;
	}

} 
@Component
public class ViewHomeLoanDao {
	 @PersistenceContext
	    private EntityManager em;

	
	public List<HomeLoan> retrieveHomeDetails(String string, long l) {
		// TODO Auto-generated method stub
		Query query = em.createQuery("from HomeLoan h where h.homeLoanId =? and h.loanAccountNumber=? ");
		query.setParameter(1, string);
		query.setParameter(2, l);
		List<HomeLoan> homeLoan = query.getResultList();
		System.out.println(homeLoan);
		return homeLoan;
	}
	
//	query.exe
} */
