package guru.springframework.sfgpetclinic.repositories;

import guru.springframework.sfgpetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

/**
 * @author d.monterey on 13/07/2020
 */
public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
