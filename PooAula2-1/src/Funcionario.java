import java.util.ArrayList;

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
	public ArrayList<Funcionario> altaRenda(ArrayList<Funcionario> funcionarios){
		ArrayList<Funcionario> f1 = new ArrayList<Funcionario>();
		for( Funcionario f : funcionarios ) {
			if(f.getSalario() > 5000) {
				f1.add(f);
			}
		}
		return f1;
	}
	
	
}
