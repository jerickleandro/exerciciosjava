
public class Pessoa {
	private String nome;
	private double altura;
	private double peso;
	
	public Pessoa(String nome, double altura, double peso) {
		this.nome = nome;
		this.altura = altura;
		this.peso = peso;
	}
	
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getAltura() {
		return this.altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getPeso() {
		return this.peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double imc() {
		return (this.peso/(this.altura*this.altura));
	}
}
