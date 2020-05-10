/**
 * 
 */
package com.neeraj.nvpetclinic.bootstrap;

import java.time.LocalDate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.neeraj.nvpetclinic.model.Owner;
import com.neeraj.nvpetclinic.model.Pet;
import com.neeraj.nvpetclinic.model.PetType;
import com.neeraj.nvpetclinic.model.Speciality;
import com.neeraj.nvpetclinic.model.Vet;
import com.neeraj.nvpetclinic.services.OwnerService;
import com.neeraj.nvpetclinic.services.PetTypeService;
import com.neeraj.nvpetclinic.services.SpecialtyService;
import com.neeraj.nvpetclinic.services.VetService;

/**
 * @author Neeraj
 *
 */
@Component
public class DataLoader implements CommandLineRunner {

	private final OwnerService ownerService;
	private final VetService vetService;
	private final PetTypeService petTypeService;
	private final SpecialtyService specialtiesService;

	/**
	 * @param ownerService
	 * @param vetService
	 * @param petTypeService
	 * @param specialtiesService
	 */
	public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService,
			SpecialtyService specialtiesService) {
		this.ownerService = ownerService;
		this.vetService = vetService;
		this.petTypeService = petTypeService;
		this.specialtiesService = specialtiesService;
	}

	@Override
	public void run(String... args) throws Exception {

		int count = petTypeService.findAll().size();

		if (count == 0) {
			loadData();
		}
		
	}

	private void loadData() {
		PetType dog = new PetType();
		dog.setName("Dog");
		PetType saveDogType = petTypeService.save(dog);

		PetType cat = new PetType();
		dog.setName("Cat");
		PetType saveCatType = petTypeService.save(cat);

		Speciality radiology = new Speciality();
		radiology.setDescription("Radiology Study");
		Speciality saveRadiology = specialtiesService.save(radiology);

		Speciality surgery = new Speciality();
		surgery.setDescription("surgery Study");
		Speciality savesurgery = specialtiesService.save(surgery);

		Speciality dentistry = new Speciality();
		dentistry.setDescription("dentistry Study");
		Speciality savedentistry = specialtiesService.save(dentistry);

		Owner o1 = new Owner();
		o1.setFirstName("Naveen");
		o1.setLastName("Bansal");
		o1.setAddress("123 Baker Street");
		o1.setCity("Miami");
		o1.setTelephone("1212121");

		Pet naveensPet = new Pet();
		naveensPet.setPetType(saveDogType);
		naveensPet.setOwner(o1);
		naveensPet.setBirthDate(LocalDate.now());
		naveensPet.setName("Monty");
		o1.getPets().add(naveensPet);
		ownerService.save(o1);

		System.out.println("=======Loaded Owner=====");

		Owner o2 = new Owner();
		o2.setFirstName("Jitu");
		o2.setLastName("Kumar");
		o2.setAddress("123 Baker Street");
		o2.setCity("Miami");
		o2.setTelephone("121212134");

		Pet jituCat = new Pet();
		jituCat.setName("Just Cat");
		jituCat.setOwner(o2);
		jituCat.setBirthDate(LocalDate.now());
		jituCat.setPetType(saveCatType);
		o2.getPets().add(jituCat);

		ownerService.save(o2);

		System.out.println("=======Loaded Owner=====");

		Vet v1 = new Vet();
		v1.setFirstName("Mandal");
		v1.setLastName("Sharma");
		v1.getSpecialities().add(saveRadiology);

		vetService.save(v1);

		System.out.println("=======Loaded Vet=====");

		Vet v2 = new Vet();
		v2.setFirstName("Shreya");
		v2.setLastName("Gagroo");
		v2.getSpecialities().add(savesurgery);
		vetService.save(v2);

		System.out.println("=======Loaded Vet=====");
	}

}
