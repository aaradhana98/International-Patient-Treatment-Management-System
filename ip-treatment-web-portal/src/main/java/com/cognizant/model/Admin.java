package com.cognizant.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 * @author Isha, Aaradhana, Nikhil, Adisha
 * 
 * 		model class for Admin Login Details
 * 
 *      @Data is a convenient shortcut annotation that bundles 
 *      the features of @ToString , @EqualsAndHashCode , @Getter / @Setter 
 *      and @RequiredArgsConstructor together
 *
 */
@Data
@Entity(name = "user")
@NoArgsConstructor
@AllArgsConstructor
public class Admin {

	@Id
	@Column(name = "userid", length = 20)
	private String userid;

	@Column(name = "upassword", length = 20)
	private String upassword;

	@Column(name = "uname", length = 20)
	private String uname;

	private String authToken;
}
