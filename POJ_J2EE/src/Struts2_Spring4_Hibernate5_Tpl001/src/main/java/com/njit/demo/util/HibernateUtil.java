package com.njit.demo.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.SessionFactoryBuilder;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {
	private static SessionFactory sf;
	static {
		StandardServiceRegistry standardRegistry = new StandardServiceRegistryBuilder()
				.configure("src/main/resources/hibernate.cfg.xml").build();
		Metadata metadata = new MetadataSources(standardRegistry).getMetadataBuilder()
				.build();
		SessionFactoryBuilder sessionFactoryBuilder = metadata.getSessionFactoryBuilder();
		sf = sessionFactoryBuilder.build();
	}

	public static SessionFactory getSessionFactory() {
		return sf;
	}
}
