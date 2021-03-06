package henry.springframework.petclinic.services;

import henry.springframework.petclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByName(String lastName);

}
