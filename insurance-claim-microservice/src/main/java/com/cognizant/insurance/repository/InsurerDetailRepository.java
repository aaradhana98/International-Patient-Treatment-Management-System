package com.cognizant.insurance.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.insurance.model.InsurerDetail;

/**
 * 
 * @author Isha, Aaradhana, Nikhil, Adisha
 * 
 * 		@Repository indicates that the class provides the mechanism for storage,
 * 		retrieval, search, update and delete operation on objects
 *
 */
public interface InsurerDetailRepository extends JpaRepository<InsurerDetail, Long>{

}
