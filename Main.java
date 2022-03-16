import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;

/**
 * 
 */

/**
 * Clase principal
 * @author Guillermo Furlan 20713 
 * @author Wilfredo Gallegos 20399
 * @author Alejandro Pallais 20093
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		Archivo archivo = new Archivo();
		Operaciones operaciones = new Operaciones();
		Quote quote = new Quote();
		Predicados predicado = new Predicados();
		Setq set = new Setq();
		HashMap <String, Object> dic =new HashMap<>();

		
		
		System.out.println("Ingrese la ruta del archivo .txt a leer:");
		String ruta = teclado.nextLine();
		String texto = archivo.Leer(ruta);
		ArrayList<String> lista = archivo.Listar(texto);
		String PrimerPalabra="";
		int j = 0;
		
		for(int i=0; i<lista.size();i++) {
			
			if(lista.get(i).equals(null)) {
				continue;
			}else if(lista.get(i)!=null) {
				if(lista.get(i).length()==1) {
					continue;
				}else if(lista.get(i).length()>1) {
					PrimerPalabra="";
					j = 0;
					while(!((lista.get(i).charAt(j)+"").equals(" "))) {
						PrimerPalabra += lista.get(i).charAt(j);
						j++;					
					}
					System.out.println(PrimerPalabra);
					/*for(int j=0;j<lista.get(i).length();i++) {
						String.valueOf(lista.get(i).charAt(i)+"");
					}*/
					//System.out.println(lista.get(i));
					try{
						if ((PrimerPalabra).equals("(+")||(( lista.get(i)).charAt(1)+"").equals("/")||(( lista.get(i)).charAt(1)+"").equals("-")||(( lista.get(i)).charAt(1)+"").equals("*")) {
							System.out.println(operaciones.operar(lista.get(i))+"\n");
						}else if(PrimerPalabra.equals("(setq")) {
							boolean valor = predicado.Listp(lista.get(i));
							System.out.println(valor);
							set.defVariable(valor, lista.get(i),dic);
						}
					
					}catch(Exception e){
						System.out.println("no opera nada1");
					}

				}else {
					System.out.println("no opera nada");
				}
			
			}else {
				System.out.println("no");
			}
			
		}
		
	}


}



/**texto = "(defvar Fn 10)\n (defvar lista '(1 1))\n" + 
"(loop for i from 2 to Fn\n" + 
"    do(setq lista (append (list (* (nth 0 lista) i)) lista))\n" + 
")\n" + 
"(print (car lista))";**/