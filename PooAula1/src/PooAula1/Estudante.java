package PooAula1;
public class Estudante {
	private String nome;
	private String matricula;
	private String endereco;
	private double notas[] = new double[4];
	

	
	public Estudante(String nome, String matricula, String endereco, double[] notas) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.endereco = endereco;
		this.notas = notas;
	}

	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatricula() {
		return this.matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getEndereco() {
		return this.endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	public double calculaMedia() {
		double somaNotas = 0;
		for(int i = 0; i<4; i++) {
			somaNotas = somaNotas + this.notas[i];
		}
		return somaNotas/4;
	}
	
}
