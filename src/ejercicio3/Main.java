package ejercicio3;

public class Main {

	public static void main(String[] args) {
		
		//Abrimos un bloque try-catch
		try {
			//Creamos el objeto y llamamos al set para actualizar los parametros
			Fecha fecha= new Fecha ();
			fecha.setAño(2004);
			fecha.setMes(-4);
			fecha.setDia(2);
		//Abrimos el bloque catch con la excepcion del año
		}catch(NegativeYearException e ) {
			System.out.println(e.getMessage());
		//Abrimos otro bloque catch con la excepcion del mes
		}catch (NegativeMonthException e) {
			System.out.println(e.getMessage());
		//Abrimos otro bloque catch con la excepcion del dia	
		}catch (NegativeDayException e) {
			System.out.println(e.getMessage());
		}

	}

}
