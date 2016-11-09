package it.alfasoft.martina.dataTable;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="data", eager=true)
public class ProvaDataTable implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<Studente> studenti;
	
	public ProvaDataTable(){
		this.studenti=new ArrayList<Studente>();
		Studente s1 = new Studente("Martina","Debernardi","s165892");
		Studente s2 = new Studente("Luca","Umoretto","s165654");
		Studente s3 = new Studente("Irene","Aimone","s167823");
		studenti.add(s1);
		studenti.add(s2);
		studenti.add(s3);
	}

	public List<Studente> getStudenti() {
		return studenti;
	}

	public void setStudenti(List<Studente> studenti) {
		this.studenti = studenti;
	}

}
