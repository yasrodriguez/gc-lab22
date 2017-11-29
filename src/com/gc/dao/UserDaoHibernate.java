package com.gc.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.gc.dto.UserDto;

public class UserDaoHibernate implements UserDao {

	@Override
	public void insertUser(UserDto user) {
		Configuration config = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = config.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
				
		session.save(user);
		
		tx.commit();
		session.close();
	}

	@Override
	public List<UserDto> listAll() {
		return null;
	}

}
