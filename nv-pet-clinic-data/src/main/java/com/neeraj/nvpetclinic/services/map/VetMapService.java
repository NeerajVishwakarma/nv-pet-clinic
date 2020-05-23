/**
 * 
 */
package com.neeraj.nvpetclinic.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.neeraj.nvpetclinic.model.Speciality;
import com.neeraj.nvpetclinic.model.Vet;
import com.neeraj.nvpetclinic.services.SpecialtyService;
import com.neeraj.nvpetclinic.services.VetService;

/**
 * @author Neeraj
 *
 */
@Service
public class VetMapService extends AbstractMapService<Vet, Long> implements VetService {

	private final SpecialtyService specialtyService;

	/**
	 * @param specialtyService
	 */
	public VetMapService(SpecialtyService specialtyService) {
		this.specialtyService = specialtyService;
	}

@Override
	public Vet save(Vet object) {
		
		if(object.getSpecialities().size()>0) {
			object.getSpecialities().forEach(specialty ->{
				if(specialty.getId()==null) {
					Speciality savedSpecialty = specialtyService.save(specialty);
					specialty.setId(savedSpecialty.getId());
				}
			});
		}
		
		return super.save(object);
	}

	@Override
	public Set<Vet> findAll() {
		return super.findAll();
	}

	@Override
	public Vet findById(Long id) {
		return super.findById(id);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
		;
	}

	@Override
	public void delete(Vet object) {
		super.delete(object);
	}
}
