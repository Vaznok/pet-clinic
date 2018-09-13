package spring.vlasenko.petclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import spring.vlasenko.petclinic.model.Owner;
import spring.vlasenko.petclinic.model.Pet;
import spring.vlasenko.petclinic.model.Vet;
import spring.vlasenko.petclinic.service.OwnerService;
import spring.vlasenko.petclinic.service.PetService;
import spring.vlasenko.petclinic.service.VetService;
import spring.vlasenko.petclinic.service.map.OwnerServiceMap;
import spring.vlasenko.petclinic.service.map.PetServiceMap;
import spring.vlasenko.petclinic.service.map.VetServiceMap;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetService petService;

    public DataLoader() {
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();
        petService = new PetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");

        ownerService.save(owner2);

        System.out.println("Loaded Owners....");

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Jessie");
        vet2.setLastName("Porter");

        vetService.save(vet2);

        System.out.println("Loaded Vets....");
    }
}