
public class Funcionario {
	private String nome;
	private double salario;
	
	public Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return this.salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double imposto() {
		if(salario <= 2000) {
			return 0;
		}else if(salario > 2000 && salario <= 3500) {
			return salario * 0.15;
		}else if(salario >3500 && salario <= 5000){
			return salario * 0.22;
		}else {
			return salario * 0.30;
		}
	}
	
}
