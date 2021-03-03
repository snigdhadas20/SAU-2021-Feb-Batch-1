package com.assignment.hibernateAfternoon;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;



public class App 
{
    public static void main( String[] args )
    {
    	Product p1=new Product();
    	p1.setProduct_id(1);
    	p1.setProduct_name("Product 1");
    	
    	Product p2=new Product();
    	p2.setProduct_id(2);
    	p2.setProduct_name("Product 2");
    	
    	Product p3=new Product();
    	p3.setProduct_id(3);
    	p3.setProduct_name("Product 3");
    	
    	Product p4=new Product();
    	p4.setProduct_id(4);
    	p4.setProduct_name("Product 4");
    	
    	
    	Categories c1=new Categories();
    	c1.setCategory_id(1);
    	c1.setCategory_name("Customer 1");
    	
    	Categories c2=new Categories();
    	c2.setCategory_id(2);
    	c2.setCategory_name("Customer 2");
    	
    	Categories c3=new Categories();
    	c3.setCategory_id(3);
    	c3.setCategory_name("Customer 3");
    	
    	Categories c4=new Categories();
    	c4.setCategory_id(4);
    	c4.setCategory_name("Customer 4");
    	
    	Supplier s1= new Supplier();
    	s1.setSupplier_id(1);
    	s1.setSupplier_name("Supplier 1");
    	
    	Supplier s2= new Supplier();
    	s2.setSupplier_id(2);
    	s2.setSupplier_name("Supplier 2");
    	
    	Supplier s3= new Supplier();
    	s3.setSupplier_id(3);
    	s3.setSupplier_name("Supplier 3");
    	
    	Supplier s4= new Supplier();
    	s4.setSupplier_id(4);
    	s4.setSupplier_name("Supplier 4");
    	
    	p1.getSupplier_list().add(s1);
    	p1.getCategory_list().add(c1);
    	p2.getSupplier_list().add(s2);
    	p2.getCategory_list().add(c2);
    	p3.getSupplier_list().add(s3);
    	p3.getCategory_list().add(c3);
    	p4.getSupplier_list().add(s4);
    	p4.getCategory_list().add(c4);
    	
    	
    	c1.getSupplier_list().add(s1);
    	c2.getSupplier_list().add(s2);
    	c3.getSupplier_list().add(s3);
    	c4.getSupplier_list().add(s4);
    	
    	c1.setproduct_Object(p1);
    	c2.setproduct_Object(p2);
    	c3.setproduct_Object(p3);
    	c4.setproduct_Object(p4);
    	
    	s1.getCategory_list().add(c1);
    	s1.getProduct_list().add(p1);
    	s2.getCategory_list().add(c2);
    	s2.getProduct_list().add(p2);
    	s3.getCategory_list().add(c3);
    	s3.getProduct_list().add(p3);
    	s4.getCategory_list().add(c4);
    	s4.getProduct_list().add(p4);
    	
    	Configuration config = new Configuration().configure().addAnnotatedClass(Product.class).addAnnotatedClass(Categories.class).addAnnotatedClass(Supplier.class);
    	ServiceRegistry registry= new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
    	SessionFactory sf=config.buildSessionFactory(registry);
    	Session session=sf.openSession();
    	
    	session.beginTransaction();
    	
    	session.save(p1);
    	session.save(s1);
    	session.save(c1);
    	
    	session.save(p2);
    	session.save(s2);
    	session.save(c2);
    	
    	session.save(p3);
    	session.save(s3);
    	session.save(c3);
    	
    	session.save(p4);
    	session.save(s4);
    	session.save(c4);
    	
    	session.getTransaction().commit();
    }
}