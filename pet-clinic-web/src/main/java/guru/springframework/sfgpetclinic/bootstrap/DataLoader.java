package guru.springframework.sfgpetclinic.bootstrap;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.model.Pet;
import guru.springframework.sfgpetclinic.model.PetType;
import guru.springframework.sfgpetclinic.model.Vet;
import guru.springframework.sfgpetclinic.services.OwnerService;
import guru.springframework.sfgpetclinic.services.PetTypeService;
import guru.springframework.sfgpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

/**
 * @author d.monterey on 09/07/2020
 */
@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("Dog");
        PetType saveDogPetType = petTypeService.save(dog);

        Owner owner1 = new Owner();
        owner1.setFirstName("Juan");
        owner1.setLastName("Cruz");
        owner1.setAddress("Magungunay");
        owner1.setCity("La Union");
        owner1.setTelephone("123422121");

        Pet juanPet = new Pet();
        juanPet.setPetType(saveDogPetType);
        juanPet.setOwner(owner1);
        juanPet.setBirthDate(LocalDate.now());
        juanPet.setName("Iron Man");
        owner1.getPets().add(juanPet);

        ownerService.save(owner1);


        Owner owner2 = new Owner();
        owner2.setFirstName("John");
        owner2.setLastName("Doe");
        owner2.setAddress("Magungunay");
        owner2.setCity("La Union");
        owner2.setTelephone("123422121");

        PetType cat = new PetType();
        dog.setName("Cat");
        PetType saveCatPetType = petTypeService.save(cat);

        Pet johnPet = new Pet();
        johnPet.setPetType(saveCatPetType);
        johnPet.setOwner(owner2);
        johnPet.setBirthDate(LocalDate.now());
        johnPet.setName("Captain America");
        owner2.getPets().add(johnPet);

        ownerService.save(owner2);

        System.out.println("Loaded Owners...");

        Vet vet1 = new Vet();
        vet1.setFirstName("Tony");
        vet1.setLastName("Stark");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Steve");
        vet2.setLastName("Rogers");

        vetService.save(vet2);

        System.out.println("Loaded Vets...");

    }
}
