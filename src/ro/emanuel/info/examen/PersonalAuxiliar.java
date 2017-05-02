package ro.emanuel.info.examen;

public class PersonalAuxiliar extends Angajat {
	
	public static final int INDEX_NUMERIC = 3;
	
	public boolean isAdministrator;

	

	public PersonalAuxiliar(String nume, String prenume, String functie, int vechime, boolean isAdministrator) {
		super(nume, prenume, functie, vechime);
		this.isAdministrator = isAdministrator;
	}

	public void afisareSalar() {
		
		if(isAdministrator = true){
			System.out.println(INDEX_NUMERIC * 0.67 + getVechime() * 0.15+ 100);
		}else{
		
		System.out.println(INDEX_NUMERIC * 0.67 + getVechime() * 0.15);
		}
	}
	
	public boolean isAdministrator() {
		return isAdministrator;
	}

	public void setAdministrator(boolean isAdministrator) {
		this.isAdministrator = isAdministrator;
	}
}
