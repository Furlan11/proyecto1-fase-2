import java.util.ArrayList;

/**
 * 
 */

/**
 * @author Guillermo Furlan 20713 
 * @author Wilfredo Gallegos 20399
 * @author Alejandro Pallais 20093
 * Clase que verifica si es una lista o un atomo
 */
public class Predicados {
		public boolean Listp(String s) {
			boolean valor = false;
			for (int i=0;i<s.length();i++) {
				if((s.charAt(i)+"").equals("'")) {
					valor = true;
				}
			}
			return valor;		
		}
		public boolean Atom(String s) {
			boolean valor = true;
			for (int i=0;i<s.length();i++) {
				if((s.charAt(i)+"").equals("'")) {
					valor = false;
				}
			}
			return valor;		
		}
		public boolean menorque(String sumandos) { 
			boolean valor = false;
	        String resultado= "";
	            String espacio=" ";
	            int largo=sumandos.length();
	            ArrayList<String> numeros = new ArrayList<String>();
	            String numero="";

	            for(int i=0; i<largo;i++) {
	                    String caracter=String.valueOf(sumandos.charAt(i));//12 3 4 
	                    //System.out.println("caracer " +caracter);
	                    if(caracter.equals(espacio)||caracter.equals("<")) {
	                        numeros.add(numero);
	                        numero="";
	                    }else{
	                        numero=numero+caracter;
	                    }
	                    //System.out.println("numeros "+numeros);
	            }
	            numeros.add(numero);
	            System.out.print(numeros);
	            //System.out.println(numeros);
	            boolean esNumero=true;
	            double respuesta=0;
	            for(int i=0;i<numeros.size();i++){
	                if(isNumeric(numeros.get(i))==false){
	                    System.out.print("error, lo ingresado no es un numero");
	                    esNumero=false;
	                    i=numeros.size();
	                }else{
	                    respuesta=respuesta+Double.parseDouble(numeros.get(i));
	                }
	                resultado=respuesta+"";
	            }
	            System.out.print(numeros.get(2));
	            int numerofinal = Integer.parseInt(numeros.get(2))-Integer.parseInt(numeros.get(4));
	            System.out.print(numerofinal);
	            if(0>numerofinal) {
	            	valor = true;
	            }else {
	            	valor = false;
	            }
	            return valor; 

	    }
	    public static boolean isNumeric(String ope) {
	        try {
	            double d = Double.parseDouble(ope);
	        } catch (NumberFormatException nfe) {
	            return false; //Error no es numerico
	        }
	        return true; //Es numerico
	    }
}
