/**
 * 
 */
package com.neeraj.nvpetclinic.services;

import java.util.Set;

import com.neeraj.nvpetclinic.model.Pet;

/**
 * @author Neeraj
 *
 */
public interface PetSerivce {

	Pet findById(Long id);
	
	Pet save(Pet pet);
	
	Set<Pet> findAll();
	
}
