/**
 * 
 */
package com.neeraj.nvpetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.neeraj.nvpetclinic.model.Owner;
import com.neeraj.nvpetclinic.model.Vet;
import com.neeraj.nvpetclinic.services.OwnerService;
import com.neeraj.nvpetclinic.services.VetService;
import com.neeraj.nvpetclinic.services.map.OwnerServiceMap;
import com.neeraj.nvpetclinic.services.map.VetServiceMap;

/**
 * @author Neeraj
 *
 */
@Component
public class DataLoader implements CommandLineRunner{

	private final OwnerService ownerService;
	private final VetService vetService;
	
	public DataLoader(OwnerService ownerService, VetService vetService) {
		this.ownerService = ownerService;
		this.vetService = vetService;
	}

	@Override
	public void run(String... args) throws Exception {
		Owner o1 = new Owner();
		o1.setId(1L);
		o1.setFirstName("Naveen");
		o1.setLastName("Bansal");
		
		ownerService.save(o1);
		
		System.out.println("=======Loaded Owner=====");
		
		
		Owner o2 = new Owner();
		o2.setId(2L);
		o2.setFirstName("Jitu");
		o2.setLastName("Kumar");
		
		ownerService.save(o2);
		
		System.out.println("=======Loaded Owner=====");
		
		Vet v1 = new Vet();
		v1.setId(1L);
		v1.setFirstName("Mandal");
		v1.setLastName("Sharma");
		
		vetService.save(v1);
		
		System.out.println("=======Loaded Vet=====");
		
		Vet v2 = new Vet();
		v2.setId(2L);
		v2.setFirstName("Shreya");
		v2.setLastName("Gagroo");
		
		vetService.save(v2);
		
		System.out.println("=======Loaded Vet=====");
	}

	
}
