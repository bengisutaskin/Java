package stringsDemo1;

public class Main {

	public static void main(String[] args) {
		 String mesaj="Bug�n hava �ok g�zel.";	 
		 System.out.println(mesaj);
		 
		 System.out.println("Eleman Say�s� :"+mesaj.length());
		 System.out.println("5. eleman :"+mesaj.charAt(4));

		 System.out.println(mesaj.concat("Ya�as�n!"));
		 System.out.println(mesaj);
		 System.out.println(mesaj.startsWith("A"));
		 //startswith ne ile ba�lad���n� true false olarak yazd�r�r.
		 System.out.println(mesaj.endsWith("."));
		 //endswith ise ne ile bitti�ini true false olarak yazd�r�r.
		 char[] karakterler = new char[5];
		 mesaj.getChars( 0,4 ,karakterler,0);
		 System.out.println(karakterler);
		 System.out.println(mesaj.indexOf("a"));
		 //indexof o eleman�n ka��nc� s�rada kullan�ld���n� yazar
		 System.out.println(mesaj.lastIndexOf("a"));

	}

}
