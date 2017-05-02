package ro.emanuel.info.examen;

public class Student {
	
	private String nume;
	private String prenume;
	private int anul;
	
	
	public Student(String nume, String prenume, int anul) {
		super();
		this.nume = nume;
		this.prenume = prenume;
		this.anul = anul;
	}
	
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public String getPrenume() {
		return prenume;
	}
	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}
	public int getAnul() {
		return anul;
	}
	public void setAnul(int anul) {
		this.anul = anul;
	}
	

}
