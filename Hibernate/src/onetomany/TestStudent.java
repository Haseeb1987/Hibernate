package onetomany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

public class TestStudent {
	public static void main (String...  args){
		AnnotationConfiguration config = new AnnotationConfiguration();
		config.addAnnotatedClass(College.class);
		config.addAnnotatedClass(Student.class);
		config.configure();
		
		new SchemaExport(config).create(true, true);
		
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		
		College  college = new College();
		college.setCollegeName("Cresent College");
		
		Student student1 = new  Student();
		student1.setStudentName("Alex");
		
		Student student2 = new Student();
		student2.setStudentName("Linda");
		
		student1.setCollege(college);
		student2.setCollege(college);
		
		session.save(student1);
		session.save(student2);
		session.save(college);
		
		session.getTransaction().commit();
		
	}
}
