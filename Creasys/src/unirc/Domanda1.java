package unirc;

/*Scrivere una classe Domanda1 che contenga al suo interno un metodo main, nel quale si dichiari l'array di interi
 *  V=[6,3,1,2,9] e si calcoli la media dell'array, stampandola sullo schermo.**/

public class Domanda1 {
	public static void main(String[] args) {
		int somma=0;
		int v[]={6,3,1,2,9};
		for (int i = 0; i < v.length; i++) {
			somma+=v[i];
			
		}
		int media=somma/v.length;
		System.out.println("La media è: "+media);
		
	}

}
