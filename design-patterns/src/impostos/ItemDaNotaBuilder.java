package impostos;

public class ItemDaNotaBuilder {
	
	private String nome;
	private double valor;
	
	public ItemDaNotaBuilder comNome(String nome) {
		this.nome = nome;
		return this;
	}
	
	public ItemDaNotaBuilder comValor(double valor) {
		this.valor = valor;
		return this;
	}
	
	public ItemDaNota constroi() {
		return new ItemDaNota(nome, valor);
	}
}