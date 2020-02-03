package com.hibernate.crud;


import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.criterion.Restrictions;
import org.hibernate.tool.hbm2ddl.SchemaExport;

public class TestCrud {
	public static void main (String... arg){
		AnnotationConfiguration config = new AnnotationConfiguration();
		config.addAnnotatedClass(CRUD.class);
		config.configure();
		
//		new SchemaExport(config).create(true, true);
		
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.getCurrentSession();
		
//		SessionFactory sessionFactory = new AnnotationConfiguration().configure().
//		addAnnotatedClass(CRUD.class).buildSessionFactory();
//		
		session.beginTransaction();
		
//		Create
//		for (int i = 1; i < 11; i++){
//			CRUD crud = new CRUD();
//			crud.setUserName("User" + i);
//			session.save(crud);
//		}
//		Read
//		for (int i = 1;  i < 10; i++){
//			CRUD crud = (CRUD) session.get(CRUD.class, i);
//			System.out.println(crud.getUserName());
//		}
//		Delete
//		CRUD crud = (CRUD) session.get(CRUD.class, 10);
//		session.delete(crud);
//		Update
//		CRUD crud = (CRUD) session.get(CRUD.class, 3);
//		crud.setUserName("Updated User3");
//		session.update(crud);
//		HQL
		String userId = "3";
		String userName = "User2";
//		Query query = session.createQuery("select userName from CRUD where userId = :userId");
//		Query query = session.getNamedQuery("CRUD.getById");
//		Query query = session.getNamedQuery("CRUD.getByUserName");
//		query.setString(0, userId);
//		query.setString(0, userName);
//		List <String> users = (List<String>) query.list();
//		Criteria
		Criteria criteria = session.createCriteria(CRUD.class);
		criteria.add(Restrictions.eq("userName", "User2"));
		List<CRUD> cruds = (List<CRUD>) criteria.list();
		System.out.println("Criteria Result : " + cruds);
		
		session.getTransaction().commit();
//		session.close();
		
//		System.out.println("HQL Result : " + users);
	}
}
