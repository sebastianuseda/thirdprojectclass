package co.edu.uniminuto.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.edu.uniminuto.model.Dato;
@Repository
public class DatoDao implements DaatoDaoI {
	
	@Autowired
	DatoJpaI datoJpa;

	@Override
	public Dato addDato(Dato dato) {
		// TODO Auto-generated method stub
		return datoJpa.save(dato);
	}

	@Override
	public Dato upDato(Dato dato) {
		// TODO Auto-generated method stub
		return datoJpa.save(dato);
	}

	@Override
	public void deleteId(int id) {
		// TODO Auto-generated method stub
		
		datoJpa.deleteById(id);
	}

	@Override
	public List<Dato> getAllDato() {
		// TODO Auto-generated method stub
		return datoJpa.findAll();
	}

	@Override
	public Dato searchDato(String email) {
		// TODO Auto-generated method stub
		return datoJpa.findByDatEmail(email);
	}

	@Override
	public Dato searchDatoId(int id) {
		// TODO Auto-generated method stub
		return datoJpa.findById(id).orElse(null);
	}
	
	

}
