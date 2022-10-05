package oopWithAndLayeredApp.dataAccess;

import oopWithAndLayeredApp.entities.Product;

public class HibernateProductDao implements ProductDao {

	
public void add(Product product) {
		
		//sadece ve sadece db erisim kodları buraya yazılır...SQL
		System.out.println("Hibernate ile veritabanına eklendi.");
	}
}
