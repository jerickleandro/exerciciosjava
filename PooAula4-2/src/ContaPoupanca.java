
public class ContaPoupanca extends Conta {
	
	public ContaPoupanca (int numConta, double taxa, double saldo, String banco) {
		super(numConta, taxa, saldo, banco);
		
	}
	public void atualizar(){
		this.setSaldo(this.getSaldo()+this.getTaxa());
	}
	public boolean sacar(double valor) {
		if(valor < this.getSaldo()) {
			this.setSaldo(this.getSaldo()-valor);
			return true;
		}
		return false;
	}
	
	

}
