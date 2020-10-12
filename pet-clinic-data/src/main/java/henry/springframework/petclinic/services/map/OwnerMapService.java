package henry.springframework.petclinic.services.map;

import henry.springframework.petclinic.model.Owner;
import henry.springframework.petclinic.model.Pet;
import henry.springframework.petclinic.services.OwnerService;
import henry.springframework.petclinic.services.PetService;
import henry.springframework.petclinic.services.PetTypeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Profile({"default", "map"})
public class OwnerMapService extends AbstractMapService<Owner, Long> implements OwnerService {

    private final PetService petService;
    private PetTypeService petTypeService;

    public OwnerMapService(PetService petService, PetTypeService petTypeService) {
        this.petService = petService;
        this.petTypeService = petTypeService;
    }

    @Override
    public Set<Owner> findAll() {

        return super.findAll();
    }

    @Override
    public void delete(Owner object) {
    super.delete(object);
    }


    @Override
    public Owner save(Owner object) {
        if(object != null){
            if(object.getCity() != null){
                object.getPets().forEach(pet -> {
                    if(pet.getPetType() != null){
                        pet.setPetType(petTypeService.save(pet.getPetType()));
                    }else {
                        throw new RuntimeException("Pet type is required");
                    }
                    if(pet.getId() ==null){
                        Pet savedPet = petService.save(pet);
                        pet.setId(savedPet.getId());
                    }
                });
            }
            return super.save(object);
        }else {
            return null;
        }

    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Owner findById(Long id) {
        return this.findById(id);
    }

    @Override
    public Owner findByName(String lastName) {
        return null;
    }
}
