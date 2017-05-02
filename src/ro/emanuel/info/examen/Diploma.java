package ro.emanuel.info.examen;


public class Diploma extends Act {

	private int anulGraduarii;
	
	public Diploma(Student student, boolean isStampilat, int anulGraduarii) {
		super(student, isStampilat);
		this.anulGraduarii = anulGraduarii;
	}
	
	
	public int getAnulGraduarii() {
		return anulGraduarii;
	}

	public void setAnulGraduarii(int anulGraduarii) {
		this.anulGraduarii = anulGraduarii;
	}
	
}
