package stringsDemo1;

public class Main {

	public static void main(String[] args) {
		 String mesaj="Bugün hava çok güzel.";	 
		 System.out.println(mesaj);
		 
		 System.out.println("Eleman Sayýsý :"+mesaj.length());
		 System.out.println("5. eleman :"+mesaj.charAt(4));

		 System.out.println(mesaj.concat("Yaþasýn!"));
		 System.out.println(mesaj);
		 System.out.println(mesaj.startsWith("A"));
		 //startswith ne ile baþladýðýný true false olarak yazdýrýr.
		 System.out.println(mesaj.endsWith("."));
		 //endswith ise ne ile bittiðini true false olarak yazdýrýr.
		 char[] karakterler = new char[5];
		 mesaj.getChars( 0,4 ,karakterler,0);
		 System.out.println(karakterler);
		 System.out.println(mesaj.indexOf("a"));
		 //indexof o elemanýn kaçýncý sýrada kullanýldýðýný yazar
		 System.out.println(mesaj.lastIndexOf("a"));

	}

}
