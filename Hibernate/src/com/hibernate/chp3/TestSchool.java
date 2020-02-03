package com.hibernate.chp3;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

public class TestSchool {
	public static void main (String...args){
		
		AnnotationConfiguration config = new AnnotationConfiguration();
		config.addAnnotatedClass(School.class);
		config.configure();
		
		new SchemaExport(config).create(true, true);
		
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		
		SchoolDetail schoolDetail = new SchoolDetail();
		schoolDetail.setPublicShool(false);
		schoolDetail.setSchoolAddress("110 Washington Town Hall");
		schoolDetail.setStudneCount(750);
		
		School school = new School();
		school.setSchoolName("St. Anns School");
		school.setSchoolDetail(schoolDetail);
		
		session.save(school);
		
		session.getTransaction().commit();
	}
}
