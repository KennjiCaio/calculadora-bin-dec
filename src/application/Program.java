package application;

import java.util.Scanner;

import calculadora.Calculadora;

public class Program {

	public static void main(String[] args) {
		
		Calculadora calc = new Calculadora();
		Scanner sc = new Scanner(System.in);
		System.out.print("Insira um numero: ");
		String  num = sc.next();
		System.out.println(calc.hexDecimal(num));
		sc.close();
	}

}
