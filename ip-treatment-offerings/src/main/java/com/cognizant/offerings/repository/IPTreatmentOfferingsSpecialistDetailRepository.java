package com.cognizant.offerings.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.offerings.model.SpecialistDetail;

/**
 * 
 * @author Isha, Aaradhana, Nikhil, Adisha
 * 
 * 		@Repository indicates that the class provides the mechanism for storage,
 * 		retrieval, search, update and delete operation on objects
 *
 */
@Repository
public interface IPTreatmentOfferingsSpecialistDetailRepository extends JpaRepository<SpecialistDetail, Long>{

}
