package com.spring.hibernate.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.spring.hibernate.entity.Customer;

@Repository
public class CustomerDaoImpl implements CustomerDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Customer> getAllCustomers() {
		Session currentSession = sessionFactory.getCurrentSession();
		
		Query<Customer> myQuery = currentSession.createQuery("from Customer order by lastName",Customer.class);
		
		List<Customer> myCustomers = myQuery.getResultList();
		return myCustomers;
	}

	public void saveCustomer(Customer theCustomer) {
	
		Session currentSession = sessionFactory.getCurrentSession();
		
		currentSession.saveOrUpdate(theCustomer);
		
	}

	@Override
	public Customer getCustomer(int theId) {
		Session currentSession = sessionFactory.getCurrentSession();
		
		Customer theCustomer = currentSession.get(Customer.class, theId);
		return theCustomer;
	}

	@Override
	public void deleteCustomer(int theId) {
		Session currentSession = sessionFactory.getCurrentSession();
		
//		Query theQuery = currentSession.createQuery("delete from Customer where id:=customerId");
//		theQuery.setParameter("customerId", theId);
//		theQuery.executeUpdate();
		
		Customer theCustomer = currentSession.get(Customer.class, theId);
		currentSession.delete(theCustomer);
		
		
	}

}
