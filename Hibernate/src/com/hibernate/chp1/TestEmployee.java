package com.hibernate.chp1;

import java.util.Date;
import java.util.GregorianCalendar;

import org.apache.derby.client.am.DateTimeValue;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

public class TestEmployee {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AnnotationConfiguration config = new AnnotationConfiguration();
		config.addAnnotatedClass(Employee.class);
		config.addAnnotatedClass(EmployeeDetails.class);
		config.configure();
		
		//new SchemaExport(config).create(true, true);
		
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.getCurrentSession();
		
		session.beginTransaction();
		
		Employee alex = new Employee();
//		emp.setEmpId(1);
		alex.setName("Alex Berry");
		alex.setEmpEmailAddress("alex@hibernate.com");
		alex.setEmpPassword("alex123");
		alex.setPremanent(true);
		alex.setEmpJointDate(new GregorianCalendar(2009, 05, 29));
		alex.setEmpLoginTime("2016-05-06");
		
		session.save(alex);
		
		Employee linda = new Employee();
//		emp.setEmpId(1);
		linda.setName("linda Berry");
		linda.setEmpEmailAddress("linda@hibernate.com");
		linda.setEmpPassword("linda123");
		linda.setPremanent(true);
		linda.setEmpJointDate(new GregorianCalendar(2009, 05, 29));
		linda.setEmpLoginTime("2016-05-06");
		
		session.save(linda);
		
		Employee bill = new Employee();
//		emp.setEmpId(1);
		bill.setName("bill Berry");
		bill.setEmpEmailAddress("bill@hibernate.com");
		bill.setEmpPassword("bill123");
		bill.setPremanent(true);
		bill.setEmpJointDate(new GregorianCalendar(2009, 05, 29));
		bill.setEmpLoginTime("2016-05-06");
		
		session.save(bill);
		
//		EmployeeDetails empDetails = new EmployeeDetails();
//		empDetails.setEmpId(emp.getEmpId());
//		empDetails.setEmpName(emp.getName());
//		empDetails.setEmpSalary(1000000);
//		empDetails.setEmpWorkDay(30);
		
		
//		session.save(empDetails);
		session.getTransaction().commit();

	}

}
