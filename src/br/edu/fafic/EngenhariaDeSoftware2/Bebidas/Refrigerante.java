package br.edu.fafic.EngenhariaDeSoftware2.Bebidas;

import br.edu.fafic.EngenhariaDeSoftware2.Interfaces.LojaDeBebidas;

public class Refrigerante implements LojaDeBebidas {
	
	public Refrigerante(String tipo, String nome, int volume) {
		this.tipoDaBebida(tipo);
		this.nomeDaBebida(nome);
		this.volumeDaBebida(volume);
	}

	public void tipoDaBebida(String tipo) {
		System.out.println("Tipo de bebida: " + tipo);

	}

	public void nomeDaBebida(String nome) {
		System.out.println("Nome: " + nome);

	}

	public void volumeDaBebida(int volume) {
		System.out.println("Volume: " + volume);

	}

}
