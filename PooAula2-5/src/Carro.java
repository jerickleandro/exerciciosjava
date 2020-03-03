
public class Carro {
	private double eficiencia;
	private double combustivel;
	
	public Carro(double eficiencia, double combustivel) {
		this.eficiencia = eficiencia;
		this.combustivel = combustivel;
	}
	public double getEficiencia() {
		return this.eficiencia;
	}
	public void setEficiencia(double eficiencia) {
		this.eficiencia = eficiencia;
	}
	public double getCombustivel() {
		return this.combustivel;
	}
	public void setCombustivel(double combustivel){
		this.combustivel = combustivel;
	}

	public void andar(double km) {
		if(km <= (this.eficiencia*this.combustivel)) {
			this.combustivel = this.combustivel-(km/this.eficiencia);
			System.out.println("Viagem iniciada.");
			System.out.println("A quantidade necessaria de combustivel para percorrer é: " + (km/this.eficiencia) + "L");
		}else {
			System.out.println("O carro não tem a quantidade de combustivel necessaria para essa viagem.");
			System.out.println("Abasteça com " + (km/(this.eficiencia*this.combustivel)) + "L de combustivel");
		}
	}
	
}
