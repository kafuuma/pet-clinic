package henry.springframework.petclinic.repositories;

import henry.springframework.petclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository  extends CrudRepository<Owner, Long> {

    Owner findByLastName(String lastName);
}
