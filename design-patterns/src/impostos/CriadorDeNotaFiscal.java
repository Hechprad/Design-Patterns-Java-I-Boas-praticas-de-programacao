package impostos;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class CriadorDeNotaFiscal {

	private String razaoSocial;
	private String cnpj;
	private List<ItemDaNota> todosItens = new ArrayList<ItemDaNota>();
	private double valorBruto;
	private double impostos;
	private String observacoes;
	private Calendar data;

	public void paraEmpresa(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public void comCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public void comItem(ItemDaNota item) {
		todosItens.add(item);
		valorBruto += item.getValor();
		impostos += item.getValor() * 0.05;
	}
	
	public void comObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	public void naDataAtual() {
		this.data = Calendar.getInstance();
	}
	
	public NotaFiscal constroi() {
		return new NotaFiscal(razaoSocial, cnpj, data, valorBruto, impostos, todosItens, observacoes);
	}
}
