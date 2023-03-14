package ProjetosDeSistema.estrategia.patterns;

public class Teste {

	public static void main(String[] args) {
		
		Cadeira madeira = new Cadeira("madeira", "marrom", null);
		madeira.setPreco(new PrecoPromocao());
		madeira.Preco();

		System.out.println("-");
		
		Cadeira gamer = new Cadeira("gamer", "branca", null);
		gamer.setPreco(new MudarPreco());
		gamer.Preco();

	}

}