import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		boolean flag = true;
		Circulo c = null;
			
		do {
		System.out.println("****************MENU*********************");
		System.out.println("*   1 - Criar um Circulo                *");
		System.out.println("*   2 - Calcular Área                   *");
		System.out.println("*   3 - Calcular Perimetro              *");
		System.out.println("*   0 - Sair                            *");
		System.out.println("*****************************************");
		int op = tec.nextInt();
		
		switch (op) {
		case 1:
			System.out.println("Digite o valor do raio: ");
			double valor = tec.nextInt();
			c = new Circulo(valor);			
			break;
		case 2:
			if(c != null) {
				
				System.out.println("O valor da área é:" + c.area());
				
			}else {
				System.out.println("Ainda não existe um circulo criado.");
			}
			break;
		case 3:
			if(c != null) {
				System.out.println("O valor do perimetro é: " + c.perimetro());
				
			}else {
				System.out.println("Ainda não existe um circulo criado.");
			}
			break;
		case 0:
			System.out.println("Obrigado pela preferencia!");
			flag = false;
			break;

		default:
			System.out.println("Valor invalido!");
			break;
		}
		
		}while(flag);
						
	}

}
