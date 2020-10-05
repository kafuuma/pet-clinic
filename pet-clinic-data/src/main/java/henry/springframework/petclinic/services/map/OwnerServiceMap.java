package henry.springframework.petclinic.services.map;

import henry.springframework.petclinic.model.Owner;
import henry.springframework.petclinic.services.OwnerService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {
    private  static int count = 0;
    protected  static Owner owner1, owner2 = null;


    static {
//        Owner owner1 = new Owner();
//        owner1.setId(1L);
//        owner1.setFirstName("Michael2");
//        owner1.setLastName("Weston2");
//        OwnerServiceMap.owner1 =owner1;
//
//        Owner owner2 = new Owner();
//        owner2.setId(2L);
//        owner2.setFirstName("Michael3");
//        owner2.setLastName("Weston3");
//        OwnerServiceMap.owner2 =owner2;
    }
    public OwnerServiceMap() {
//        super.save(owner2);
//        super.save(owner1);
        count++;
        System.out.println("owner ************"+ count);
        System.out.println(super.map.values());
    }

    @Override
    public Set<Owner> findAll() {

        System.out.println(count);
        return super.findAll();
    }

    @Override
    public void delete(Owner object) {
    super.delete(object);
    }


    @Override
    public Owner save(Owner object) {
        return super.save(object);

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
