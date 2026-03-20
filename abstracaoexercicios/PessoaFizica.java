package abstracaoexercicios;

public class PessoaFizica extends Pessoa{
	
	
	private Double gastoSaude;
	
	public PessoaFizica() {
	super();
	}
	
	

	public PessoaFizica(String nome, Double rendaAnual, Double gastoSaude) {
		super(nome, rendaAnual);
		
		this.gastoSaude = gastoSaude;
	}



	@Override
	public Double imposto() {
		Double impost = 0.0;
		if(getRendaAnual() < 20000.00) {
			impost += (getRendaAnual() * 0.15);
		}else {
			impost += (getRendaAnual() * 0.25);
		}
		
		if(gastoSaude > 0 ) impost -= (gastoSaude* 0.5);
		
		return impost;
	}

	
	
}
