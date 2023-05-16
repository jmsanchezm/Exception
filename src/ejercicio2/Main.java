package ejercicio2;

public class Main {

	public static void main(String[] args) {

		//Abrimos un bloque try-catch
		try {
			//Creamos el objeto de tipo Hora
			Hora hora = new Hora();
			//Llamamos al set para actualizar la hora
			hora.setHora(-6);
			hora.setMinuto(59);
			hora.setSegundo(50);
		//Abrimos el catch con la excepcion de minuto	
		} catch (NegativeMinuteException e) {
			//Se le mostrará el mensaje modificado
			System.out.println(e.getMessage());
		//Abrimos otro catch con la excepcion del segundo	
		} catch (NegativeSecondException e) {
			//Se le mostrará el mensaje modificado
			System.out.println(e.getMessage());
		//Abrimos el catch con la excepcion de la hora	
		} catch (NegativeHourException e) {
			//Se le mostrará el mensaje modificado
			System.out.println(e.getMessage());
		}

	}

}
