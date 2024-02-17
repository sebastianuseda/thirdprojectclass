package co.edu.uniminuto.dao;

import java.util.List;

import co.edu.uniminuto.model.Dato;

public interface DaatoDaoI {
	
	Dato addDato(Dato dato);
	Dato upDato(Dato dato);
	void deleteId(int id);
	List<Dato> getAllDato();
	Dato searchDato(String email);
	Dato searchDatoId(int id);

}
