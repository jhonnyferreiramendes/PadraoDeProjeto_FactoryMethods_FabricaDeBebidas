package br.edu.fafic.EngenhariaDeSoftware2.Bebidas;

import br.edu.fafic.EngenhariaDeSoftware2.Interfaces.LojaDeBebidas;

public class LojaDeBebidasFactory {

	public static LojaDeBebidas getLojaDeBebidas(String tipo, String nome, int volume) {
		if (tipo.equalsIgnoreCase("Cerveja")) {
			return new Cerveja(tipo, nome, volume);
		} else if (tipo.equalsIgnoreCase("Refrigerante")) {
			return new Refrigerante(tipo, nome, volume);
		
		} else {
			System.out.print("\nERRO! \nEscolha entre: Cerveja ou Refrigerante");
			return null;

		}
	}

}
