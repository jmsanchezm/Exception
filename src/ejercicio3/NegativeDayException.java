package ejercicio3;

public class NegativeDayException extends Exception{

	@Override
	public String getMessage() {
		return "Cantidad de dias negativo";
	}
	
}
