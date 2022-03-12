import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author Wilfredo
 *
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
		System.out.println("Ingrese la ruta del archivo .txt a leer:");
		String ruta = teclado.nextLine();
		String texto = archivo.Leer(ruta);
		ArrayList<String> lista = archivo.Listar(texto);
		for(int i=0; i<lista.size();i++) {
			if(lista.get(i).equals(null)) {
				continue;
			}else if(lista.get(i)!=null) {
				if(lista.get(i).length()==1) {
					continue;
				}else if(lista.get(i).length()>1) {
					/*for(int j=0;j<lista.get(i).length();i++) {
						String.valueOf(lista.get(i).charAt(i)+"");
					}*/
					System.out.println(lista.get(i));
					try{
						if ((( lista.get(i)).charAt(1)+"").equals("+")||(( lista.get(i)).charAt(1)+"").equals("/")||(( lista.get(i)).charAt(1)+"").equals("-")||(( lista.get(i)).charAt(1)+"").equals("*")) {
							System.out.println(operaciones.operar(lista.get(i))+"\n");
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
