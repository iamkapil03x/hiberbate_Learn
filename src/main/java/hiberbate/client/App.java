package hiberbate.client;

import hiberbate.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.SessionFactoryBuilder;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.hibernate.service.ServiceRegistry;

import java.util.List;

public class App {

	public static void main(String[] args) {
		System.out.println("Starting.......");
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate1.cfg.xml").build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		SessionFactory sf = meta.getSessionFactoryBuilder().build();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		System.out.println("Again Stating..........");

		// Example of Hibernate Query Language to get all the records :
		Query query = session.createQuery("from Employee");
		List list= (List) query.list();
		System.out.println(list);
		Query q= session.createQuery("select max(name) from Employee");
		List<Integer> list1= q.list();
		System.out.println(list1.get(0));


		// Hibernate Query Language records with pagination
		Query query1 = session.createQuery("from Employee");
		query1.setFirstResult(5);
		query1.setMaxResults(5);
//		List list2= (List) query1.list();
		List list2 = query1.list();
		// will Return the records from 5 to 10 number
		System.out.println("5 to 10 :"+list2);

		tx.commit();
		session.close();
//		sf.close();
	}

}