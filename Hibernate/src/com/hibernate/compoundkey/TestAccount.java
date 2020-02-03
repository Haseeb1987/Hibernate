package com.hibernate.compoundkey;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

public class TestAccount {
	public static void main(String...args){
		AnnotationConfiguration config = new AnnotationConfiguration();
		config.addAnnotatedClass(Accounts.class);
		config.configure();
		new SchemaExport(config).create(true, true);
		
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		
		CompoundKey key = new CompoundKey(100, 456);
		CompoundKey compoundKey1 = new CompoundKey(100, 123);
		Accounts saving = new Accounts();
		saving.setCompoundKey(compoundKey1);
		saving.setAccountBalance(100000);
		
		CompoundKey compoundKey2 = new CompoundKey(100, 456);
		Accounts check = new Accounts();
		check.setCompoundKey(compoundKey2);
		check.setAccountBalance(200000);
		
		session.save(saving);
		session.save(check);
		session.getTransaction().commit();
	}

}
