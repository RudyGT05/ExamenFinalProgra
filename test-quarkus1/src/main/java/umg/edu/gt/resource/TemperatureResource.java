package umg.edu.gt.resource;

import java.util.List;

import umg.edu.gt.dto.Temperature;
import umg.edu.gt.service.impl.TemperatureServiceImpl;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/temperaturas")
public class TemperatureResource {
	
	@Inject
	private TemperatureServiceImpl temperaturas;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Temperature medicion() {
		return new Temperature("Guatemala", 25, 32);
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/list")
	public List<Temperature> list() {
		return temperaturas.obtenerTemperaturas();
	}

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public Temperature guardar(Temperature temp) {
		temperaturas.addTemperatura(temp);
		return temp;
	}
	
	@GET
	@Path("/maxima")
	@Produces(MediaType.TEXT_PLAIN)
	public Response maxima() {
		if(temperaturas.isEmpty())
			return Response.status(400).entity("No hay temperaturas").build();
		int tempetaturaMaxima = temperaturas.maxima();
		return Response.ok(Integer.toString(tempetaturaMaxima)).build();			
	}
	

}
