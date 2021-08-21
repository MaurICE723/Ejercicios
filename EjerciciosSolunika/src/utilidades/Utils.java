package utilidades;

public class Utils {

	public static double[] ordenarValores(double[] valoresOrdenar, boolean ascendente) {
		double auxiliar;
		int minimo;

		for (int i = 0; i < valoresOrdenar.length; i++) {
			minimo = i;

			if(ascendente) {
				for(int j = i+1; j < valoresOrdenar.length; j++){
					if(valoresOrdenar[j] < valoresOrdenar[minimo]) {
						minimo = j;
					}
				}
			} else {
				for(int j = i+1; j < valoresOrdenar.length; j++){
					if(valoresOrdenar[j] > valoresOrdenar[minimo]) {
						minimo = j;
					}
				}
			}

			auxiliar = valoresOrdenar[i];
			valoresOrdenar[i] = valoresOrdenar[minimo];
			valoresOrdenar[minimo] = auxiliar;
		}

		return valoresOrdenar;

	}
	
	public static int[] ordenarValores(int[] valoresOrdenar, boolean ascendente) {
		int auxiliar;
		int minimo;

		for (int i = 0; i < valoresOrdenar.length; i++) {
			minimo = i;

			if(ascendente) {
				for(int j = i+1; j < valoresOrdenar.length; j++){
					if(valoresOrdenar[j] < valoresOrdenar[minimo]) {
						minimo = j;
					}
				}
			} else {
				for(int j = i+1; j < valoresOrdenar.length; j++){
					if(valoresOrdenar[j] > valoresOrdenar[minimo]) {
						minimo = j;
					}
				}
			}

			auxiliar = valoresOrdenar[i];
			valoresOrdenar[i] = valoresOrdenar[minimo];
			valoresOrdenar[minimo] = auxiliar;
		}

		return valoresOrdenar;

	}

	private static String InvertirCadena(String cadena) {
		String cadenaInvertida = "";
		for (int x = cadena.length() - 1; x >= 0; x--)
			cadenaInvertida = cadenaInvertida + cadena.charAt(x);
		return cadenaInvertida;
	}

	
	public static boolean esCapicua(int numero) {
		Integer numeroARevisar = numero; 
		var cadenaActual = numeroARevisar.toString();
		var cadenaInvertida = InvertirCadena(numeroARevisar.toString());
		
		if(cadenaActual.compareTo(cadenaInvertida) == 0) {		
			return true;
		} else {
			return false;
		}
	
	}
	
	public static boolean esNumerico(String cadena){
		try {
			Integer.parseInt(cadena);
			return true;
		} catch (NumberFormatException nfe){
			return false;
		}
	}

	public static int[] agregarValor(int[] arreglo, int valor) {
		
		int[] nuevoArreglo = new int[arreglo.length+1];
		for(int i = 0; i <arreglo.length; i++ ) {
			nuevoArreglo[i] = arreglo[i];
		}
		nuevoArreglo[arreglo.length] = valor;
		return nuevoArreglo;
	}
	
}
