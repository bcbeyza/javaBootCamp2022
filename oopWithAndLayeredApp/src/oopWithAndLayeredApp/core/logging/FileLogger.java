package oopWithAndLayeredApp.core.logging;

public class FileLogger implements Logger {

	@Override//anatosyon deniyor
	public void log(String data) {
		
		System.out.println("Dosyaya loglandı: "+ data);
		
		
	}

}
