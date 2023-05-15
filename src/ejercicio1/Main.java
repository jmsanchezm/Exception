package ejercicio1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Creamos el Scanner 
		Scanner read= new Scanner (System.in);
	
		//Mostramos por pantalla las funciones
		System.out.println(Utils.readDouble(read));
		System.out.println();
		System.out.println(Utils.readInt(read));
		
	}

}
