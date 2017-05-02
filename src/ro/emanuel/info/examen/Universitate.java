package ro.emanuel.info.examen;

import java.util.ArrayList;


public class Universitate {
	
	ArrayList <Angajat> angajati = new ArrayList<Angajat>();
	ArrayList <Student> studenti = new  ArrayList<Student>();
	ArrayList <Act> acte = new  ArrayList<Act>();
	
	public void adaugaAngajat(Angajat a) {
			angajati.add(a);
	}
	
	public void afisareAngajati(){
		for (Angajat a : angajati) {
			System.out.println(a.getNume() + " " +a.getPrenume() + " " + a.getFunctie());
		} 
	}
	
	public void adaugaStudent(Student s) {
		studenti.add(s);
	}

	public void afisareStudenti(){
		for (Student s : studenti) {
			System.out.println(s.getNume() +  " " + s.getPrenume()+  " din anul " + s.getAnul());
		} 
	}
	
	public void eliberareDiploma(Diploma d){
		//studentul e adaugat in contructorul actului
		acte.add(d);
	}
	
	public void eliberareAdeverinta(Adeverinta a){
		//studentul e adaugat in contructorul actului
		acte.add(a);
	}
	
	public void afisareActe(){
		for (Act act : acte) {
			if(act instanceof Diploma)
			System.out.println("Diploma din data " + act.getDataEmiterii() + " pentru studentul " + act.getStudent().getNume() + " " + act.getStudent().getPrenume());
			else{
				System.out.println("Adeverinta din data " + act.getDataEmiterii() + " pentru studentul " + act.getStudent().getNume() + " " + act.getStudent().getPrenume());

			}
			
		}
	}
	
	
}
