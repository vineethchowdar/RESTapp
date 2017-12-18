package com.mvc.app.service;



import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.mvc.app.entity.Product;
import com.mvc.app.util.HibernateUtil;

@Path("/productService")
public class ProductService {
	
	private SessionFactory sessionFactory;
	
	public ProductService() {
		sessionFactory = HibernateUtil.getSessionFactory();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Product> getProducts(){
		
		Session session = sessionFactory.openSession();

		org.hibernate.query.Query query = session.createQuery("from Product");
		List<Product> products = query.list();
		return products;
		
	}
	
	
	@Path("/{id}")
	@GET
	//@Produces(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_JSON)
	public Product fetchProductById(@PathParam("id")int id) {
		
		Session session = sessionFactory.openSession();
		
		Product product = session.get(Product.class, id);
		
		System.out.println("Id  : "+product.getId());
		System.out.println("Name: "+product.getName());
		
		//System.out.println("SupplierId : "+product.getSupplier().getSup_id());
		
		session.close();
		
		return product;
		
	}

}
