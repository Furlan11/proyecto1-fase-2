import java.util.ArrayList;

public class Operaciones {

	public String suma(String sumandos) {
		String resultado= "";
		String sumando1="";
		String sumando2="";
		String espacio=" ";
		int contador=0;
		int largo=sumandos.length();
		
		for(int i=0; i<largo;i++) {
			String caracter=String.valueOf(sumandos.charAt(i));//12 3 4 
			if(caracter!=espacio) {
				if (isNumeric(caracter)== true){
					if(contador==0) {
					 sumando1=sumando1+caracter;
					 
					 }	
					if(contador==1) {
					 sumando2=sumando2+caracter;
					 
					 }	
					
				}
				
			}
			if(caracter.equals(espacio)) {
				contador=contador+1;
				if(contador==2) {
					double num1=Double.parseDouble(sumando1);
					double num2=Double.parseDouble(sumando2);
					resultado=String.valueOf((num1+num2));
					
					sumando1= resultado;
					sumando2="";
					contador=1;
					
				}
			}
			
			
		}
		double num1=Double.parseDouble(sumando1);
		double num2=Double.parseDouble(sumando2);
		resultado=String.valueOf((num1+num2));
		return resultado;
		 
	}
	
	
	public String resta(String sumandos) {
		String resultado= "";
		String sumando1="";
		String sumando2="";
		String espacio=" ";
		int contador=0;
		int largo=sumandos.length();
		
		for(int i=0; i<largo;i++) {
			String caracter=String.valueOf(sumandos.charAt(i));//12 3 4 
			if(caracter!=espacio) {
				if (isNumeric(caracter)== true){
					if(contador==0) {
					 sumando1=sumando1+caracter;
					 
					 }	
					if(contador==1) {
					 sumando2=sumando2+caracter;
					 
					 }	
					
				}
				
			}
			if(caracter.equals(espacio)) {
				contador=contador+1;
				if(contador==2) {
					double num1=Double.parseDouble(sumando1);
					double num2=Double.parseDouble(sumando2);
					resultado=String.valueOf((num1-num2));
					
					sumando1= resultado;
					sumando2="";
					contador=1;
					
				}
			}
			
			
		}
		double num1=Double.parseDouble(sumando1);
		double num2=Double.parseDouble(sumando2);
		resultado=String.valueOf((num1+num2));
		return resultado;
		 
	}
	
	public String Producto(String sumandos) {
		String resultado= "";
		String sumando1="";
		String sumando2="";
		String espacio=" ";
		int contador=0;
		int largo=sumandos.length();
		
		for(int i=0; i<largo;i++) {
			String caracter=String.valueOf(sumandos.charAt(i));//12 3 4 
			if(caracter!=espacio) {
				if (isNumeric(caracter)== true){
					if(contador==0) {
					 sumando1=sumando1+caracter;
					 
					 }	
					if(contador==1) {
					 sumando2=sumando2+caracter;
					 
					 }	
					
				}
				
			}
			if(caracter.equals(espacio)) {
				contador=contador+1;
				if(contador==2) {
					double num1=Double.parseDouble(sumando1);
					double num2=Double.parseDouble(sumando2);
					resultado=String.valueOf((num1*num2));
					
					sumando1= resultado;
					sumando2="";
					contador=1;
					
				}
			}
			
			
		}
		double num1=Double.parseDouble(sumando1);
		double num2=Double.parseDouble(sumando2);
		resultado=String.valueOf((num1*num2));
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
	
    public String operar (String demo){
        boolean verificador=false;
        do{
            //System.out.println(demo);
            verificador=false;
            int posicionInicial=0;
            for(int i=0;i<demo.length();i++){//analizo el string buscando cual es la ultima operacion
                if((demo.charAt(i)+"").equals("(")){
                    posicionInicial=i;
                    verificador=true;
                }//si no hay operacion ahi se acaba
            }
            if(verificador==true){
                String resupuesta="1";
                String pregunta="";
                int posicionFinal=posicionInicial;
                do{//tengo solo la ultima operacion
                    posicionFinal++;
                }while(!((demo.charAt(posicionFinal)+"").equals(")")));
                boolean buscaSignos=true;
                String signo="";
                for (int i=posicionInicial+1;i<posicionFinal;i++){//verifico que signo es
                    if (buscaSignos==true){
                        if((demo.charAt(i)+"").equals("+")||(demo.charAt(i)+"").equals("-")||(demo.charAt(i)+"").equals("*")||(demo.charAt(i)+"").equals("/")){
                            //i++;
                            signo=demo.charAt(i)+"";
                            buscaSignos=false;
                        }
                    }else{
                        pregunta=pregunta+demo.charAt(i);//ya visto el signo pongo todos los operandos en una lista
                    }
                }
                do{
                    String nuevo="";
                    for(int j=1;j<pregunta.length();j++){
                        nuevo=nuevo+pregunta.charAt(j);
                    }
                    pregunta=nuevo;
                }while(((pregunta.charAt(0)+"").equals(" ")));
                switch (signo){//opero la lista
                    case "+":
                        System.out.println("la"+pregunta);
                        resupuesta=suma(pregunta);
                        break;
                    case "-":
                        resupuesta=resta(pregunta);
                        break;
                    case "*":
                        resupuesta=Producto(pregunta);
                        break;
                    case "/":
                        resupuesta=division(pregunta);
                        break;
                }
                String nuevo="";//sustituyo la operacion opeerada por la respuesta
                for(int i=0;i<posicionInicial;i++){
                    nuevo=nuevo+demo.charAt(i);
                }
                nuevo=nuevo+resupuesta;
                for(int i=posicionFinal+1;i<demo.length();i++){
                    nuevo=nuevo+demo.charAt(i);
                }
                demo=nuevo;
            }
        }while(verificador==true);
        return demo;
    }
}
