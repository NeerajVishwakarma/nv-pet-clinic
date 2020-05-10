/**
 * 
 */
package com.neeraj.nvpetclinic.model;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Neeraj
 *
 */
public class Vet extends Person {

	private Set<Speciality> specialities=new HashSet<Speciality>();

	public Set<Speciality> getSpecialities() {
		return specialities;
	}

	public void setSpecialities(Set<Speciality> specialities) {
		this.specialities = specialities;
	}
	
}
