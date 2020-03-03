import java.util.ArrayList;
import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
		boolean flag = true;
		
		
		do {
		System.out.println("****************MENU*********************");
		System.out.println("*   1 - Cadastrar um funcionário        *");
		System.out.println("*   2 - Calcula imposto                 *");
		System.out.println("*   0 - Sair                            *");
		System.out.println("*****************************************");
		int op = tec.nextInt();
		tec.nextLine();
		switch (op) {
		case 1:
			
			System.out.println("Digite o nome:");
			String nome = tec.nextLine();
			System.out.println("Digite o salario:");
			double salario = tec.nextDouble();
			funcionarios.add(new Funcionario(nome, salario));
			System.out.println("Funcionario cadastrado com sucesso!");
			break;
		case 2:
			if(funcionarios.size() > 0) {
				System.out.println("Digito o nome:");
				String nome2 = tec.nextLine();
				for(Funcionario f : funcionarios) {
					if(f.getNome().equals(nome2)) {
						if(f.imposto() == 0) {
							System.out.println("Isento de imposto!");
						}else {
							System.out.println("Imposto a ser recolhido será: " + f.imposto());
						}
					}
				}
				
			}else {
				System.out.println("Ainda não existe um funcionário cadastrado!");
			}
			break;
		case 0:
			flag = false;
			break;
		default:
			System.out.println("Essa não é uma opção valida!");
			break;
		}
		
		
		}while(flag);
		
	}

}
