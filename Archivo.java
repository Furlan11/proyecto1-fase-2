import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Archivo {
	public String Leer(String direccion){ //direccion del archivo
        
        String texto = "";
        
        try{
            BufferedReader bf = new BufferedReader(new FileReader(direccion));
            String temp = "";
            String bfRead;
            while((bfRead = bf.readLine()) != null){ 
                //haz el ciclo, mientras bfRead tiene datos
                temp = temp + bfRead; //guardado el texto del archivo
            }
            
            texto = temp;
            
        }catch(Exception e){ 
            System.err.println("No se encontro archivo");
        }
        
        return texto;
       
           }
	 public  ArrayList<String> Listar(String demo) {
	        ArrayList<String> listas = new ArrayList<String>();
	        int contador=0;
	        String cosa ="";
	        for (int i=0;i<demo.length();i++){
	            
	            if((demo.charAt(i)+"").equals("\n")){
	                listas.add(cosa);
	                cosa="";
	            }else{
	                cosa=cosa+demo.charAt(i);
	            }
	        }
	        listas.add(cosa);
	       return listas;

     	
     }
     

    
	
	
}
