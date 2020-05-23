/**
 * 
 */
package com.neeraj.nvpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import com.neeraj.nvpetclinic.model.Pet;

/**
 * @author Neeraj
 *
 */
public interface PetRepository extends CrudRepository<Pet, Long>
{

}
