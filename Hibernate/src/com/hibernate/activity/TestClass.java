package com.hibernate.activity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

public class TestClass {
	
	public static void main (String...args){
		
		AnnotationConfiguration annotationConfiguration = new AnnotationConfiguration();
		annotationConfiguration.addAnnotatedClass(TwoTables.class);
		annotationConfiguration.configure();
		
		new SchemaExport(annotationConfiguration).create(true, true);
		
		SessionFactory factory = annotationConfiguration.buildSessionFactory();
		Session session = factory.getCurrentSession();
		
		session.beginTransaction();
		
		TwoTables firstClass =  new TwoTables();
		firstClass.setStr("Test");
		firstClass.setNoNull("Y");
		firstClass.setOneVal(true);
		firstClass.setPass("pass");
		
		TwoTables firstClass1 =  new TwoTables();
		firstClass1.setStr("Test1");
		firstClass1.setNoNull("Y1");
		firstClass1.setOneVal(false);
		firstClass1.setPass("pass1");
		
		TwoTables firstClass2 =  new TwoTables();
		firstClass2.setStr("Test2");
		firstClass2.setNoNull("Y2");
		firstClass2.setOneVal(true);
		firstClass2.setPass("pass2");
		
		session.save(firstClass);
		session.save(firstClass1);
		session.save(firstClass2);
		
		session.getTransaction().commit();
		
		
		
	}
}
