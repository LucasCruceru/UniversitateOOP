package ro.emanuel.info.examen;

import java.util.Date;

public abstract class Act {
	
	private Date dataEmiterii;
	private Student student;
	private boolean isStampilat;

	public Act(Student student, boolean isStampilat) {
		super();
		Date tempDate = new Date(System.currentTimeMillis());
		this.dataEmiterii = tempDate;
		this.student = student;
		this.isStampilat = isStampilat;
	}
	

	public Date getDataEmiterii() {
		return dataEmiterii;
	}

	public void setDataEmiterii(Date dataEmiterii) {
		this.dataEmiterii = dataEmiterii;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}


	public boolean isStampilat() {
		return isStampilat;
	}


	public void setStampilat(boolean isStampilat) {
		this.isStampilat = isStampilat;
	}

	
	
	

}
