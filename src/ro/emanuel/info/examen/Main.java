package ro.emanuel.info.examen;

public class Main {
	public static void main(String args[]){
		
		Universitate ueo = new Universitate();
		
		Angajat p1 = new Profesor("Bodog", "Mircea", "Profesor", 3, true);
		Angajat a1 = new PersonalAuxiliar("Pop", "Ion", "Administrator", 6, true);
		Student s1 = new Student("Cruceru", "Lucas", 1);
		Student s2 = new Student("Popovici", "Lucretia",2);
		
		Adeverinta a = new Adeverinta(s1, true, 14);
		Diploma d = new Diploma(s1, true, 2019);
		
		//metodele din clasa angajat + copii
		a1.getNumePrenumeFct();
		a1.afisareSalar();
		p1.getNumePrenumeFct();
		p1.afisareSalar();
		
		//operatii din universitate
		ueo.adaugaAngajat(a1);
		ueo.adaugaAngajat(p1);
		ueo.afisareAngajati();
		ueo.adaugaStudent(s1);
		ueo.adaugaStudent(s2);
		ueo.afisareStudenti();
		ueo.eliberareAdeverinta(a);
		ueo.eliberareDiploma(d);
		ueo.afisareActe();
		
		
	}
}
