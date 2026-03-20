package abstracaoexercicios;

public class PessoaJuridica extends Pessoa {

	private int qtdfunc;

	public PessoaJuridica() {
		
	}
	
	
	
	
	public PessoaJuridica(String nome, Double rendaAnual, int qtdfunc) {
		super(nome, rendaAnual);
		this.qtdfunc = qtdfunc;
	}




	@Override
	public Double imposto() {
		Double impost = 0.0;
		
		if(qtdfunc > 10) {
			impost += (getRendaAnual() * 0.14);
		}else {
			impost += (getRendaAnual() * 0.16);
		}
		return impost;
	}
	
}
