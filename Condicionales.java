import java.util.ArrayList;
import java.util.HashMap;

/**
 * Clase principal
 * @author Guillermo Furlan 20713 
 * @author Wilfredo Gallegos 20399
 * @author Alejandro Pallais 20093
 * 
 */

public class Condicionales {
	Operaciones operaciones = new Operaciones();
	Quote quote = new Quote();
	Predicados predicado = new Predicados();
	Setq set = new Setq();
	//Condicionales cond = new Condicionales();
	
	
	public ArrayList<String> ciclo(ArrayList<String> ciclo, HashMap dic,ArrayList<String> codigo,int indice) {
		int principal=indice;
		int contador= 0;
		int lineas=0;
		boolean stay = true;
		while(stay==true) {
			lineas++;
			for(int i=0;i<codigo.get(indice).length();i++) {
				if(((( codigo.get(indice)))==(null))) {
					continue;
				}else if(!((( codigo.get(indice))).equals(null))){
					if(((codigo.get(indice)).charAt(i)+"").equals("(")) {
						contador++;
					}else if((( codigo.get(indice)).charAt(i)+"").equals(")")) {
						contador=contador-1;
						if(contador==0) {
							ciclo.add(codigo.get(indice));
							stay=false;
							break;
						}else {
							continue;
						}
					}else {
						continue;
					}
					ciclo.add(codigo.get(indice));
					indice++;
				}else {
					continue;
				}
			}
		}
		
		return ciclo;
	}
	
	public HashMap<String, Object> operarciclo(HashMap<String, Object> dic, ArrayList<String> ciclo) {
		ciclo.get(0);
		String palabra = "";
		ArrayList<String> linea1 = new ArrayList<>();
		for (int i=10;i<ciclo.get(0).length();i++) {
			if(!((ciclo.get(0).charAt(i)+"").equals("(")||(ciclo.get(0).charAt(i)+"").equals(")")||(ciclo.get(0).charAt(i)+"").equals(" ")||(ciclo.get(0).charAt(i)+"").equals("'")  )) {
				palabra += ciclo.get(0).charAt(i)+"";
				
			}else if((ciclo.get(0).charAt(i)+"").equals(" ")) {
				linea1.add(palabra);
				palabra = "";
			}
		}
		linea1.add(palabra);
		System.out.println(linea1);
		dic.put(linea1.get(0), Integer.parseInt(linea1.get(2)));
		System.out.println("obtuvo el valor de "+linea1.get(4)+": "+dic.get(linea1.get(4)));
		//System.out.println(dic.get(linea1.get(0)));
		//System.out.println(dic.get(linea1.get(4)));
		for(int i=Integer.parseInt(String.valueOf(dic.get(linea1.get(0))));i<Integer.parseInt(String.valueOf(dic.get(linea1.get(4))));i++) {
			System.out.println(i);
		}
		
		return dic;
	}
}

