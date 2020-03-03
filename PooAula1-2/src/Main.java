import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		Retangulo r = null;
		boolean flag = true;
		
		do{
		System.out.println("**********MENU*************");
		System.out.println("*   1 - Criar Retangulo   *");
		System.out.println("*   2 - Calcular Área     *");
		System.out.println("*   3 - Obter Perímetro   *");
		System.out.println("*   0 - Sair              *");
		System.out.println("***************************");
		int op = tec.nextInt();
		
		switch (op) {
		case 1:
			System.out.println("Digite o tamanho da base:");
			double base = tec.nextDouble();
			System.out.println("Digite o tamanho da altura");
			double altura = tec.nextDouble();
			r = new Retangulo(base, altura);
			break;
		case 2:
			
			if(r != null) {
				System.out.println("A área é: " + r.area());
			}else {
				System.out.println("O retangulo ainda não foi criado");
			}
			
			break;
		case 3:
			if(r != null) {
				System.out.println("O perímetro é: " + r.perimetro());
			}else {
				System.out.println("O retangulo ainda não foi criado");
			}
			break;
		case 0:
			
			flag = false;
			break;

		default:
			System.out.println("Essa opção não é valida");
			break;
		}
		
		
		
		}while(flag);
		

	}

}
