package Hiber;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.annotations.*;

public class TestMain {
	public static void main(String[] args) {
		// creating (annotataion) configuration object
		System.out.println("1");
		AnnotationConfiguration cfg = new AnnotationConfiguration();
	   	cfg.addAnnotatedClass(Employee.class);
        cfg.configure("hibernate.cfg.xml");

	    // creating session factory object			
		System.out.println("2");
		SessionFactory factory = cfg.buildSessionFactory();
		// creating session object
		System.out.println("3");
		Session session = factory.openSession();
		// creating transaction object
		System.out.println("4");
		Transaction t = session.beginTransaction();
		Employee e1 = new Employee();
		e1.setId(420);
		e1.setFirstname("H. J.");
		e1.setFirstname("Doshi");
		session.persist(e1);		// persisting the object
		t.commit();					// transaction is committed
		session.close();
		System.out.println("Successfully Saved");
	}
}