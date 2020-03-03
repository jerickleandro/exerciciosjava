package PooAula1;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Estudante e = null;
		Scanner tec = new Scanner(System.in);
		boolean teste = true;
		do {
		System.out.println("**********MENU*************");
		System.out.println("*   1 - Criar Estudante   *");
		System.out.println("*   2 - Calcular Media    *");
		System.out.println("*   3 - Obter Matricula   *");
		System.out.println("*   4 - Obter Endereço    *");
		System.out.println("*   0 - Sair              *");
		System.out.println("***************************");

		int op = tec.nextInt();
		switch (op) {
		case 1:
			tec.nextLine();
			System.out.println("Digite o Nome do aluno");
			String nome = tec.nextLine();
			System.out.println("Digite a Matricula do aluno");
			String matricula = tec.nextLine();
			System.out.println("Digite o Endereço do aluno");
			String endereco = tec.nextLine();
			double[] notas = new double[4];
			for(int i = 0; i<4; i++) {
				System.out.println("Digite a " + (i+1) + "ª nota");
				notas[i] = tec.nextDouble();
			}
			e = new Estudante(nome, matricula, endereco, notas);
			break;
		case 2:
			if(e!=null) {
			System.out.println(e.calculaMedia());
			}else {
				System.out.println("Estudante ainda não existe");
			}
			
			break;
		case 3:
			if(e!=null) {
				System.out.println(e.getMatricula());
			}else {
					System.out.println("Estudante ainda não existe");
			}
	
			break;
		case 4:
			if(e!=null) {
				System.out.println(e.getEndereco());
			}else {
					System.out.println("Estudante ainda não existe");
			}
	
			break;
		case 0:
			teste = false;
			break;

		default:
			System.out.println("Opção Invalida, tente novamente:");
			break;
		}
		}while(teste);

	}

}
