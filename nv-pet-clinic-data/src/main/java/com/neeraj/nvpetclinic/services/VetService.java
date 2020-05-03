/**
 * 
 */
package com.neeraj.nvpetclinic.services;

import java.util.Set;

import com.neeraj.nvpetclinic.model.Vet;

/**
 * @author Neeraj
 *
 */
public interface VetService {

	Vet findById(Long id);

	Vet save(Vet vet);

	Set<Vet> findAll();

}
