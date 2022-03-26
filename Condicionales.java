import java.util.ArrayList;
import java.util.HashMap;

/**
 * Clase principal
 * @author Guillermo Furlan 20713 
 * @author Wilfredo Gallegos 20399
 * @author Alejandro Pallais 20093
 * clase para llevar a cabo ciclo for
 */

public class Condicionales {
	Operaciones operaciones = new Operaciones();
	Quote quote = new Quote();
	Predicados predicado = new Predicados();
	Setq set = new Setq();
	//Condicionales cond = new Condicionales();
	ArrayList<String> listapaciclo = new ArrayList<>();
	
	public ArrayList<String> ciclo(ArrayList<String> ciclo, HashMap dic,ArrayList<String> codigo,int indice) {
		listapaciclo.clear();
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

		listapaciclo=ciclo;

		return ciclo;
	}
	
	public HashMap<String, Object> operarciclo(HashMap<String, Object> dic, ArrayList<String> ciclo) {
		System.out.println("****VA INICIAR CICLO****");
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
		System.out.println("\n obtuvo el valor de "+linea1.get(4)+": "+dic.get(linea1.get(4)));
		//System.out.println(dic.get(linea1.get(0)));
		//System.out.println(dic.get(linea1.get(4)));

		listapaciclo.remove(0);
		for(int r=Integer.parseInt(linea1.get(2));r<Integer.parseInt((String) dic.get(linea1.get(4)));r++) {
			
			String PrimerPalabra="";
			int j = 6;
			for (int i=0;i<listapaciclo.size();i++) {
				//System.out.println("lista pa ciclo "+listapaciclo.get(i));
				if(listapaciclo.get(i).equals(null)) {
					continue;
				}else if(listapaciclo.get(i)!=null) {
					if(listapaciclo.get(i).length()==1) {
						continue;
					}else if(listapaciclo.get(i).length()>1) {
						PrimerPalabra="";
						j = 6;
						while(!((listapaciclo.get(i).charAt(j)+"").equals(" "))) {
							PrimerPalabra += listapaciclo.get(i).charAt(j);
							j++;					
						}
						//System.out.println(PrimerPalabra);
						/*for(int j=0;j<lista.get(i).length();i++) {
							String.valueOf(lista.get(i).charAt(i)+"");
						}*/
						//System.out.println(lista.get(i));
						try{
							if ((PrimerPalabra).equals("(+")||(PrimerPalabra).equals("(/")||(( listapaciclo.get(i)).charAt(1)+"").equals("(-")||(( listapaciclo.get(i)).charAt(1)+"").equals("(*")) {
								System.out.println("VA A OPERAR LO QUE PIDE\n");
								System.out.println(operaciones.operar(dic,listapaciclo.get(i))+"\n");
							}else if(PrimerPalabra.equals("(setq")) {
								boolean valor = predicado.Listp(listapaciclo.get(i));
								System.out.println(valor);
								set.defVariable(valor, listapaciclo.get(i),dic);
							}//else if(PrimerPalabra.equals("(loop")) {
								//ArrayList<String> ciclo1 = new ArrayList<>();
								//ciclo1 = cond.ciclo(ciclo1, dic, listapaciclo, i);
								//System.out.println("Numero de lineas del loop : "+ciclo);
								//dic = cond.operarciclo(dic,ciclo1);
								//System.out.println(dic);
							//}
							else if(PrimerPalabra.equals("(print")) {
								System.out.println("VA A IMPRIMIR LO QUE PIDE\n");
								String impresion="";
								String palabra1="";
								for(int k=6;k<listapaciclo.get(i).length();k++) {
									
									if((listapaciclo.get(i).charAt(k)+"").equals("(")||(listapaciclo.get(i).charAt(k)+"").equals(")")) {
										continue;
									}else {
										if((listapaciclo.get(i).charAt(k)+"").equals(" ")==false) {
											palabra1=palabra1+(listapaciclo.get(i).charAt(k)+"");
											
										}else {
											if(dic.containsKey(palabra1)==true) {
												//System.out.println("VA A IMPRIMIR 1\n");
												System.out.println((dic.get(palabra1)).getClass().getSimpleName());
												System.out.println(palabra1);
												System.out.println((dic.get("lista")).getClass().getSimpleName());
												//System.out.println("VA A IMPRIMIR 2\n");
												//if((dic.get(palabra)).getClass().getSimpleName()==true){
													//System.out.println("entro al if");
													//palabra=dic.get(palabra).toString();
											//	}else {
												palabra1=String.valueOf(dic.get(palabra1).toString());
												//}
											}
											impresion=impresion+" "+palabra1;
											palabra1 = "";
										}
									}

									
								}
								impresion=impresion+" "+palabra1;
								System.out.println(impresion);
							}
						
						}catch(Exception e){
							System.out.println("no opera nada1");
						}

					}else {
						System.out.println(" ");
					}
				
				}else {
					System.out.println("no");
				}
			}
			
			
		}

		//for(int i=Integer.parseInt(String.valueOf(dic.get(linea1.get(0))));i<Integer.parseInt(String.valueOf(dic.get(linea1.get(4))));i++) {
		//	System.out.println(i);
		//}
		System.out.println("**TERMINO CICLO**");
		return dic;
	}
}

