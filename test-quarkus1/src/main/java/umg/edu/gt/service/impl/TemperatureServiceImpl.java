package umg.edu.gt.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import umg.edu.gt.dto.Temperature;
import umg.edu.gt.service.ITemperatureService;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class TemperatureServiceImpl implements ITemperatureService {

	private List<Temperature> valores = new ArrayList<>();

	@Override
	public void addTemperatura(Temperature t) {
		valores.add(t);
	}
	
	@Override
	public List<Temperature> obtenerTemperaturas() {
		return Collections.unmodifiableList(valores);
	}
	
	@Override
	public int maxima() {
		return valores.stream().mapToInt(Temperature::getMaxima).max().getAsInt();
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return valores.isEmpty();
	}

}
