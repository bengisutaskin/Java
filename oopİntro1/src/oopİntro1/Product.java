package oopÝntro1;

public class Product {

    //encapsulation
    private int id;
	private String name;
	private double unitPrice;
	private String detail;
	private double discount;
	
	//get set aslýnda yukarýdakilerin deðerini vermeye yarar. Biz bunu dýþarýya kapatýp içerden yönetilmesini saðlýyoruz
	
	public Product() {}
	
	public Product(int id, String name, double unitPrice, String detail, double discount) {
		super();
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;
		this.discount = discount;
		
		
	}

	//bunlar aslýnda iþ yapan nesneler
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	//getname- name okumak için return olur.Return aslýnda bir deðer döndürüyor ve ben o deðeri bir yere atýyýcam. Onun için return
	
	
	public void setName(String name) {
		this.name = name;
	}

	//setname-bana bir name gönder ben de set edeyim
	
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
	//yukarýdaki sadece okumaya yönelik bir çalýþma
	

}
