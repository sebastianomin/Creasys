package unirc.domanda2;

public class Test {
	
	
	
   public static void main(String[] args) {
	   
	    Docente d1=new Docente("Mario", "Rossi", 01, 40);
		Docente d2=new Docente("Mario", "Rossi", 01, 30);
		Docente d3=new Docente("Mario", "Rossi", 01, 24);
		Docente d4=new Docente("Mario", "Rossi", 01, 34);
		Docente d5=new Docente("Mario", "Rossi", 01, 28);
		
		Docente []d={d1,d2,d3,d4,d5};
		
		
		
		Universita u=new Universita(d);
		int eta=u.etaMinima();
		System.out.println(eta);
	
}

}
