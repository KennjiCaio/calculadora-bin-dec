package application;

import javax.swing.JOptionPane;


import calculadora.Calculadora;

public class Program {

	public static void main(String[] args) {
		
		Calculadora calc = new Calculadora();
		int valorInt;
		String valorString;
		String resultado;
		int sair = 1;
		
		do {
			String opcao = JOptionPane.showInputDialog(""
					+ "Digite sua op��o:\n"
					+ "1 - Decimal para Bin�rio\n"
					+ "2 - Bin�rio para Decimal\n"
					+ "3 - Decimal para Hexadecimal\n"
					+ "4 - Hexadecimal para Decimal\n"
					+ "5 - Bin�rio para Hexadecimal\n"
					+ "6 - Hexadecimal para Bin�rio\n"
					+ "0 - Sair");
			switch (tryToInt(opcao)) {
				
				case 1:
					valorInt = tryToInt(showDialog("Decimal", "Bin�rio"));
					resultado = (valorInt != -1) ? calc.decBinario(valorInt) : "Opa, deu erro";
					JOptionPane.showMessageDialog(null, resultado);
					break;
				case 2:
					valorInt = tryToInt(showDialog("Bin�rio", "Decimal"));
					resultado = (valorInt != -1) ? calc.binDecimal(valorInt) : "Opa, deu erro";
					JOptionPane.showMessageDialog(null, resultado);
					break;
				case 3:
					valorInt = tryToInt(showDialog("Decimal", "Hexadecimal"));
					resultado = (valorInt != -1) ? calc.decHexa(valorInt) : "Opa, deu erro";
					JOptionPane.showMessageDialog(null, resultado);
					break;
				case 4:
					valorString = showDialog("Hexadecimal", "Decimal");
					resultado = calc.hexDecimal(valorString);
					JOptionPane.showMessageDialog(null, resultado);
					break;		
				case 5:
					valorInt = tryToInt(showDialog("Bin�rio", "Hexadecimal"));
					resultado = (valorInt != -1) ? calc.binHexa(valorInt) : "Opa, deu erro";
					JOptionPane.showMessageDialog(null, resultado);
					break;
				case 6:
					valorString = showDialog("Hexadecimal", "Bin�rio");
					resultado = calc.hexaBin(valorString);
					JOptionPane.showMessageDialog(null, resultado);
					break;
				default:
					sair = JOptionPane.showConfirmDialog(null, "Deseja realmente sair da aplica��o?", "Sair", 2);
					
			}
		} while(sair != 0);
		
		
	}
	private static int tryToInt(String valor) {
		int valorInt = -1; 
		
		try {
			valorInt = Integer.parseInt(valor);
		}
		catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Por favor, digite um inteiro");
		}
		return valorInt;
	}
	private static String showDialog(String origem, String destino)
	{
		return JOptionPane.showInputDialog("Digite um n�mero em " + origem + " para"
				+ " convertermos para " + destino);
	}

}
