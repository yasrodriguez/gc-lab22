package com.gc.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.gc.dto.ItemDto;


public class ItemDaoHibernate implements ItemDao {

	@Override
	public List<ItemDto> listAll() {
		Configuration config = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = config.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Criteria crit = session.createCriteria(ItemDto.class); 
		ArrayList<ItemDto> list = (ArrayList<ItemDto>) crit.list(); 
		tx.commit();
		session.close();
		return list;
	}
}
