package Exercicio_DECORATOR_filtrosDeBanco;

import java.util.List;

public abstract class Filtro {
	
	protected Filtro outroFiltro;

	public Filtro() {}
	
	public Filtro(Filtro outroFiltro) {
		this.outroFiltro = outroFiltro;
	}
	
	public abstract List<Conta> filtra(List<Conta> contas);
}
