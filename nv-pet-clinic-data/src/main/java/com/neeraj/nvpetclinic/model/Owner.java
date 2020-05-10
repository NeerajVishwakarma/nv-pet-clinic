/**
 * 
 */
package com.neeraj.nvpetclinic.model;

import java.util.Set;

/**
 * @author Neeraj
 *
 */
public class Owner extends Person {

	private Set<Pet> pets;

	/**
	 * @return the pets
	 */
	public Set<Pet> getPets() {
		return pets;
	}

	/**
	 * @param pets the pets to set
	 */
	public void setPets(Set<Pet> pets) {
		this.pets = pets;
	}
	
	
	
}
