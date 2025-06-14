package umg.edu.gt.mapper;

import umg.edu.gt.model.Person;
import umg.edu.gt.dto.PersonDto;
import jakarta.enterprise.context.ApplicationScoped;
// mapeo entre Person y PersonDto.
// Esta clase tiene una única responsabilidad de realizar conversiones entre Person y PersonDto
//Al implementar IMapper, permite extender el comportamiento sin modificar esta clase


@ApplicationScoped
public class PersonMapper implements IMapper<Person, PersonDto> {
    @Override
    public Person toEntity(PersonDto dto) {
        Person p = new Person();
        p.setName(dto.getName());
        return p;
    }

    @Override
    public PersonDto toDto(Person entity) {
        PersonDto dto = new PersonDto();
        dto.setName(entity.getName());
        return dto;
    }
}

