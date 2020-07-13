package guru.springframework.sfgpetclinic.repositories;

import guru.springframework.sfgpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

/**
 * @author d.monterey on 13/07/2020
 */
public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
