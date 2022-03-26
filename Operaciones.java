import java.util.ArrayList;
import java.util.HashMap;
/**
 * Clase principal
 * @author Guillermo Furlan 20713 
 * @author Wilfredo Gallegos 20399
 * @author Alejandro Pallais 20093
 * clase que realiza las operaciones
 */

public class Operaciones {
	
    public String suma(String sumandos) { 
        String resultado= "";
            String espacio=" ";
            int largo=sumandos.length();
            ArrayList<String> numeros = new ArrayList<String>();
            String numero="";

            for(int i=0; i<largo;i++) {
                    String caracter=String.valueOf(sumandos.charAt(i));//12 3 4 
                    //System.out.println("caracer " +caracter);
                    if(caracter.equals(espacio)) {
                        numeros.add(numero);
                        numero="";
                    }else{
                        numero=numero+caracter;
                    }
                    //System.out.println("numeros "+numeros);
            }
            numeros.add(numero);
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
            return(resultado); 

    }


    public String resta(String sumandos) { 
        String resultado= "";
            String espacio=" ";
            int largo=sumandos.length();
            ArrayList<String> numeros = new ArrayList<String>();
            String numero="";

            for(int i=0; i<largo;i++) {
                    String caracter=String.valueOf(sumandos.charAt(i));//12 3 4 
                    //System.out.println("caracer " +caracter);
                    if(caracter.equals(espacio)) {
                        numeros.add(numero);
                        numero="";
                    }else{
                        numero=numero+caracter;
                    }
                    //System.out.println("numeros "+numeros);
            }
            numeros.add(numero);
            //System.out.println(numeros);
            boolean esNumero=true;
            double respuesta=0;
            for(int i=1;i<numeros.size();i++){
                if(isNumeric(numeros.get(i))==false){
                    System.out.print("error, lo ingresado no es un numero");
                    esNumero=false;
                    i=numeros.size();
                }else{
                    respuesta=respuesta+Double.parseDouble(numeros.get(i));
                }
            }
            if(isNumeric(numeros.get(0))==false){
                System.out.print("error, lo ingresado no es un numero");
                esNumero=false;
            }else{
                respuesta=Double.parseDouble(numeros.get(0))-respuesta;
            }
            resultado=respuesta+"";
            return(resultado); 

    }

    public String Producto(String sumandos) { 
        String resultado= "";
            String espacio=" ";
            int largo=sumandos.length();
            ArrayList<String> numeros = new ArrayList<String>();
            String numero="";

            for(int i=0; i<largo;i++) {
                    String caracter=String.valueOf(sumandos.charAt(i));//12 3 4 
                    //System.out.println("caracer " +caracter);
                    if(caracter.equals(espacio)) {
                        numeros.add(numero);
                        numero="";
                    }else{
                        numero=numero+caracter;
                    }
                    //System.out.println("numeros "+numeros);
            }
            numeros.add(numero);
            //System.out.println(numeros);
            boolean esNumero=true;
            double respuesta=1;
            for(int i=0;i<numeros.size();i++){
                if(isNumeric(numeros.get(i))==false){
                    System.out.print("error, lo ingresado no es un numero");
                    esNumero=false;
                    i=numeros.size();
                }else{
                    respuesta=respuesta*Double.parseDouble(numeros.get(i));
                }
                resultado=respuesta+"";
            }
            return(resultado); 

    }

    public String Division(String sumandos) { 
        String resultado= "";
            String espacio=" ";
            int largo=sumandos.length();
            ArrayList<String> numeros = new ArrayList<String>();
            String numero="";

            for(int i=0; i<largo;i++) {
                    String caracter=String.valueOf(sumandos.charAt(i));//12 3 4 
                    //System.out.println("caracer " +caracter);
                    if(caracter.equals(espacio)) {
                        numeros.add(numero);
                        numero="";
                    }else{
                        numero=numero+caracter;
                    }
                    //System.out.println("numeros "+numeros);
            }
            numeros.add(numero);
            //System.out.println(numeros);
            boolean esNumero=true;
            double respuesta=1;
            for(int i=1;i<numeros.size();i++){
                if(isNumeric(numeros.get(i))==false){
                    System.out.print("error, lo ingresado no es un numero");
                    esNumero=false;
                    i=numeros.size();
                }else{
                    if(Double.parseDouble(numeros.get(i))==0){
                        System.out.print("error,  no puedes dividir por 0");
                    esNumero=false;
                    i=numeros.size();
                    }else{
                        respuesta=respuesta*Double.parseDouble(numeros.get(i));
                    }
                }
                resultado=respuesta+"";
            }
            if(isNumeric(numeros.get(0))==false){
                System.out.print("error, lo ingresado no es un numero");
                esNumero=false;
            }else{
                respuesta=Double.parseDouble(numeros.get(0))/respuesta;
            }
            resultado=respuesta+"";
            return(resultado); 

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
    public String operar (HashMap dic, String demo){
        boolean verificador=false;
        do{
            System.out.println(demo);
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
                        resupuesta=suma(pregunta);
                        break;
                    case "-":
                        resupuesta=resta(pregunta);
                        break;
                    case "*":
                        resupuesta=Producto(pregunta);
                        break;
                    case "/":
                        resupuesta=Division(pregunta);
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