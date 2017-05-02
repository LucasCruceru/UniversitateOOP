package ro.emanuel.info.examen;

public class Adeverinta extends Act {

	private int nrZileValabilitate;
	
	public Adeverinta(Student student, boolean isStampilat, int nrZileValabilitate) {
		super(student, isStampilat);
	this.nrZileValabilitate = nrZileValabilitate;
	
	}

	public int getNrZileValabilitate() {
		return nrZileValabilitate;
	}

	public void setNrZileValabilitate(int nrZileValabilitate) {
		this.nrZileValabilitate = nrZileValabilitate;
	}

}
