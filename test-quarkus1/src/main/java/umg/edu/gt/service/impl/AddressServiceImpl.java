package umg.edu.gt.service.impl;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import umg.edu.gt.dto.AddressDto;
import umg.edu.gt.mapper.AddressMapper;
import umg.edu.gt.model.Address;
import umg.edu.gt.model.Person;
import umg.edu.gt.repository.AddressRepository;
import umg.edu.gt.repository.PersonRepository;
import umg.edu.gt.service.IAddressService;

import java.util.List;
import java.util.stream.Collectors;

@ApplicationScoped
public class AddressServiceImpl implements IAddressService {

    @Inject
    AddressRepository addressRepository;

    @Inject
    PersonRepository personRepository;

    @Inject
    AddressMapper addressMapper;

    @Override
    @Transactional
    public void create(AddressDto dto) {
        Address address = addressMapper.toEntity(dto);
        Person person = personRepository.findById(dto.getPersonId());
        address.setPerson(person);
        addressRepository.persist(address);
    }

    @Override
    public List<AddressDto> findAll() {
        return addressRepository.listAll().stream()
                .map(addressMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public List<AddressDto> findByPersonId(Long personId) {
        return addressRepository.findByPersonId(personId).stream()
                .map(addressMapper::toDto)
                .collect(Collectors.toList());
    }
}
