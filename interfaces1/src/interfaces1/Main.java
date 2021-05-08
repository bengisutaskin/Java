package interfaces1;


public class Main {

	public static void main(String[] args) {
		Logger[] loggers = {new SmsLogger(), new EmailLogger()};
		CustomerManager customerManager = new CustomerManager(loggers );
		Customer bengisu = new Customer (1,"Bengisu","Taþkýn");
		customerManager.add(bengisu);
		

	}

}
