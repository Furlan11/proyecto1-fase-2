/**
 * 
 */
import java.util.HashMap;
import java.util.ArrayList;

import java.util.Map;
import java.util.Set;
/**
 * Clase principal
 * @author Guillermo Furlan 20713 
 * @author Wilfredo Gallegos 20399
 * @author Alejandro Pallais 20093
 * clase para definir variables
 */
public class Setq {

	public HashMap defVariable(boolean valor, String s,HashMap dic) {
		ArrayList<String> listaLinea = new ArrayList<String>();
		ArrayList<String> lista = new ArrayList<String>();
		String palabra = "";
		
		for (int i=0;i<s.length();i++) {
			if(!((s.charAt(i)+"").equals("(")||(s.charAt(i)+"").equals(")")||(s.charAt(i)+"").equals(" ")||(s.charAt(i)+"").equals("'")  )) {
				palabra += s.charAt(i)+"";
				
			}else if((s.charAt(i)+"").equals(" ")) {
				listaLinea.add(palabra);
				palabra = "";
			}
		}
		listaLinea.add(palabra);
		 /*
		 * clase para definir variables
		 */
		
		if(valor==(true)) {		
			for (int i=2;i<listaLinea.size();i++) {
				lista.add(listaLinea.get(i));
			}
			dic.put(listaLinea.get(1), lista);
		}else {
			dic.put(listaLinea.get(1), listaLinea.get(2));
		}

		System.out.println(dic);
		System.out.println("esta es una prueba");
		System.out.println(dic.size());
		Object[] keys = dic.keySet().toArray();
		for (int i=0;i<keys.length;i++) {
			String clave = (String) keys[i];
			//System.out.println(dic.get(clave));//obtiene el valor asignado a la clave 
		    System.out.println("La Clave: " + clave );
		    System.out.println("El valor de la clave es: "+ dic.get(clave)+"\n" );
		}
		return dic;
	}
	
}
