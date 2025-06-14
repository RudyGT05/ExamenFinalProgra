package umg.edu.gt.resource;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import umg.edu.gt.dto.AddressDto;
import umg.edu.gt.service.IAddressService;

import java.util.List;

@Path("/Addresses")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class AddressResource {

    @Inject
    IAddressService addressService;

    @POST
    public void create(AddressDto dto) {
        addressService.create(dto);
    }

    @GET
    public List<AddressDto> findAll() {
        return addressService.findAll();
    }
}
