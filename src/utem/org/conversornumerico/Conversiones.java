package utem.org.conversornumerico;

public class Conversiones {
	public String decimalToBinary(String numero){
		int elNumero = Integer.parseInt(numero, 10);
		String convertido = "";
		int residuo;
		int entero;
		
		try{
			while (elNumero > 0){
				entero = elNumero / 2;
				residuo = elNumero % 2;
				convertido = String.valueOf(residuo) + convertido;
				elNumero = entero;
			}
			return convertido;
		} catch (NumberFormatException e){
			return "Error";
		}	
	}
	
	public void hexToBinary(String numero){
		
	}

	public String binaryToDecimal(String numero){
		char[] elNumero = numero.toCharArray();
		int convertido = 0;
		int pos = 0;
		int i;
		
		try{
			for (i=numero.length(); i>0; i--){
				convertido = convertido + Character.digit(elNumero[i-1], 2) * (int) Math.pow(2, pos);
				pos++;
			}
			return String.valueOf(convertido);
		} catch (NumberFormatException e){
			return "Error";
		}
	}

	public String hexToDecimal(String numero){
		char[] elNumero = numero.toCharArray();
		int convertido = 0;
		int pos = 0;
		int i;
		
		try{
			for (i=numero.length(); i>0; i--){
				convertido = convertido + Character.digit(elNumero[i-1], 16) * (int) Math.pow(16, pos);
				pos++;
			}
			return String.valueOf(convertido);
		} catch (NumberFormatException e){
			return "Error";
		}		
	}
	
	public void binaryToHex(String numero){
		
	}
	
	public void decimalToHex(String numero){
		
	}
}
