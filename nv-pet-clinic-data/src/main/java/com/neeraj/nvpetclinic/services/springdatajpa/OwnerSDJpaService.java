/**
 * 
 */
package com.neeraj.nvpetclinic.services.springdatajpa;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.neeraj.nvpetclinic.model.Owner;
import com.neeraj.nvpetclinic.repositories.OwnerRepository;
import com.neeraj.nvpetclinic.repositories.PetRepository;
import com.neeraj.nvpetclinic.repositories.PetTypeRepository;
import com.neeraj.nvpetclinic.services.OwnerService;

/**
 * @author Neeraj
 *
 */
@Service
@Profile("springdatajpa")
public class OwnerSDJpaService implements OwnerService {

	private final OwnerRepository ownerRepository;
	private final PetRepository petRepository;
	private final PetTypeRepository petTypeRepository;

	public OwnerSDJpaService(OwnerRepository ownerRepository, PetRepository petRepository,
			PetTypeRepository petTypeRepository) {
		this.ownerRepository = ownerRepository;
		this.petRepository = petRepository;
		this.petTypeRepository = petTypeRepository;
	}

	@Override
	public Set<Owner> findAll() {
		Set<Owner> owners = new HashSet<Owner>();
		ownerRepository.findAll().forEach(owners::add);
		return owners;
	}

	@Override
	public Owner findById(Long id) {
		Optional<Owner> optionalOwner = ownerRepository.findById(id);
		if (optionalOwner.isPresent())
			return optionalOwner.get();
		else
			return null;
	}

	@Override
	public Owner save(Owner object) {
		return ownerRepository.save(object);
	}

	@Override
	public void delete(Owner object) {
		ownerRepository.delete(object);
	}

	@Override
	public void deleteById(Long id) {
		ownerRepository.deleteById(id);
	}

	@Override
	public Owner findByLastName(String lastName) {
		return ownerRepository.findByLastName(lastName);
	}

}
