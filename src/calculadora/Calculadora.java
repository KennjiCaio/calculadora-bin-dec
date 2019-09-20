package calculadora;

import java.util.ArrayList;

public class Calculadora {
	
	public static String decBinario(int valor) {
		ArrayList<Integer> lista = new ArrayList<>();
		String resultado = "1";
		while (valor != 1) {
			lista.add(valor % 2);
			valor /= 2;
		}
		for(int i = lista.size()-1; i >= 0; i--) {
			resultado += lista.get(i);
		}
		return resultado;
	}
	
	public static int binDecimal(int valor) {
		ArrayList<Integer> lista = new ArrayList<>();
		int resultado = 0;
		String valorString = String.valueOf(valor);
		
		for(int i = valorString.length()-1; i >= 0; i--) {
			lista.add(Integer.parseInt(String.valueOf(valorString.charAt(i))));
		}
		for(int i = 0; i < lista.size(); i++) {
			resultado += lista.get(i) * Math.pow(2, i);
		}
		return resultado;
	}
	
	
}
