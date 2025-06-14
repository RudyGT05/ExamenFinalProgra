package umg.edu.gt.service;

import java.util.List;

import umg.edu.gt.dto.Temperature;

public interface ITemperatureService {

	void addTemperatura(Temperature t);
	
	List<Temperature> obtenerTemperaturas();
	
	boolean isEmpty();
	
	int maxima();
	
}
