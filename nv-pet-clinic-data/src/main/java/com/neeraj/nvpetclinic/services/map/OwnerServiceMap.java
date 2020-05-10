/**
 * 
 */
package com.neeraj.nvpetclinic.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.neeraj.nvpetclinic.model.Owner;
import com.neeraj.nvpetclinic.model.Pet;
import com.neeraj.nvpetclinic.services.OwnerService;
import com.neeraj.nvpetclinic.services.PetSerivce;
import com.neeraj.nvpetclinic.services.PetTypeService;

/**
 * @author Neeraj
 *
 */
@Service
public class OwnerServiceMap extends AbstractMapService<Owner,Long> implements OwnerService {

	private final PetTypeService petTypeService;
	private final PetSerivce petService;
	
	/**
	 * @param petTypeService
	 * @param petService
	 */
	public OwnerServiceMap(PetTypeService petTypeService, PetSerivce petService) {
		this.petTypeService = petTypeService;
		this.petService = petService;
	}

	@Override
	public Owner save(Owner object) {
		if(object != null) {
			if(object.getPets()!=null) {
				object.getPets().forEach(pet -> {
					if(pet.getPetType()!=null) {
						if(pet.getPetType().getId() == null) {
							pet.setPetType(petTypeService.save(pet.getPetType()));
						}
					}else {
						throw new RuntimeException("Pet Type is missing");
					}
					
					if(pet.getId() ==null) {
						Pet savedPet = petService.save(pet);
						pet.setId(savedPet.getId());
					}
				});
			}
			return super.save(object);
			
		}else {
			return null;
		}
		
	}
	
	@Override
	public Set<Owner> findAll(){
		return super.findAll();
	}
	
	@Override
	public Owner findById(Long id) {
		return super.findById(id);
	}
	
	@Override
	public void deleteById(Long id) {
		super.deleteById(id);;
	}

	@Override
	public void delete(Owner object) {
		super.delete(object);
	}

	@Override
	public Owner findByLastName(String lastName) {
		// TODO Auto-generated method stub
		return null;
	}

}
