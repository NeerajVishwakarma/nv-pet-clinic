/**
 * 
 */
package com.neeraj.nvpetclinic.services;

import java.util.Set;

/**
 * @author Neeraj
 *
 */
public interface CrudService<T, ID> {

	Set<T> findAll();
	
	T findById(ID id);
	
	T save(T object);
	
	void delete(T object);
	
	void deleteById(ID id);
}
