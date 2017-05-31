package com.cognizant.dao;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.entity.TransactionDetails;
import com.cognizant.entity.User;



@Component
public class UserDetailsDAO {
	 @PersistenceContext
	  private EntityManager em;
	 	
	@Transactional
	public void addUsers(User tod) {
		
		em.persist(tod);
		//return null;
		
		
	}

}
