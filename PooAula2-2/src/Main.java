import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<Estudante> estundante = new ArrayList<Estudante>();
		Scanner tec = new Scanner(System.in);
		boolean flag = true;
		String matricula;
		String nome;
		
		do {
			System.out.println("****************MENU*********************");
			System.out.println("*   1 - Cadastrar um estudante          *");
			System.out.println("*   2 - Obter nome do aluno             *");
			System.out.println("*   3 - Calcular média                  *");
			System.out.println("*   0 - Sair                            *");
			System.out.println("*****************************************");
			int op = tec.nextInt();
			
			switch (op) {
			case 1:
				tec.nextLine();
				System.out.println("Digite a mátricula:");
				matricula = tec.nextLine();
				System.out.println("Digite o nome do aluno:");
				nome = tec.nextLine();
				double[] nota = new double[2];
				System.out.println("Digite o valor da primeira nota:");
				nota[0] = tec.nextDouble();
				System.out.println("Digite o valor da segunda nota:");
				nota[1] = tec.nextDouble();
				Estudante e = new Estudante(matricula, nome, nota);
				estundante.add(e);
				System.out.println("Aluno cadastrado com sucesso!");
							
				break;
			case 2:
				tec.nextLine();
				if(estundante.size() > 0 ) {
					System.out.println("Digite a matricula do estudante:");
					String matricula2 = tec.nextLine();
					for(int i = 0; i< estundante.size();i++) {
						if(estundante.get(i).getMatricula().equals(matricula2)) {
							System.out.println("O nome do estudante: "+estundante.get(i).getNome());
						}
					}
					
					
				}else {
					System.out.println("Ainda não existe um estudante cadastrado.");
				}
				break;
			case 3:
				tec.nextLine();
				
				if(estundante.size() > 0 ) {
					System.out.println("Digite a matricula do estudante:");
					matricula = tec.nextLine();
					for(int i = 0; i< estundante.size();i++) {
						if(estundante.get(i).getMatricula().equals(matricula)) {
							System.out.println("A média do estudante é : "+estundante.get(i).media());
						}
					}
				
					
				}else {
					System.out.println("Ainda não existe um estudante cadastrado.");
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
