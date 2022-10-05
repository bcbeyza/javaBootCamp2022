package oopWithAndLayeredApp.business;

import java.util.List;

import oopWithAndLayeredApp.core.logging.Logger;
import oopWithAndLayeredApp.dataAccess.JdbcProductDao;
import oopWithAndLayeredApp.dataAccess.ProductDao;
import oopWithAndLayeredApp.entities.Product;

public class ProductManager {

	private ProductDao productDao;
	private Logger[]loggers;
	
	
	
	public ProductManager(ProductDao productDao,Logger[]loggers) {
		
		this.productDao = productDao;
		this.loggers=loggers;
	}



	public void add(Product product) throws Exception {//response required pattern
		
		//is kuralları business rules yazılıyor
		
		if(product.getUnitPrice()<10) {
			throw new Exception("Ürün fiyatı 10 dan kucuk olamaz");
		}
		productDao.add(product);
		
		for (Logger logger : loggers) {//db,mail
			logger.log(product.getName());
		}
	}
}
