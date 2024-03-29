package Exercicio_CHAIN_OF_RESPONSABILITY_requisicoesWeb;

public class RespostaEmCsv implements Resposta {

	private Resposta outraResposta;

	@Override
	public void responde(Requisicao req, Conta conta) {
		if (req.getFormato() == Formato.CSV) {
			System.out.println(conta.getTitular() + "," + conta.getSaldo());
		} else {
			outraResposta.responde(req, conta);
		}
	}

	@Override
	public void setProxima(Resposta resposta) {
		this.outraResposta = resposta;
	}
}
