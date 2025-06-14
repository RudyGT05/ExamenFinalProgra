package umg.edu.gt.service.impl;

import umg.edu.gt.model.Person;
import umg.edu.gt.repository.PersonRepository;
import umg.edu.gt.service.IPersonService;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class PersonServiceImpl implements IPersonService {

	@Inject
	PersonRepository personRepository; // Inyecta PanacheRepository

	@Override
	@Transactional
	public void save(Person person) {
		personRepository.persist(person);
	}
}
