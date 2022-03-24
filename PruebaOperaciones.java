import junit.framework.TestCase;
public class PruebaOperaciones extends TestCase{
private Operaciones oper;

public void escenario() {
	oper=new Operaciones();
	
	
}
public void testIsNumeric() {
	escenario();
	assertTrue(Operaciones.isNumeric("2")==true);
}

public void Suma() {
	escenario();
	assertTrue((true==oper.suma("1 1").equals("2.0")));	
}
public void reta() {
	escenario();
	assertTrue((true==oper.resta("1 1").equals("0.0")));		
}
public void division() {
	escenario();
	assertTrue((true==oper.Division("1 1").equals("1.0")));		
}
public void producto() {
	escenario();
	assertTrue((oper.Producto("1 1").equals("1.0")));		
}
}
       