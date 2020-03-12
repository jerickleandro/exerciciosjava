
public class ContaCorrente extends Conta {
	
	public ContaCorrente (int numConta, double taxa, double saldo, String banco) {
		super(numConta, taxa, saldo, banco);
	
		}

	public void atualizar(){
		this.setSaldo(this.getSaldo()-this.getTaxa());
		
	}
	
}
