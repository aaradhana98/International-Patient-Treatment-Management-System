package com.cognizant.treatments.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

import lombok.AllArgsConstructor;

import lombok.NoArgsConstructor;
import lombok.Data;

/**
 * 
 * @author Isha, Aaradhana, Nikhil, Adisha
 * 
 * 		model class for PackageDetail
 * 
 * 		@Entity indicates Spring Data JPA that it is an entity class for the
 *      application
 *      @Data is a convenient shortcut annotation that bundles 
 *      the features of @ToString , @EqualsAndHashCode , @Getter / @Setter 
 *      and @RequiredArgsConstructor together
 *
 */

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data

public class TreatmentPlan {

	
	/**
	 * instance variables
	 * @Id for primary key attribute
	 * @SequenceGenerator @Generatedvalue to automatically generate id's
	 */
	
	@Id
	@SequenceGenerator(name = "mySeqGen", sequenceName = "myDbSeq", initialValue = 1)
	@GeneratedValue(generator = "mySeqGen")
	private long id;

	/**
	 * @ManyToOne many treatment plans can be there for a single patient
	 * @JoinColumn where ptDetails contains the value from PatientDetail entity
	 */
	
	@ManyToOne(fetch = FetchType.EAGER, targetEntity = PatientDetail.class)
	@JoinColumn(name = "tp_pt_id")
	private PatientDetail ptDetail; 
	private String testDetails; 
	private String packageName; 
	private String specialist;
	private double cost;
	private String status;
	private String treatmentCommencementDate;
	private String treatmentEndDate;

}
