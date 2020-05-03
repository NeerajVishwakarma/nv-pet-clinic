/**
 * 
 */
package com.neeraj.nvpetclinic.services.map;

import java.util.Set;

import com.neeraj.nvpetclinic.model.Pet;
import com.neeraj.nvpetclinic.services.CrudService;

/**
 * @author Neeraj
 *
 */
public class PetServiceMap extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long> {

	@Override
	public Pet save(Pet object) {
		return super.save(object.getId(), object);
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
