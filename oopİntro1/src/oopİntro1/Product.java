package oop�ntro1;

public class Product {

    //encapsulation
    private int id;
	private String name;
	private double unitPrice;
	private String detail;
	private double discount;
	
	//get set asl�nda yukar�dakilerin de�erini vermeye yarar. Biz bunu d��ar�ya kapat�p i�erden y�netilmesini sa�l�yoruz
	
	public Product() {}
	
	public Product(int id, String name, double unitPrice, String detail, double discount) {
		super();
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;
		this.discount = discount;
		
		
	}

	//bunlar asl�nda i� yapan nesneler
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	//getname- name okumak i�in return olur.Return asl�nda bir de�er d�nd�r�yor ve ben o de�eri bir yere at�y�cam. Onun i�in return
	
	
	public void setName(String name) {
		this.name = name;
	}

	//setname-bana bir name g�nder ben de set edeyim
	
	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public double getUnitPriceAfterDiscount() {
		return this.unitPrice-(this.unitPrice*this.discount/100);
	}
	//yukar�daki sadece okumaya y�nelik bir �al��ma
	

}
