/**
 * 
 */

/**
 * @author ThinkPad T470
 *
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

}
