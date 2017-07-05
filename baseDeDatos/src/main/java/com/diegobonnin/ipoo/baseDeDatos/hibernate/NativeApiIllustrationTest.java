package com.diegobonnin.ipoo.baseDeDatos.hibernate;

import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class NativeApiIllustrationTest{

	public static void main(String[] args){
		
		SessionFactory sessionFactory=null;
		
		final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
				.configure("hibernate.cfg.xml")
				.build();
		try {
			sessionFactory = new MetadataSources( registry ).buildMetadata().buildSessionFactory();
			
			Session session = sessionFactory.openSession();
			session.beginTransaction();
			session.save(new Persona("Diego Bonnin", new Date()));
			session.getTransaction().commit();
			session.close();

			// now lets pull events from the database and list them
			session = sessionFactory.openSession();
			session.beginTransaction();
			
			List l = session.createQuery( "from Persona" ).list();
			for ( Persona persona : (List<Persona>) l ) {
				System.out.println(persona.toString());
			}
			session.getTransaction().commit();
			session.close();
			
		}catch (Exception e) {
			e.printStackTrace();
			StandardServiceRegistryBuilder.destroy( registry );
		}finally{
			if ( sessionFactory != null ) {
				sessionFactory.close();
			}
		}

		
	}


}
