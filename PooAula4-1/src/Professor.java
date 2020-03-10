
public class Professor extends Pessoa {
	
	private double salario;
	
	public Professor(String nome, String cpf, String dataNasc, double salario) {
		super(nome, cpf, dataNasc);
		this.salario = salario;
	}
	public double getSalario() {
		return this.salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	@Override
	public String toString() {
		
		return "Aluno\n" + "Nome: " + this.getNome() + "\nCPF: " + this.getCpf() + "\nData de Nascimento: "
				+ this.getDataNasc() + "\nSalario: " + this.salario;
	}
	

}
