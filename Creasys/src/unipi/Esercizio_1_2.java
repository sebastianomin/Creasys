package unipi;


/*Convertire i seguenti numeri decimali in formato binario senza segno
 74
 43
 157**/

public class Esercizio_1_2 {
	
public static void convert(int a,int b,int c) {
	
	   String res1=  Integer.toBinaryString(a);
	   String res2=   Integer.toBinaryString(b);
	   String res3=   Integer.toBinaryString(c);
		
		System.out.println(res1+" "+res2+" "+res3);
		
	}
	
	
	public static void main(String[] args) {
	     convert(74,43,157);
		
	}

}
