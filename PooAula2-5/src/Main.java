import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		boolean flag = true;
		
		System.out.println("Digite a quantidade de combustivel: ");
		double combustivel = tec.nextDouble();
		System.out.println("Digite a eficiência desse carro: ");
		double eficiencia = tec.nextDouble();
		Carro carro = new Carro(eficiencia, combustivel);
			
		
		do {
			System.out.println("****************MENU*********************");
			System.out.println("*   1 - Andar                           *");
			System.out.println("*   2 - Reabastecer                     *");
			System.out.println("*   3 - Quantidade de combustível       *");
			System.out.println("*   4 - Encerrar a viagem               *");
			System.out.println("*****************************************");
			int op = tec.nextInt();
			
			switch(op) {
			
				case 1:
					System.out.println("Digite a quilomentragem a viajar:");
					double km = tec.nextDouble();
					carro.andar(km);
					break;
				case 2:
					System.out.println("Quantos litros deseja abastecer?");
					double comb = tec.nextDouble();
					carro.setCombustivel(carro.getCombustivel()+comb);
					break;
				case 3:
					System.out.println("Quantidade de combustivel é: " + carro.getCombustivel()+"L");
					break;
				case 4:
					flag = false;
					break;
				default:
					break;
			}
		}while(flag);

	}

}
