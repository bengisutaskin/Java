package inheritance1;

public class Main {

	public static void main(String[] args) {
		//miras yap�s�yla �unu sa�l�yoruz senin 2 s�n�f�n var bu s�n�flarda baz� ortak yap�lar�n var bunun i�in bu inheritanceden yararl�n�yoruz

				IndividualCustomer bengisu=new IndividualCustomer();
				bengisu.customerNumber="12345";
				
				CorporateCustomer hepsiBurada = new CorporateCustomer();
				hepsiBurada.customerNumber="234456";
				
				CustomerManager customerManager = new CustomerManager();
				
				Customer[] customers = {bengisu,hepsiBurada};
				
				customerManager.addMultiple(customers);

	}

}
