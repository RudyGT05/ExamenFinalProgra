package umg.edu.gt.service;

import umg.edu.gt.dto.AddressDto;
import java.util.List;

public interface IAddressService {
    void create(AddressDto dto);
    List<AddressDto> findAll();
    List<AddressDto> findByPersonId(Long personId);
}
