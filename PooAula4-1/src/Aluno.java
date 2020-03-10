
public class Aluno extends Pessoa {

	private double[] notas = new double[4];

	public Aluno(String nome, String cpf, String dataNasc, double[] notas) {
		super(nome, cpf, dataNasc);
		this.notas = notas;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}	
	
	public double media() {
		double soma = 0;
		for(int i = 0; i<4; i++) {
			soma = soma + notas[i]; 
		}
		return soma/4;
	}
	
	@Override
	public String toString() {
		
		return "Aluno\n" + "Nome: " + this.getNome() + "\nCPF: " + this.getCpf() + "\nData de Nascimento: "
				+ this.getDataNasc() + "\nNotas: " + this.notas[0] + " - " + this.notas[1] + " - "
						+ this.notas[2] + " - " + this.notas[3] + " - ";
	}
	

}
