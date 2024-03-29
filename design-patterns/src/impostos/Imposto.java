package impostos;

public abstract class Imposto {
	
	protected Imposto outroImposto;
	
	//construtor vazio caso n�o tenha outro imposto
	public Imposto() {}
	
	//construtor caso tenha outro imposto
	public Imposto(Imposto outroImposto) {
		this.outroImposto = outroImposto;
	}
	
	public abstract double calcula(Orcamento orcamento);
	
	protected double calculoDoOutroImposto(Orcamento orcamento) {
		if(outroImposto == null) return 0;
		return outroImposto.calcula(orcamento);
	}
	
}
