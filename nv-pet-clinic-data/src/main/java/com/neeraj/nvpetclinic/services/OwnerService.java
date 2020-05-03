/**
 * 
 */
package com.neeraj.nvpetclinic.services;

import com.neeraj.nvpetclinic.model.Owner;

/**
 * @author Neeraj
 *
 */
public interface OwnerService extends CrudService<Owner, Long>{

	Owner findByLastName(String lastName);
	
}
