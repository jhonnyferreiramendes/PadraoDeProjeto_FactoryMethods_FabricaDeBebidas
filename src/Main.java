import br.edu.fafic.EngenhariaDeSoftware2.Bebidas.LojaDeBebidasFactory;
import br.edu.fafic.EngenhariaDeSoftware2.Interfaces.LojaDeBebidas;

public class Main {

	public static void main(String[] args) {
		
		LojaDeBebidas lojaDeRefrigerante = LojaDeBebidasFactory.getLojaDeBebidas("refrigerante", "Cajuina", 450);
		
		System.out.println("\n");
		
		LojaDeBebidas lojaDeCerveja = LojaDeBebidasFactory.getLojaDeBebidas("cerveja", "Bohemia", 500);
		
		
	}

}
