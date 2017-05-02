package ro.emanuel.info.examen;

public abstract class Angajat {
	
	
	private String nume;
	private String prenume;
	private String functie;
	private int vechime;
	
	
	public Angajat(String nume, String prenume, String functie, int vechime) {
		super();
		this.prenume = prenume;
		this.nume = nume;
		this.functie = functie;
		this.vechime = vechime;
	}
	
	public abstract void afisareSalar();
	
	public void getNumePrenumeFct(){
		
		System.out.println(this.getNume() + " " + this.getPrenume() + " " + this.getFunctie() );
	}
	
	
	
	public String getPrenume() {
		return prenume;
	}

	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}

	
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public String getFunctie() {
		return functie;
	}
	public void setFunctie(String functie) {
		this.functie = functie;
	}
	public int getVechime() {
		return vechime;
	}
	public void setVechime(int vechime) {
		this.vechime = vechime;
	}
	
	
}
