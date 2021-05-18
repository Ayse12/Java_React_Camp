package nLayeredDemo.dataAccess.abstracts;

import java.util.List;

import nLayeredDemo.entities.concretes.Product;

public interface ProductDao {
	void add(Product product);
	void update(Product product);
	void delete(Product product);
	//id 'ye göre ürün getirme
	Product get (int id);
	
	//Array mantýðýyla ürünleri listeleme
	List<Product> getAll();
}
