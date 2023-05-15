package ejercicio2;

public class NegativeHourException extends Exception {

	@Override
	 public String getMessage() {
		return "Cantidad de horas errónea";
	}
	
}
