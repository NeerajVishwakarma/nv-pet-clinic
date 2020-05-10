/**
 * 
 */
package com.neeraj.nvpetclinic.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.neeraj.nvpetclinic.model.PetType;
import com.neeraj.nvpetclinic.model.Speciality;
import com.neeraj.nvpetclinic.services.SpecialtiesService;

/**
 * @author Neeraj
 *
 */
@Service
public class SpecialityMapService extends AbstractMapService<Speciality, Long> implements SpecialtiesService {

	@Override
	public Speciality save(Speciality object) {
		return super.save(object);
	}
	
	@Override
	public Set<Speciality> findAll(){
		return super.findAll();
	}
	
	@Override
	public Speciality findById(Long id) {
		return super.findById(id);
	}
	
	@Override
	public void deleteById(Long id) {
		super.deleteById(id);;
	}

	@Override
	public void delete(Speciality object) {
		super.delete(object);
	}
}