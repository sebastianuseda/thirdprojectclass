package co.edu.uniminuto.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.uniminuto.model.Dato;

public interface DatoJpaI  extends JpaRepository<Dato, Integer>{
	
	Dato findByDatEmail (String datEmail);

}
