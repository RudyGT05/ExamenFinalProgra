package umg.edu.gt.resource;

import umg.edu.gt.model.Person;
import umg.edu.gt.dto.PersonDto;
import umg.edu.gt.service.IPersonService;
import umg.edu.gt.service.impl.PersonServiceImpl;

import jakarta.inject.Inject;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

@Path("/Person")
public class PersonaResource {

    @Inject
    PersonServiceImpl person;

    @POST
    public Response save(PersonDto per) {
        Person p = new Person();
        p.setName(per.getName());
        person.save(p);

        return Response.ok("Elemento guardado").build();
    }

}
