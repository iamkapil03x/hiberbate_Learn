package HibernateLearning.ConfigurationJava;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Environment;

import java.util.Properties;

public class HibernateConfiguration {
    public static SessionFactory getSessionFactory() {
            // Create the StandardServiceRegistry and Hibernate Configure Setting.
            // Specify the Java Database Connection.
            Properties properties = new Properties();
            properties.put(Environment.DRIVER, "com.mysql.jdbc.Driver");
            properties.put(Environment.URL, "jdbc:mysql://localhost:3306/rider");
            properties.put(Environment.USER, "root");
            properties.put(Environment.PASS, "root");
            // Specify Dialect
            properties.put(Environment.DIALECT, "org.hibernate.dialect.MySQLDialect");
            // Echo All Executed SQL to stdout (_For Debugging_)
            properties.put(Environment.SHOW_SQL, "true");
            properties.put(Environment.FORMAT_SQL, "true");
            properties.put(Environment.HBM2DDL_AUTO, "update");
            // Apply properties to the registry builder
            StandardServiceRegistry registry = new StandardServiceRegistryBuilder().applySettings(properties).build();

            // Create a MetadataSources and Add Annotated Entity Classes
            MetadataSources metadataSources = new MetadataSources(registry);
            metadataSources.addAnnotatedClass(HibernateLearning.Entity.Employee.class);

            // Create The Session Factory
            SessionFactory sessionFactory = metadataSources.buildMetadata().buildSessionFactory();
            return sessionFactory;

    }
}
