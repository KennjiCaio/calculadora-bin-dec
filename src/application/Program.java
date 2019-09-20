package application;

import java.util.Scanner;

import calculadora.Calculadora;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Insira um numero: ");
		int num = sc.nextInt();
		System.out.println(Calculadora.binDecimal(num));
		sc.close();
	}

}
