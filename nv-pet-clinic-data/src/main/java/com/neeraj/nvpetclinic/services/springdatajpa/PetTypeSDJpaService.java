/**
 * 
 */
package com.neeraj.nvpetclinic.services.springdatajpa;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.neeraj.nvpetclinic.model.PetType;
import com.neeraj.nvpetclinic.repositories.PetTypeRepository;
import com.neeraj.nvpetclinic.services.PetTypeService;

/**
 * @author Neeraj
 *
 */
@Service
@Profile("springdatajpa")
public class PetTypeSDJpaService implements PetTypeService {

	private PetTypeRepository petTypeRepository;

	public PetTypeSDJpaService(PetTypeRepository petTypeRepository) {
		this.petTypeRepository = petTypeRepository;
	}

	@Override
	public Set<PetType> findAll() {
		Set<PetType> petTypes = new HashSet<PetType>();
		petTypeRepository.findAll().forEach(petTypes::add);
		return petTypes;
	}

	@Override
	public PetType findById(Long id) {
		Optional<PetType> optionalPetType = petTypeRepository.findById(id);
		if (optionalPetType.isPresent())
			return optionalPetType.get();
		else
			return null;
	}

	@Override
	public PetType save(PetType object) {
		return petTypeRepository.save(object);
	}

	@Override
	public void delete(PetType object) {
		petTypeRepository.delete(object);
	}

	@Override
	public void deleteById(Long id) {
		petTypeRepository.deleteById(id);
	}

}
