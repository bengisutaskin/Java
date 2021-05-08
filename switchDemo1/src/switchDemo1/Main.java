package switchDemo1;

public class Main {

	public static void main(String[] args) {
        char grade='C';
		
		switch(grade) {
		case 'A':
		    System.out.println("Mükemmel : Geçtiniz");
		    break;
		case 'B':
		    System.out.println("Güzel : Geçtiniz");	
		    break;
		case 'C':
			System.out.println("Ýyi : Geçtiniz");
			break;
		case 'D':
		    System.out.println("Fena Deðil : Geçtiniz");
		    break;
		case 'F':
			System.out.println("Malesef Kaldýnýz");
		    break;
	    default:
			System.out.println("Geçersiz Kod Girdiniz");
			
		}

	}

}
