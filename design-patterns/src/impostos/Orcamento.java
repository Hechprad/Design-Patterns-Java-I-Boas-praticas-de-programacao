package impostos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Orcamento {

	protected double valor;
	private final List<Item> itens;
	
	protected EstadoDeUmOrcamento estadoAtual;
	
	public Orcamento(double valor) {
		this.valor = valor;
		itens = new ArrayList<Item>();
		estadoAtual = new EmAprovacao();
	}

	public double getValor() {
		return valor;
	}

	public void adicionaItem(Item item) {
		itens.add(item);
	}

	public List<Item> getItens() {
		return Collections.unmodifiableList(itens);
	}

	public void aplicaDescontoExtra() {
		estadoAtual.aplicaDescontoExtra(this);
	}

	public void aprova() {
		estadoAtual.aprova(this);
	}
	
	public void reprova() {
		estadoAtual.aprova(this);
	}
	
	public void finaliza() {
		estadoAtual.aprova(this);
	}
}
