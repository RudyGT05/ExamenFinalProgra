package umg.edu.gt.mapper;

import jakarta.enterprise.context.ApplicationScoped;
import umg.edu.gt.dto.AddressDto;
import umg.edu.gt.model.Address;

@ApplicationScoped
public class AddressMapper implements IMapper<Address, AddressDto> {

    @Override
    public Address toEntity(AddressDto dto) {
        Address address = new Address();
        address.setId(dto.getId());
        address.setStreet(dto.getStreet());
        address.setCity(dto.getCity());
        // Nota: el `person` se setea en el servicio
        return address;
    }

    @Override
    public AddressDto toDto(Address entity) {
        AddressDto dto = new AddressDto();
        dto.setId(entity.getId());
        dto.setStreet(entity.getStreet());
        dto.setCity(entity.getCity());
        dto.setPersonId(entity.getPerson() != null ? entity.getPerson().getId() : null);
        return dto;
    }
}
