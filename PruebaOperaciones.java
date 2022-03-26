import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.ArrayList;

import junit.framework.TestCase;
public class PruebaOperaciones extends TestCase{
private Operaciones oper;

public void escenario() {
	oper=new Operaciones();
	
	
}
@Test
public void testIsNumeric() {
	escenario();
	assertTrue(Operaciones.isNumeric("2")==true);
}
@Test
public void Suma() {
	escenario();
	assertTrue((true==oper.suma("1 1").equals("2.0")));	
}
@Test
public void reta() {
	escenario();
	assertTrue((true==oper.resta("1 1").equals("0.0")));		
}
@Test
public void division() {
	escenario();
	assertTrue((true==oper.Division("1 1").equals("1.0")));		
}
@Test
public void producto() {
	escenario();
	assertTrue((oper.Producto("1 1").equals("1.0")));		
}
@Test
public void testvar() {
	HashMap <String, Object> dic =new HashMap<>();

	ArrayList<String> listaLinea = new ArrayList<String>();
	ArrayList<String> lista = new ArrayList<String>();
	String palabra = "";
	String s = "(setq Fn 10)";
	for (int i=0;i<s.length();i++) {
		if(!((s.charAt(i)+"").equals("(")||(s.charAt(i)+"").equals(")")||(s.charAt(i)+"").equals(" ")||(s.charAt(i)+"").equals("'")  )) {
			palabra += s.charAt(i)+"";
			
		}else if((s.charAt(i)+"").equals(" ")) {
			listaLinea.add(palabra);
			palabra = "";
		}
	}
	listaLinea.add(palabra);
	dic.put(listaLinea.get(1), listaLinea.get(2));
	Object[] keys = dic.keySet().toArray();
	for (int i=0;i<keys.length;i++) {
		String clave = (String) keys[i];
	assertTrue((clave).equals("Fn"));
	}
}
@Test
public void testvalor() {
	HashMap <String, Object> dic =new HashMap<>();

	ArrayList<String> listaLinea = new ArrayList<String>();
	ArrayList<String> lista = new ArrayList<String>();
	String palabra = "";
	String s = "(setq Fn 10)";
	for (int i=0;i<s.length();i++) {
		if(!((s.charAt(i)+"").equals("(")||(s.charAt(i)+"").equals(")")||(s.charAt(i)+"").equals(" ")||(s.charAt(i)+"").equals("'")  )) {
			palabra += s.charAt(i)+"";
			
		}else if((s.charAt(i)+"").equals(" ")) {
			listaLinea.add(palabra);
			palabra = "";
		}
	}
	listaLinea.add(palabra);
	dic.put(listaLinea.get(1), listaLinea.get(2));
	Object[] keys = dic.keySet().toArray();
	for (int i=0;i<keys.length;i++) {
		String clave = (String) keys[i];
	assertTrue((dic.get(clave)).equals("10"));
	}
}

}