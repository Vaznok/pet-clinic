package spring.vlasenko.petclinic.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import spring.vlasenko.petclinic.model.*;
import spring.vlasenko.petclinic.service.OwnerService;
import spring.vlasenko.petclinic.service.PetTypeService;
import spring.vlasenko.petclinic.service.SpecialityService;
import spring.vlasenko.petclinic.service.VetService;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private final SpecialityService specialityService;

    @Autowired
    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService, SpecialityService specialityService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specialityService = specialityService;
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
        cat.setName("Cat");
        PetType saveCatType = petTypeService.save(cat);

        Specialty radiology = new Specialty();
        radiology.setDescription("Radiology");
        Specialty savedRadiology = specialityService.save(radiology);

        Specialty surgery = new Specialty();
        radiology.setDescription("Surgery");
        Specialty savedSurgery = specialityService.save(radiology);

        Specialty density = new Specialty();
        radiology.setDescription("Dentistry");
        Specialty savedDensitry = specialityService.save(radiology);

        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");
        owner1.setAddress("Bylivar Slavi 38");
        owner1.setCity("Dnepr");
        owner1.setTelephone("+38-067-628-69-20");

        Pet mikesPet = new Pet();
        mikesPet.setPetType(saveDogType);
        mikesPet.setOwner(owner1);
        mikesPet.setBirthDay(LocalDate.now());
        mikesPet.setName("Rosco");
        owner1.getPets().add(mikesPet);

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");
        owner2.setAddress("Myrgorodsika 2");
        owner2.setCity("Kiev");
        owner2.setTelephone("+38-063-438-29-11");

        Pet fionasCat = new Pet();
        fionasCat.setPetType(saveCatType);
        fionasCat.setOwner(owner2);
        fionasCat.setBirthDay(LocalDate.now());
        fionasCat.setName("Murka");
        owner2.getPets().add(fionasCat);

        ownerService.save(owner2);

        System.out.println("Loaded Owners....");

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");
        vet1.getSpecialties().add(savedRadiology);

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Jessie");
        vet2.setLastName("Porter");
        vet2.getSpecialties().add(savedSurgery);

        vetService.save(vet2);

        System.out.println("Loaded Vets....");
    }
}
