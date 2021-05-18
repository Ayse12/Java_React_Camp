package nLayeredDemo;

import java.util.List;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.core.jLoggerManagerAdapter;
import nLayeredDemo.dataAccess.concretes.AbcProductDao;
import nLayeredDemo.dataAccess.concretes.HibernateProductDao;
import nLayeredDemo.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {
		
		//ToDo: Sprinc IoC ile çözülecek
		 Abcproduct();
		 HibernateProductDao();

	}
	public static void Abcproduct() {
		ProductService productService = new ProductManager(new AbcProductDao(), new jLoggerManagerAdapter());
		Product product = new Product(1,2,"Armut",12,50);
		productService.add(product);
	}
	
	public static void HibernateProductDao() {
		ProductService productService = new ProductManager(new HibernateProductDao(), new jLoggerManagerAdapter());
		Product product = new Product(1,2,"Elma",12,50);
		productService.add(product);
	}
}
