/**
 * 
 */
import java.util.HashMap;
import java.util.ArrayList;
/**
 * Clase principal
 * @author Guillermo Furlan 20713 
 * @author Wilfredo Gallegos 20399
 * @author Alejandro Pallais 20093
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
		if(valor==(true)) {		
			for (int i=2;i<listaLinea.size();i++) {
				lista.add(listaLinea.get(i));
			}
			dic.put(listaLinea.get(1), lista);
		}else {
			dic.put(listaLinea.get(1), listaLinea.get(2));
		}
		
		System.out.println(dic);
		System.out.println(dic.get("lista"));
		return dic;
	}
	
}
