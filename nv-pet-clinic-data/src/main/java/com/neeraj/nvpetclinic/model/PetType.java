/**
 * 
 */
package com.neeraj.nvpetclinic.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author Neeraj
 *
 */
@Entity
@Table(name = "types")
public class PetType extends BaseEntity{
	
	@Column(name = "name")
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
