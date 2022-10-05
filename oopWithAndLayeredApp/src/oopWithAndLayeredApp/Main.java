package oopWithAndLayeredApp;

import oopWithAndLayeredApp.business.ProductManager;
import oopWithAndLayeredApp.core.logging.DatabaseLogger;
import oopWithAndLayeredApp.core.logging.FileLogger;
import oopWithAndLayeredApp.core.logging.Logger;
import oopWithAndLayeredApp.core.logging.MailLogger;
import oopWithAndLayeredApp.dataAccess.HibernateProductDao;
import oopWithAndLayeredApp.dataAccess.JdbcProductDao;
import oopWithAndLayeredApp.entities.Product;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Product product1=new Product(1,"Iphone Xr",900);
		
		Logger[]loggers= {new DatabaseLogger(),new FileLogger(),new MailLogger()};
		
		ProductManager productManager=new ProductManager(new HibernateProductDao(),loggers);
		productManager.add(product1);
		

		
	}

}
