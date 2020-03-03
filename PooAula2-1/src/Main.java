import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
		Scanner tec = new Scanner(System.in);
		boolean flag = true;
		Funcionario func = null;
		
		do {
			System.out.println("****************MENU**********************");
			System.out.println("*   1 - cadastrar funcionario            *");
			System.out.println("*   2 - Exibir funcionario de alta renda *");
			System.out.println("*   0 - Sair                             *");
			System.out.println("******************************************");
			int op = tec.nextInt();
			tec.nextLine();
			switch (op) {
			case 1:
				System.out.println("Digite o nome do funcionario");
				String nome = tec.nextLine();
				System.out.println("Digite o salario do funcionario");
				double salario = tec.nextDouble();
				func = new Funcionario(nome, salario);
				funcionarios.add(func);
				
				break;
			case 2:
				if(funcionarios.size()>0) {	
					ArrayList<Funcionario> altaRenda = new ArrayList<Funcionario>();
				    altaRenda = func.altaRenda(funcionarios);
				    for(int i = 0; i<altaRenda.size();i++) {	
				    	System.out.println(altaRenda.get(i).getNome());
				    }
				}else {
					System.out.println("Não existe funcionarios cadastrados");
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
