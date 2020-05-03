/**
 * 
 */
package com.neeraj.nvpetclinic.services.map;

import java.util.Set;

import com.neeraj.nvpetclinic.model.Vet;
import com.neeraj.nvpetclinic.services.CrudService;

/**
 * @author Neeraj
 *
 */
public class VetServiceMap extends AbstractMapService<Vet, Long> implements CrudService<Vet, Long> {

	@Override
	public Vet save(Vet object) {
		return super.save(object.getId(), object);
	}
	
	@Override
	public Set<Vet> findAll(){
		return super.findAll();
	}
	
	@Override
	public Vet findById(Long id) {
		return super.findById(id);
	}
	
	@Override
	public void deleteById(Long id) {
		super.deleteById(id);;
	}

	@Override
	public void delete(Vet object) {
		super.delete(object);
	}
}
