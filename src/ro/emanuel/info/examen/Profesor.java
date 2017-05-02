package ro.emanuel.info.examen;

public class Profesor extends Angajat {
	
	public static final int INDEX_NUMERIC = 5;
	private boolean isConferentiar;
	
	
	public Profesor(String nume, String prenume, String functie, int vechime, boolean isConferentiar) {
		super(nume, prenume, functie, vechime);
	this.isConferentiar = isConferentiar;
	}

	@Override
public void afisareSalar() {
		
		if(isConferentiar = true){
			System.out.println(INDEX_NUMERIC * 0.67 + getVechime() * 0.15+ 100);
		}else{
		
		System.out.println(INDEX_NUMERIC * 0.67 + getVechime() * 0.15);
		}
	}

	public boolean isConferentiar() {
		return isConferentiar;
	}

	public void setConferentiar(boolean isConferentiar) {
		this.isConferentiar = isConferentiar;
	}

}
