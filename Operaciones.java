import java.util.ArrayList;

public class Operaciones {

	public String suma(String sumandos) {
		String resultado= "";
		String sumando1="";
		String sumando2="";
		int contador=0;
		int largo=sumandos.length();
		
		for(int i=0; i<largo;i++) {
			String caracter=String.valueOf(sumandos.charAt(i));
			if(caracter!=" ") {
				
					if(contador==0) {
					 sumando1=sumando1+caracter;
					 }	
					if(contador==1) {
					 sumando2=sumando2+caracter;
					 return sumando2;}	
					
				
				
			}
			if(caracter==" ") {
				contador=contador++;
				if(contador==2) {
					double num1=Double.parseDouble(sumando1);
					double num2=Double.parseDouble(sumando2);
					resultado=String.valueOf((num1+num2));
					
					sumando1= resultado;
					
					contador=1;
					
				}
			}
			
			
		}
		
		return resultado;
		 
	}
	
	/**
	 * verificar si un caracter se puede volver un numero
	 * @param ope eel string con el cacrater que se queire validar
	 *  @return bollean con true si e su numeo
	 */
	public static boolean isNumeric(String ope) {
	    try {
	        double d = Double.parseDouble(ope);
	    } catch (NumberFormatException nfe) {
	        return false; //Error no es numerico
	    }
	    return true; //Es numerico
	}
}
