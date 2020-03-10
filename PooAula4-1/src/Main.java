import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		boolean flag = true;
		ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
		String nome, cpf, dataNasc;
		
		
		do {
		System.out.println("****************MENU*********************");
		System.out.println("*   1 - Cadastrar Aluno                 *");
		System.out.println("*   2 - Cadastra professor              *");
		System.out.println("*   3 - Obter media do aluno            *");
		System.out.println("*   4 - Obter informações do aluno      *");
		System.out.println("*   5 - Obter informações do professor  *");
		System.out.println("*   0 - Sair                            *");
		System.out.println("*****************************************");
		int op = tec.nextInt();
		tec.nextLine();
		switch(op) {
		case 1:
			System.out.println("Digite o nome do Aluno");
			nome = tec.nextLine();
			System.out.println("Digite o CPF do aluno: (xxx.xxx.xxx-xx)");
			cpf = tec.nextLine();
			System.out.println("Digite a data de nascimento: dd/mm/aaaa");
			dataNasc = tec.nextLine();
			double[] notas = new double[4];
			for(int i = 0; i<4; i++) {
				System.out.println("Digite a "+(i+1) + "ª nota: ");
				notas[i] = tec.nextDouble();
			}
			pessoas.add(new Aluno(nome, cpf, dataNasc, notas));
			System.out.println("Aluno cadastrado com sucesso!");
			break;
		case 2:
			System.out.println("Digite o nome do Professor");
			nome = tec.nextLine();
			System.out.println("Digite o CPF do Professor: (xxx.xxx.xxx-xx)");
			cpf = tec.nextLine();
			System.out.println("Digite a data de nascimento: dd/mm/aaaa");
			dataNasc = tec.nextLine();
			System.out.println("Digite o salario do professor: ");
			double salario = tec.nextDouble();
			pessoas.add(new Professor(nome, cpf, dataNasc, salario));
			System.out.println("Pessoa cadastrada com sucesso!");
			break;
		case 3:
			if(pessoas.size() > 0) {
				System.out.println("Digite o nome do aluno:");
				nome = tec.nextLine();
				for(Pessoa p : pessoas) {
					if(p.getNome().equalsIgnoreCase(nome)) {
						if(p instanceof Aluno) {
							Aluno a = (Aluno) p;
							System.out.println("A media é: " + a.media());
						break;
						}
					}
				}
			}else {
				System.out.println("Não existe cadastro: ");
			}
			break;
		case 4:
			if(pessoas.size() > 0) {
				System.out.println("Digite o nome do aluno:");
				nome = tec.nextLine();
				for(Pessoa p : pessoas) {
					if(p.getNome().equalsIgnoreCase(nome)) {
						System.out.println(p.toString());
						break;
					}
				}
			
			}else {
				System.out.println("Não existe cadastro: ");
			}
			
			break;
		case 5:
			if(pessoas.size() > 0) {
				System.out.println("Digite o nome do Professor:");
				nome = tec.nextLine();
				for(Pessoa p : pessoas) {
					if(p.getNome().equalsIgnoreCase(nome)) {
						System.out.println(p.toString());
						break;
					}
				}
			
			}else {
				System.out.println("Não existe cadastro: ");
			}
			
			break;
		case 0:
			flag = false;
			System.out.println("Obrigado pela preferencia!");
			break;
		default:
			System.out.println("Essa opção não é valida!");
			break;
		
		}
		
		
		
		
		}while(flag);
		
		
		
		
		
		
	}

}
