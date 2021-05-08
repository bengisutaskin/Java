package oop›ntro1;

public class Main {

	public static void main(String[] args) {
		
			
			Product product1= new Product(12345,"Computer1",1500,"8 gb ram",10);
			
			
			Product product2= new Product();
			product2.setId(2);
			product2.setName("Levovo V15");
			product2.setDetail("16 gb ram");
			product2.setDiscount(10);
			product2.setUnitPrice(16000);
			
			System.out.println(product2.getUnitPriceAfterDiscount());
			
			Category category1 = new Category();
			category1.setId(1);
			category1.setName("›Áecek");
			
			Category category2 = new Category();
			category2.setId(2);
			category2.setName("Yiyecek");
			
			System.out.println(category1.getName());
			System.out.println(category2.getName());
			

	}

}
