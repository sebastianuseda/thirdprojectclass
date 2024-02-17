package co.edu.uniminuto.service;

import java.util.List;

import co.edu.uniminuto.model.Dato;

public interface DatoServiceI {

	boolean addDato(Dato dato);
	void upDato(Dato dato);
	boolean deleteId(int id);
	List<Dato> getAllDato();
	Dato searchDato(String email);
	Dato searchDatoId(int id);
	
}
