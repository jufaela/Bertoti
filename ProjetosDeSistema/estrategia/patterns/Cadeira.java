package ProjetosDeSistema.estrategia.patterns;

public class Cadeira {

	private Preco preco;
	private String modelo;
	private String cor;
	
	public Cadeira(String modelo, String cor, Preco preco) {
		this.setModelo(modelo);
		this.setCor(cor);
		this.setPreco(preco);
	}

	public void Preco() {
		preco.DarPreco();
	}


	public Preco getPreco() {
		return preco;
	}
	public void setPreco(Preco preco) {
		this.preco = preco;
	}

	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
}
	