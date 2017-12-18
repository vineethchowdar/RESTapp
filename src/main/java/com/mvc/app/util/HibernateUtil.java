package com.mvc.app.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.mvc.app.entity.Product;
import com.mvc.app.entity.Supplier;



public class HibernateUtil {
	
	private static SessionFactory sessionFactory;
	
	static{
		
		Configuration configuration = new Configuration();
		
		//Loads hibernate.cfg.xml
		configuration.configure();
		
		configuration.addAnnotatedClass(Product.class);
		//configuration.addAnnotatedClass(Supplier.class);
//		configuration.addAnnotatedClass(Product.class);
//		configuration.addAnnotatedClass(Item.class);
//		configuration.addAnnotatedClass(Bid.class);
//		configuration.addAnnotatedClass(User.class);
//		configuration.addAnnotatedClass(Bidder.class);
//		configuration.addAnnotatedClass(Seller.class);
//		configuration.addAnnotatedClass(Address.class);




		
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
		
		 sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		
	}
	
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

}
