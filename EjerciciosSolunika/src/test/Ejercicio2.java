package test;

import utilidades.Utils;

public class Ejercicio2 {

	//Hacer un programa que recibe 4 parámetros, comprobar si son números, y si son 
	//números, decir cuales son palíndromas (capicúa), e imprimirlos de menor a mayor.
	
	public static void main(String[] args) {
		
		if(args.length == 4) {
			int[] numeros = new int[0];
			
			for(int i = 0; i < args.length; i++) {
				if(Utils.esNumerico(args[i])) {
					numeros = Utils.agregarValor(numeros, Integer.parseInt(args[i]));
				}
			}
			
			numeros = Utils.ordenarValores(numeros, true);
			
			if(numeros.length>0) {
				for(int numero : numeros) {
					
					
					if(Utils.esCapicua(numero)) {
						System.out.println(numero+"\tEs capicúa");
					} else {
						System.out.println(numero);
					}
				}
			}
			
			
		} else {
			System.out.println("La cantidad de parametros no es la esperada. ");
		}
	}
}
