package inheritance1;

public class Main {

	public static void main(String[] args) {
		//miras yapýsýyla þunu saðlýyoruz senin 2 sýnýfýn var bu sýnýflarda bazý ortak yapýlarýn var bunun için bu inheritanceden yararlýnýyoruz

				IndividualCustomer bengisu=new IndividualCustomer();
				bengisu.customerNumber="12345";
				
				CorporateCustomer hepsiBurada = new CorporateCustomer();
				hepsiBurada.customerNumber="234456";
				
				CustomerManager customerManager = new CustomerManager();
				
				Customer[] customers = {bengisu,hepsiBurada};
				
				customerManager.addMultiple(customers);

	}

}
