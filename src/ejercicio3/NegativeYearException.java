package ejercicio3;

public class NegativeYearException extends Exception {

	@Override
	public String getMessage() {
		return "Cantidad de años negativo";
	}
	
}
