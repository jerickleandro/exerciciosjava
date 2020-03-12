
public class Conta {
	private int numConta;
	private double taxa;
	private double saldo;
	private String banco;
	public Conta(int numConta, double taxa, double saldo, String banco) {
		this.numConta = numConta;
		this.taxa = taxa;
		this.saldo = saldo;
		this.banco = banco;
	}
	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	public double getTaxa() {
		return taxa;
	}
	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getBanco() {
		return banco;
	}
	public void setBanco(String banco) {
		this.banco = banco;
	}
	public boolean sacar(double valor) {
		this.saldo = this.saldo-valor;
		return true;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
	
	

}
