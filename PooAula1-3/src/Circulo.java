
public class Circulo {

	private double raio;
	final double PI = 3.1416;
	
	public Circulo (double raio) {
		this.raio = raio;
	}
	
	public double getRaio() {
		return this.raio;
	}
	
	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	public double area(){
		return PI * (raio*raio);
	}
	
	public double perimetro() {
		return 2*PI*raio;
	}
	
}
