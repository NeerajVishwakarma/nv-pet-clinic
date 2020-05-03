/**
 * 
 */
package com.neeraj.nvpetclinic.services;

import java.util.Set;

import com.neeraj.nvpetclinic.model.Owner;

/**
 * @author Neeraj
 *
 */
public interface OwnerService {

	Owner findByLastName(String lastName);
	
	Owner findById(Long id);
	
	Owner save(Owner owner);
	
	Set<Owner> findAll();
}
