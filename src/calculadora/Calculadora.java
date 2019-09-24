package calculadora;

import java.util.ArrayList;

public class Calculadora {
	
	public String decBinario(int valor) {
		ArrayList<Integer> lista = new ArrayList<>();
		String resultado = "";
		while (valor > 0) {
			lista.add(valor % 2);
			valor /= 2;
		}
		for(int i = lista.size()-1; i >= 0; i--) {
			resultado += lista.get(i);
		}
		return resultado;
	}
	
	public String binDecimal(int valor) {
		ArrayList<Integer> lista = new ArrayList<>();
		int resultado = 0;
		String valorString = String.valueOf(valor);
		
		for(int i = valorString.length()-1; i >= 0; i--) {
			if (valorString.charAt(i) != '1' && valorString.charAt(i) != '0') {
				return "Faz direito";
			}
			lista.add(Integer.parseInt(String.valueOf(valorString.charAt(i))));
		}
		for(int i = 0; i < lista.size(); i++) {
			resultado += lista.get(i) * Math.pow(2, i);
		}
		return String.valueOf(resultado);
	}
	
	public String decHexa(int valor) {
		ArrayList<String> lista = new ArrayList<>();
		String resultado = "";
		String resultadoParcial = "";
		while (valor > 0) {
			lista.add(String.valueOf(valor % 16));
			valor /=  16;
		}
		
		for(int i = lista.size()-1; i >= 0; i--) {
			resultadoParcial = lista.get(i);
			if (Integer.parseInt(resultadoParcial) > 9) {
				switch (resultadoParcial) {
					case "10" : 
						resultado += "A";
						break;
					case "11" : 
						resultado += "B";
						break;
					case "12" : 
						resultado += "C";
						break;
					case "13" : 
						resultado += "D";
						break;
					case "14" : 
						resultado += "E";
						break;
					case "15" : 
						resultado += "F";
						break;
				}

			} 
			else {
				resultado += resultadoParcial;
			}
		}
		return resultado;
	}
	
	public String hexDecimal (String valor) {
		ArrayList<String> lista = new ArrayList<>();
		int resultado = 0;
		String valorParcial = "";
		valor = valor.toUpperCase();
		
		for (int i = valor.length() - 1; i >= 0; i--) {
			lista.add(String.valueOf(valor.charAt(i)));
		}
		for (int i = 0; i < lista.size(); i++)
		{
			valorParcial = lista.get(i);

			switch (valorParcial) {
			case "A" : 
				valorParcial = "10";
				break;
			case "B" : 
				valorParcial = "11";
				break;
			case "C" : 
				valorParcial = "12";
				break;
			case "D" : 
				valorParcial = "13";
				break; 
			case "E" : 
				valorParcial = "14";
				break;
			case "F" : 
				valorParcial = "15";
				break;
		
			}
			try {
			resultado += Integer.parseInt(valorParcial) * Math.pow(16, i);
			}
			catch (Exception e) {
				return "Faz direito";
			}
		}
		return String.valueOf(resultado);
	}
	
	public String binHexa(long num) {
		ArrayList<Integer> lista = new ArrayList<>();
		String valorString = String.valueOf(num);
		String resultado = "";
		int resultadoParcial = 0;
		
		for(int i = 0; i <= valorString.length()-1 ; i++) {
			if (valorString.charAt(i) != '1' && valorString.charAt(i) != '0') {
				return "Faz direito";
			}

			lista.add(Integer.parseInt(String.valueOf(valorString.charAt(i))));
			
		}
		if (lista.size() % 4 != 0)
		{
			while(lista.size() % 4 != 0) {
				lista.add(0, 0);
			}
		}
		
		for(int i = 0; i < lista.size(); i += 4) {
			for (int j = 0; j <= 3; j++) {
				resultadoParcial += lista.get(j+i) * Math.pow(2, 3-j);
			}
			if (resultadoParcial > 9)
			{
				switch (resultadoParcial) {
				case 10 : 
					resultado += "A";
					break;
				case 11 : 
					resultado += "B";
					break;
				case 12 : 
					resultado += "C";
					break;
				case 13 : 
					resultado += "D";
					break;
				case 14 : 
					resultado += "E";
					break;
				case 15 : 
					resultado += "F";
					break;
			}
			}
			else {
				resultado += resultadoParcial;
			}
			resultadoParcial = 0;
		}
		return resultado;
	}
	
   public String hexaBin(String valor){
      ArrayList<String> lista = new ArrayList<>();
      String resultado = "";
      String resultadoParcial = "";
      valor = valor.toUpperCase();
     
      ArrayList<String> listaAux = new ArrayList<>();
      int aux = 0;
      
      for (int i = 0; i <= valor.length() - 1; i++)
      {
         lista.add(String.valueOf(valor.charAt(i)));
      }
      for(int i = 0; i <= lista.size() - 1; i++ )
      {
    	
            switch (lista.get(i)){
               case "A":
                  resultadoParcial = "10";
                  
                  break;
               case "B":
                  resultadoParcial = "11";
                  
                  break;
               case "C":
                  resultadoParcial = "12";
                 
                  break;
               case "D":
                  resultadoParcial = "13";
                  
                  break;
               case "E":
                  resultadoParcial = "14";
             
                  break;
               case "F":
                  resultadoParcial = "15";
                  break;
               default:
            	   resultadoParcial = lista.get(i);
            	  
            }

            
            try {
            	aux = Integer.parseInt(resultadoParcial);
            	resultadoParcial = decBinario(aux);

               
            }
            catch(Exception e)
            {
            	return "Faz direito";
            }
            	for (int k = 0; k <= resultadoParcial.length() -1; k++)
            	{
            		listaAux.add(String.valueOf(resultadoParcial.charAt(k)));
            	}
        		if (listaAux.size() % 4 != 0)
        		{
        			while(listaAux.size() % 4 != 0) {
        				resultadoParcial = "";
        				listaAux.add(0, "0");
        			}
        			for (int j = 0; j <= listaAux.size() - 1; j++)
        			{
        				resultadoParcial += listaAux.get(j);
        			}
        		}
            
        		listaAux.clear();
            	resultado += resultadoParcial;
           
         
           }
    	  
         return resultado;
  
   }
	
}
