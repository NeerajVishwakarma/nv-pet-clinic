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
@Table(name = "specialities")
public class Speciality extends BaseEntity {

	@Column(name = "description")
	private String description;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
