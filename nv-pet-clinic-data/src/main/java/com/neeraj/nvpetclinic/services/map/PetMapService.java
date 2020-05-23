/**
 * 
 */
package com.neeraj.nvpetclinic.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.neeraj.nvpetclinic.model.Pet;
import com.neeraj.nvpetclinic.services.PetSerivce;

/**
 * @author Neeraj
 *
 */
@Service
public class PetMapService extends AbstractMapService<Pet, Long> implements PetSerivce {

	@Override
	public Pet save(Pet object) {
		return super.save(object);
	}
	
	@Override
	public Set<Pet> findAll(){
		return super.findAll();
	}
	
	@Override
	public Pet findById(Long id) {
		return super.findById(id);
	}
	
	@Override
	public void deleteById(Long id) {
		super.deleteById(id);;
	}

	@Override
	public void delete(Pet object) {
		super.delete(object);
	}
}
