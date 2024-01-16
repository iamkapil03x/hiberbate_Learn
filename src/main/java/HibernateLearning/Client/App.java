package HibernateLearning.Client;

import HibernateLearning.ConfigurationJava.HibernateConfiguration;
import HibernateLearning.Entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class App {

	public static void main(String[] args) {
		System.out.println("Starting.......");
		SessionFactory sf = new HibernateConfiguration().getSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		System.out.println("Lets Starting the Program........");
		Employee emp = new Employee();
//		emp.setId(1);
		emp.setName("Sanjay");
		emp.setGender("Male");
		emp.setAddress("lKO");
		session.persist(emp);
		tx.commit();
		Query q = session.createQuery("from Employee");
		List L=q.list();
		System.out.println(L);

//		session.close();
//		sf.close();

	}
}