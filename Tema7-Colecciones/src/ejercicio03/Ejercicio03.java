package ejercicio03;

import java.util.TreeMap;

public class Ejercicio03 {

	public static void main(String[] args) {
		String texto = "en un agujero en el suelo, vivia un hobbit. no un agujero humedo, "
				+ "sucio, repugnante, con restos de gusanos y olor a fango, ni tampoco "
				+ "un agujero, seco, desnudo y arenoso, sin nada en que sentarse o que "
				+ "comer: era un agujero-hobbit, y eso significa comodidad";
		
		
		TreeMap<Character, Integer> diccionario = new TreeMap<Character, Integer>();

		texto = texto.replaceAll("[^a-z]","");
		
		for(int i=0; i<texto.length();i++) {
			Character text=texto.charAt(i);
			if(!diccionario.containsKey(text)) {
				diccionario.put(text, i);
			}else {
				diccionario.put(text,diccionario.get(text)+1);
			}
		}
		System.out.println(diccionario);
		
		

	}

}
