package guru.springframework.sfgpetclinic.repositories;

import guru.springframework.sfgpetclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

/**
 * @author d.monterey on 13/07/2020
 */
public interface VetRepository extends CrudRepository<Vet, Long> {
}
