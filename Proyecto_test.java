import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Proyecto_test {

	@Test
	void test() {
		String PrimerPalabra="";
		int j = 0;
		String palabra = "(defvar Fn 10)";
		while(!((palabra.charAt(j)+"").equals(" "))) {
			PrimerPalabra += palabra.charAt(j);
			j++;
		}
	}

}
