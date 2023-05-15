package ejercicio2;

public class NegativeMinuteException extends Exception {
	
	@Override
	public String getMessage() {
		return "Cantidad de minutos errónea";
	}

}
