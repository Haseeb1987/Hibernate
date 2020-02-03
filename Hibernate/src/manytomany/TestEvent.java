package manytomany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

public class TestEvent {
	public static void main (String... args){
		AnnotationConfiguration config = new AnnotationConfiguration();
		config.addAnnotatedClass(Event.class);
		config.addAnnotatedClass(Delegate.class);
		
		config.configure();
		
		new SchemaExport(config).create(true, true);
		
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		
		Delegate delegate1 = new Delegate();
		delegate1.setDelegateName("Alex");
		
		Delegate delegate2 = new Delegate();
		delegate2.setDelegateName("Linda");
		
		Delegate delegate3 = new Delegate();
		delegate3.setDelegateName("Barry");
		
		Delegate delegate4 = new Delegate();
		delegate4.setDelegateName("Rod");
		
		Event event1 = new Event();
		event1.setEventName("Java");
		
		Event event2 = new Event();
		event2.setEventName("C++");
		
		Event event3 = new Event();
		event3.setEventName("DotNet");
		
		event1.getDelegates().add(delegate1);
		event1.getDelegates().add(delegate2);
		event1.getDelegates().add(delegate3);
		
		event2.getDelegates().add(delegate2);
		event2.getDelegates().add(delegate3);
		
		event3.getDelegates().add(delegate4);
		
		session.save(delegate1);
		session.save(delegate2);
		session.save(delegate3);
		session.save(delegate4);
		
		session.save(event1);
		session.save(event2);
		session.save(event3);
		
		session.getTransaction().commit();
	}
}
