/**
 * 
 */

/**
 * @author Guillermo Furlan 20713 
 * @author Wilfredo Gallegos 20399
 * @author Alejandro Pallais 20093
 * Clase que verifica si es una lista
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
}
