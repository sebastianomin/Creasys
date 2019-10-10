package unirc.domanda2;
/*Scrivere una classe Docente che rappresenti le seguenti informazioni relative ad un docente: 
 * nome, cognome, codice ed età, e che contenga il costruttore parametrizzato ed i metodi getCodice, 
 * getCognome e getEta che restituiscono rispettivamente il codice, il cognome e l’età del docente.
Scrivere poi una classe Universita, che rappresenti un insieme di docenti universitari tramite un array 
di tipo Docente, e che contenga il costruttore parametrizzato ed un metodo etaMinima che restituisce la minima
 età tra i docenti universitari.**/

public class Docente {
	private String nome;
	private String cognome;
	private int codice;
	private int eta;
	public Docente(String nome, String cognome, int codice, int eta) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.codice = codice;
		this.eta = eta;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public int getCodice() {
		return codice;
	}
	public void setCodice(int codice) {
		this.codice = codice;
	}
	public int getEta() {
		return eta;
	}
	public void setEta(int eta) {
		this.eta = eta;
	}
	

	}
	
	
