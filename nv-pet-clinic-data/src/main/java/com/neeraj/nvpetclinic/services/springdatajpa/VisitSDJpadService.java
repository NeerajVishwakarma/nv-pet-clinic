/**
 * 
 */
package com.neeraj.nvpetclinic.services.springdatajpa;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.neeraj.nvpetclinic.model.Visit;
import com.neeraj.nvpetclinic.repositories.VisitRepository;
import com.neeraj.nvpetclinic.services.VisitService;

/**
 * @author Neeraj
 *
 */
@Service
@Profile("springdatajpa")
public class VisitSDJpadService implements VisitService{

	private final VisitRepository visitRepository;
	
	public VisitSDJpadService(VisitRepository visitRepository) {
		this.visitRepository = visitRepository;
	}

	@Override
	public Set<Visit> findAll() {
		Set<Visit> visit = new HashSet<Visit>();
		visitRepository.findAll().forEach(visit::add);
		return visit;
	}

	@Override
	public Visit findById(Long id) {
		Optional<Visit> optionalVisit = visitRepository.findById(id);
		if (optionalVisit.isPresent())
			return optionalVisit.get();
		else
			return null;
	}

	@Override
	public Visit save(Visit object) {
		return visitRepository.save(object);
	}

	@Override
	public void delete(Visit object) {
		visitRepository.delete(object);
	}

	@Override
	public void deleteById(Long id) {
		visitRepository.deleteById(id);
	}

}
