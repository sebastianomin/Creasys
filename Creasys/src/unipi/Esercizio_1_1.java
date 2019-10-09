package unipi;


/*Convertire in formato decimale i seguenti numeri binari senza segno
 00010101
 11001010
 10010110**/

public class Esercizio_1_1 {
	
	public static void convert(String a,String b,String c) {
		
		int decimal1=Integer.parseInt(a.trim(), 2);
		int decimal2=Integer.parseInt(b.trim(), 2);
		int decimal3=Integer.parseInt(c.trim(), 2);
		System.out.println(decimal1+" "+decimal2+" "+decimal3);
		
	}
	
	
	public static void main(String[] args) {
	     convert(" 1001010 ","101011", "10011101");
		
	}

}
