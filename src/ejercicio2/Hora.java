package ejercicio2;

public class Hora {
	/**
	 * Se guardará la hora
	 */
	private int hora;
	/**
	 * Se guardarán los minutos
	 */
	private int minuto;
	/**
	 * Se guardarán los segundos
	 */
	private int segundo;

	/**
	 * Constructor sin parámetros
	 */
	public Hora() {
		super();

	}

	/**
	 * Constructor con parámetros
	 * 
	 * @param hora
	 * @param minuto
	 * @param segundo
	 */
	public Hora(int hora, int minuto, int segundo)
			throws NegativeHourException, NegativeMinuteException, NegativeSecondException {
		super();
		if (hora < 0) {
			throw new NegativeHourException();
		} else {
			this.hora = hora;
		}
		if (minuto < 0) {
			throw new NegativeMinuteException();
		} else {
			this.minuto = minuto;
		}
		if (segundo < 0) {
			throw new NegativeSecondException();
		} else {
			this.segundo = segundo;
		}
	}

	/**
	 * Método que devuelve el valor del atributo hora
	 * 
	 * @return
	 */
	public int getHora() {
		return hora;
	}

	/**
	 * Método que devuelve el valor del atributo minuto
	 * 
	 * @return
	 */
	public int getMinuto() {
		return minuto;
	}

	/**
	 * Método que devuelve el valor del atributo segundo
	 * 
	 * @return
	 */
	public int getSegundo() {
		return segundo;
	}

	/**
	 * Método que modificará el valor del atributo
	 * 
	 * @param hora
	 */
	public void setHora(int hora) throws NegativeHourException {
		if (hora < 0) {
			throw new NegativeHourException();
		} else {
			this.hora = hora;
		}
	}

	public void setMinuto(int minuto) throws NegativeMinuteException {
		if (minuto < 0) {
			throw new NegativeMinuteException();
		} else {
			this.minuto = minuto;
		}
	}

	public void setSegundo(int segundo) throws NegativeSecondException {
		if (segundo < 0) {
			throw new NegativeSecondException();
		} else {
			this.segundo = segundo;
		}
	}

	/**
	 * Método que incrementa 1 segundo
	 */
	public void incrementaSeg() {

		// Incrementamos 1 a segundo
		segundo++;
		// Si segundo es igual a 60
		if (segundo == 60) {
			// Se restablece a 0
			segundo = 0;
			// Sumamos 1 minuto
			minuto++;
		}
		// Si minuto es igual a 60
		if (minuto == 60) {
			// Se restablece a 0
			minuto = 0;
			// Y sumamos 1 hora
			hora++;
		}
		// Si hora es igual a 24
		if (hora == 24) {
			// Restablecemos hora a 0
			hora = 0;
		}

	}
}
