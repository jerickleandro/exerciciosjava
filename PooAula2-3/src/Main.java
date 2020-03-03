import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
		Scanner tec = new Scanner(System.in);
		boolean flag = true;
		
		
		do {
		System.out.println("****************MENU*********************");
		System.out.println("*   1 - Cadastrar uma pessoa            *");
		System.out.println("*   2 - Pessoas abaixo do peso          *");
		System.out.println("*   3 - Pessoa no peso ideal            *");
		System.out.println("*   4 - Pessoas acima do peso           *");
		System.out.println("*   0 - Sair                            *");
		System.out.println("*****************************************");
		int op = tec.nextInt();
		
		switch(op) {
		
		case 1:
			tec.nextLine();
			System.out.println("Digite o nome:");
			String nome = tec.nextLine();
			System.out.println("Digite a altura:");
			double altura = tec.nextDouble();
			System.out.println("Digite o peso:");
			double peso = tec.nextDouble();
			pessoas.add(new Pessoa(nome, altura, peso));
			System.out.println("Pessoa cadastrada com sucesso!");
			break;
		case 2: 
			if(pessoas.size()>0) {
				System.out.println("Nome:                        Imc: ");
				for(Pessoa p : pessoas) {
					if(p.imc()<18.5) {
						System.out.println(p.getNome() + "                        "+p.imc());
					}
				}
			}else {
				System.out.println("Não existe ninguem cadastrado ainda.");
			}
			break;
		case 3:
			if(pessoas.size()>0) {
				System.out.println("Nome:                        Imc: ");
				for(Pessoa p : pessoas) {
					if(p.imc()>=18.5 && p.imc()<25) {
						System.out.println(p.getNome() + "                        "+p.imc());
					}
				}
			}else {
				System.out.println("Não existe ninguem cadastrado ainda.");
			}
			break;
		case 4:
			if(pessoas.size()>0) {
				System.out.println("Nome:                        Imc: ");
				for(Pessoa p : pessoas) {
					if(p.imc()>=25) {
						System.out.println(p.getNome() + "                        "+p.imc());
					}
				}
			}else {
				System.out.println("Não existe ninguem cadastrado ainda.");
			}
			break;
		case 0:
			System.out.println("Obrigado pela preferencia!");
			flag = false;
			break;
		default:
			break;
		}
		
		
		}while(flag); 
			

	}

}
