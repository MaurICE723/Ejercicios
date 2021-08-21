package test;

import java.util.Scanner;

import utilidades.Utils;

public class Ejercicio1 {

	//Hacer un programa que reciba 3 números, imprimir por 
	//pantalla cual es el más grande, el del medio y el más chico.
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Debe ingresar 3 numeros. ");
		System.out.println(" ");
		System.out.print("Ingresar valor 1 de 3: ");
		var valor1 = Double.parseDouble(scanner.nextLine());
		
		System.out.print("Ingresar valor 2 de 3: ");
		var valor2 = Double.parseDouble(scanner.nextLine());
		
		System.out.print("Ingresar valor 3 de 3: ");
		var valor3 = Double.parseDouble(scanner.nextLine());
		
		System.out.println(" ");
			
		
		double[] valoresOrdenar = {valor1, valor2, valor3};

		valoresOrdenar = Utils.ordenarValores(valoresOrdenar,false);

		System.out.println("EL valor mas grande es: "+valoresOrdenar[0]);
		System.out.println("EL valor del medio es: "+valoresOrdenar[1]);
		System.out.println("EL valor mas chico es: "+valoresOrdenar[2]);
	}
	
}
