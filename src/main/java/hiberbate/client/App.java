package hiberbate.client;

import java.util.List;

import hiberbate.entity.Address;
import hiberbate.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;

public class App {

	public static void main(String[] args) {

		System.out.println("Starting The Program.....");
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure().build();
		Metadata metadata = new MetadataSources(ssr).getMetadataBuilder().build();

		SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();
		Session session= sessionFactory.openSession();

		Transaction tx = session.beginTransaction();

		Employee employee = new Employee();
		employee.setName("Anup");
		employee.setEmail("Kapil@gmail.com");

		Address address= new Address();
		address.getAddressline1("G-23,Alam");
		address.getCountry("INDIA");
		address.getCity("LUCKNOW");
		address.getState("UTTAR PRADESH");
		address.getPincode(25622);

		employee.setAddress(address);
		address.setEmployee(employee);

		session.persist(employee);
		tx.commit();

		session.close();
		System.out.println("We are successfully");


	}

}