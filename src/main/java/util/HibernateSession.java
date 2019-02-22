package util;

import entity.Words;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateSession {
    private static SessionFactory sessionFactory;

    private HibernateSession() {}

    public static Session getSessionFactory() {
            try {
                Configuration configuration = new Configuration().configure();
                configuration.addAnnotatedClass(Words.class);
                ServiceRegistry  serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
                sessionFactory = configuration.buildSessionFactory(serviceRegistry);
            } catch (Exception e) {
                System.out.println("Исключение!" + e);
            }
        return sessionFactory.openSession();
    }
}

