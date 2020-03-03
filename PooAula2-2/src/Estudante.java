

public class Estudante {
	private String matricula;
	private String nome;
	private double[] notas = new double[2];
	
	public Estudante(String matricula, String nome, double[] notas) {
		this.matricula = matricula;
		this.nome = nome;
		this.notas = notas;
	}
	public Estudante(String matricula, String nome) {
		this.matricula = matricula;
		this.nome = nome;
	}
	public Estudante() {
		
	}
	
		
	public String getMatricula() {
		return this.matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double[] getNotas() {
		return this.notas;
	}
	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	public double media() {
		double soma = notas[0] + notas[1];
		return soma/2;
	}
	
}
