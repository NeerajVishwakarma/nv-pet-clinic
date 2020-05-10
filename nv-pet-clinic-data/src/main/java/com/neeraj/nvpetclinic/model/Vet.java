/**
 * 
 */
package com.neeraj.nvpetclinic.model;

import java.util.Set;

/**
 * @author Neeraj
 *
 */
public class Vet extends Person {

	private Set<Speciality> specialities;

	public Set<Speciality> getSpecialities() {
		return specialities;
	}

	public void setSpecialities(Set<Speciality> specialities) {
		this.specialities = specialities;
	}
	
}
