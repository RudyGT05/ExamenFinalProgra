package umg.edu.gt.resource;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import umg.edu.gt.model.Person;
import umg.edu.gt.dto.PersonDto;
import umg.edu.gt.mapper.IMapper;
import umg.edu.gt.service.IAddressService;
import umg.edu.gt.service.IPersonService;

import jakarta.inject.Inject;
import jakarta.ws.rs.core.Response;

@Path("/Person")
public class PersonResource {
    @Inject
    IAddressService addressService; // Servicio para consultar direcciones de una persona

    @Inject
    IPersonService personService;  // Usar interfaz en lugar de implementación

    @Inject
    IMapper<Person, PersonDto> mapper;  // Inyectar la interfaz IMapper

    @POST
    public Response save(PersonDto per) {
        Person p = mapper.toEntity(per);  // Usar el mapper inyectado
        personService.save(p);

        return Response.ok("Elemento guardado").build();
    }

    @GET
    @Path("/{id}/Addresses")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAddressesByPersonId(@PathParam("id") Long id) {
        return Response.ok(addressService.findByPersonId(id)).build();

        //Para que funcione primero se tiene que agregar datos en Person por medio de su post
        // luego agrega las direcciones por medio del post de addresses y ya puedes buscar la
        //direccion de las personas por su id
        // si se ingresan direcciones sin tener Personas en la base de datos, personId será null
    }
}