/**
 * 
 */
package com.neeraj.nvpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import com.neeraj.nvpetclinic.model.PetType;

/**
 * @author Neeraj
 *
 */
public interface PetTypeRepository extends CrudRepository<PetType, Long> {

}
