package ejercicio3;

public class NegativeMonthException extends Exception {

	@Override
	public String getMessage() {
		return "Cantidad de meses negativo";
	}
	
}
