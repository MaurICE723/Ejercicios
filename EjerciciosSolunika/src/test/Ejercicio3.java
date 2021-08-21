package test;

import java.util.Scanner;

import utilidades.Utils;

public class Ejercicio3 {
	
	//Hacer un programa que reciba N números, sumar por un lado los pares y por 
	//otro los impares. Decir si el promedio de pares o impares es mayor.
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] pares = new int[0];
		int[] impares = new int[0];
		var totalPares = 0D;
		var promedioPares = 0D;
		var totalImpares = 0D;
		var promedioImpares = 0D;
		
		String valorIngresado;
		
		do {
			System.out.print("Ingrese un valor: ");
			valorIngresado = scanner.nextLine();
			
			if(Utils.esNumerico(valorIngresado)) {
				int valorNumerico = Integer.parseInt(valorIngresado);
				if(valorNumerico %2==0) {
					pares = Utils.agregarValor(pares, valorNumerico);
				} else {
					impares = Utils.agregarValor(impares, valorNumerico);
				}
								
			} else if (valorIngresado.compareTo("") != 0) {
				System.out.println("( ¬  ¬ ) Mira como te mira Connan... eso no era un valor valido");
			}
			
		}while(valorIngresado.compareTo("") != 0);
		
		//Pares
		for(int par : pares) {
			totalPares = totalPares + par;
		} 
		if (pares.length > 0) {
			promedioPares = totalPares/pares.length;
		} else {
			promedioPares = 0;
		}
		//Impares
		for(int impar : impares) {
			totalImpares = totalImpares + impar;
		} 
		
		if (impares.length > 0) {
			promedioImpares = totalImpares/impares.length;
		} else {
			promedioImpares = 0;
		}
		
		
		
		//Salidas
		StringBuffer mensaje = new StringBuffer();
		mensaje.append("\nPares: \n");
		mensaje.append("\tPromedio: "+promedioPares+"\n");
		mensaje.append("\tTotal: "+totalPares+"\n");
		mensaje.append("\n");
		mensaje.append("Impares: \n");
		mensaje.append("\tPromedio: "+promedioImpares+"\n");
		mensaje.append("\tTotal: "+totalImpares+"\n");
		mensaje.append("\n");
		if(promedioPares == promedioImpares) {
			mensaje.append("Ambos promedios son iguales");
		} else if (promedioPares > promedioImpares ) {
			mensaje.append("El promedio Par es mayor");
		}else {
			mensaje.append("El promedio Impar es mayor");
		}
		
		System.out.println(mensaje.toString());
		
	}
}
