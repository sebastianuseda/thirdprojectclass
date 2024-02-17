package co.edu.uniminuto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.uniminuto.dao.DaatoDaoI;
import co.edu.uniminuto.model.Dato;

@Service
public class DatoService implements DatoServiceI {
	
	@Autowired
	DaatoDaoI dao;

	@Override
	public boolean addDato(Dato dato) {
		// TODO Auto-generated method stub
		if (dao.searchDato(dato.getDatEmail())== null) {
			dao.addDato(dato);
			return true;
		}
		return false;
	}

	@Override
	public void upDato(Dato dato) {
		// TODO Auto-generated method stub
		if (dao.searchDatoId(dato.getDatId())!= null) {
			dao.addDato(dato);
			
		}
		
		
	}

	@Override
	public boolean deleteId(int id) {
		// TODO Auto-generated method stub
		if (dao.searchDatoId(id)!= null) {
			dao.deleteId(id);
			return true;
			
		}
		
		return false;
	}

	@Override
	public List<Dato> getAllDato() {
		// TODO Auto-generated method stub
		
		return dao.getAllDato();
	}

	@Override
	public Dato searchDato(String email) {
		// TODO Auto-generated method stub

		return dao.searchDato(email);
	}

	@Override
	public Dato searchDatoId(int id) {
		// TODO Auto-generated method stub
		return dao.searchDatoId(id);
	}

}
