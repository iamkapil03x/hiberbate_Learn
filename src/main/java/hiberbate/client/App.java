package hiberbate.client;

import java.util.List;

import hiberbate.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.hibernate.service.ServiceRegistry;

public class App {

	public static void main(String[] args) {
		System.out.println("Staring................");
		Employee emp = new Employee();
		emp.setName("Adarsh Sharma");
		emp.setGender("Male");
		emp.setSalary(205000);
		emp.setAddress("lucknow");

		ServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate1.cfg.xml").build();
		Metadata data = new MetadataSources(ssr).getMetadataBuilder().build();


//		Configuration cfg = new Configuration().configure();
		SessionFactory session = data.buildSessionFactory();
		Session ss = session.openSession();
		Transaction tx = ss.beginTransaction();

		ss.save(emp);
		tx.commit();
	}

}