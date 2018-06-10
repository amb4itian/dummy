package com.ambrish.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.ambrish.dto.UserDetails;

public class HibernateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserDetails user = new UserDetails();
		user.setUserId(108);
		user.setUserName("Ambrish");
		user.setCity("Bangalore");
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		//from git repo
	}

}
