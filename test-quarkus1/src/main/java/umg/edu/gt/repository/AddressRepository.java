package umg.edu.gt.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import umg.edu.gt.model.Address;

import java.util.List;

@ApplicationScoped
public class AddressRepository implements PanacheRepository<Address> {

    public List<Address> findByPersonId(Long personId) {
        return list("person.id", personId);
    }
}
