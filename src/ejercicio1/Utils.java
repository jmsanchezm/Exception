package ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Utils {
		
	static public double readDouble (Scanner read) {
		
		double num =0.0;
		try {
			System.out.println("Introduzca un numero de tipo double");
			num= read.nextDouble();
	
		}catch (InputMismatchException e) {
			System.err.println("El valor introducido no es de tipo double");
		} 
		read.nextLine();
		return  num;
	}
	
	static public int readInt (Scanner read) {
		int num=0;
		try {
			System.out.println("Introduzca un numero de tipo int");
			num=read.nextInt();
		
		}catch (InputMismatchException e) {
			System.err.println("El valor introducido no es de tipo int");
		}
		read.nextLine();
		return num;
	}
	
}
