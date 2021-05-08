package stringsDemo2;

public class Main {

	public static void main(String[] args) {
		String mesaj= "  Bugün Hava Çok Güzel.  ";
		System.out.println(mesaj);
	 
		//String yeniMesaj  = mesaj.replace (oldChar: ' ',newChar:'--')
		//System.out.println(yeniMesaj);
		
		System.out.println(mesaj.substring(2,5));
		
		String[] bol = mesaj.split(" ");
		for(int i=0;i<bol.length;i++) {
			 System.out.println(bol[i]);
			 }
			 
		//for(String kelime : mesaj.split(regex " ")) {
			//System.out.println(kelime);}
		
		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());
		System.out.println(mesaj.trim());
	 

	}

}
