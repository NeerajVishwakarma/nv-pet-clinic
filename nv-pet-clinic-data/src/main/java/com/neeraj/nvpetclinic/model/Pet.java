/**
 * 
 */
package com.neeraj.nvpetclinic.model;

import java.time.LocalDate;

/**
 * @author Neeraj
 *
 */
public class Pet extends BaseEntity{

	private PetType petType;
	private Owner owner;
	private LocalDate birthdate;
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public PetType getPetType() {
		return petType;
	}
	public void setPetType(PetType petType) {
		this.petType = petType;
	}
	public Owner getOwner() {
		return owner;
	}
	public void setOwner(Owner owner) {
		this.owner = owner;
	}
	public LocalDate getLocalDate() {
		return birthdate;
	}
	public void setBirthDate(LocalDate birthDate) {
		this.birthdate = birthDate;
	}
	
}
