package unirc.domanda2;


public class Universita {
	
	private Docente [] docenti;

	public Universita(Docente[] docenti) {
		super();
		this.docenti = docenti;
	}

	public Docente[] getDocenti() {
		return docenti;
	}

	public void setDocenti(Docente[] docenti) {
		this.docenti = docenti;
	}
	
	public int etaMinima(){
		int etaMinima=docenti[0].getEta();
		for (int i = 1; i < docenti.length; i++) {
			if(docenti[i].getEta()<etaMinima){
				etaMinima=docenti[i].getEta();
			}
			
		}
		return etaMinima;
		}
	}


