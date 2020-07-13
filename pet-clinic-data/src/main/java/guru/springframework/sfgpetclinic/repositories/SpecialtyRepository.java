package guru.springframework.sfgpetclinic.repositories;

import guru.springframework.sfgpetclinic.model.Specialty;
import org.springframework.data.repository.CrudRepository;

/**
 * @author d.monterey on 13/07/2020
 */
public interface SpecialtyRepository extends CrudRepository<Specialty, Long> {
}
