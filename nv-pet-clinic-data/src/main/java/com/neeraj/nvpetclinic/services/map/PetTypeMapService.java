/**
 * 
 */
package com.neeraj.nvpetclinic.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.neeraj.nvpetclinic.model.PetType;
import com.neeraj.nvpetclinic.services.PetTypeService;

/**
 * @author Neeraj
 *
 */
@Service
public class PetTypeMapService extends AbstractMapService<PetType, Long> implements PetTypeService {

	@Override
	public PetType save(PetType object) {
		return super.save(object);
	}
	
	@Override
	public Set<PetType> findAll(){
		return super.findAll();
	}
	
	@Override
	public PetType findById(Long id) {
		return super.findById(id);
	}
	
	@Override
	public void deleteById(Long id) {
		super.deleteById(id);;
	}

	@Override
	public void delete(PetType object) {
		super.delete(object);
	}
}