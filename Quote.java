/**
 * 
 */

/**
 * Clase principal
 * @author Guillermo Furlan 20713 
 * @author Wilfredo Gallegos 20399
 * @author Alejandro Pallais 20093
 * 
 * Clase que verifica si es una lista
 */
public class Quote {
	boolean valor = false;
	public boolean valor(String s) {
		for (int i=0;i<s.length();i++) {
			if((s.charAt(i)+"").equals("'")) {
				valor = true;
			}
		}
		return valor;		
	}
}
