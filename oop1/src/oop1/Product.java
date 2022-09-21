package oop1;

//classlar PascalCase isimlendirilir.
public class Product {

	// camelCase
	private String name;// bunlar classın fieldları. Fieldlar camelCase olmalı
	private double unitPrice;
	private double discount;
	private String imageUrl;// domain iş demek.Burayı tanımlarken domain odaklı tanımlıyoruz
	private int unitsInStock;

	public String getName() {//get okuma set yazma
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public int getUnitsInStock() {
		return unitsInStock;
	}

	public void setUnitsInStock(int unitsInStock) {
		this.unitsInStock = unitsInStock;
	}

}
