package br.edu.fafic.EngenhariaDeSoftware2.Bebidas;

import br.edu.fafic.EngenhariaDeSoftware2.Interfaces.LojaDeBebidas;

public class Cerveja implements LojaDeBebidas {
	
	public Cerveja(String tipo, String nome, int volume) {
		this.tipoDaBebida(tipo);
		this.nomeDaBebida(nome);
		this.volumeDaBebida(volume);
		
	}

	public void tipoDaBebida(String tipo) {
		System.out.println("Tipo de bebida: " + tipo);

	}

	public void nomeDaBebida(String nome) {
		System.out.println("Nome da Cerveja: " + nome);

	}

	public void volumeDaBebida(int volume) {
		System.out.println("Volume da cerveja: " + volume);

	}

}
