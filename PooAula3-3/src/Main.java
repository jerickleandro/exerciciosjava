import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		ArrayList<Conta> contas = new ArrayList<Conta>();
		boolean flag = true;
		
		do {
		System.out.println("****************MENU*********************");
		System.out.println("*   1 - Cadastrar conta                 *");
		System.out.println("*   2 - Realizar deposito               *");
		System.out.println("*   3 - Realizar saque                  *");
		System.out.println("*   4 - Verificar Saldo                 *");
		System.out.println("*   5 - Consultar Cliente               *");
		System.out.println("*   0 - Sair                            *");
		System.out.println("*****************************************");
		int op = tec.nextInt();
		tec.nextLine();
		switch(op) {
		case 1:
			System.out.println("Digite o nome do cliente: ");
			String nomeC = tec.nextLine();
			System.out.println("Digite o CPF do cliente: (xxx.xxx.xxx-xx)");
			String cpfC = tec.nextLine();
			System.out.println("Sexo: M|F");
			char sexoC = tec.next().charAt(0);
			System.out.println("Digite o numero da conta: ");
			long numConta = tec.nextLong();
			System.out.println("Digite a agencia da conta: ");
			int agConta = tec.nextInt();
			contas.add(new Conta(numConta, agConta, new Cliente(nomeC, cpfC, sexoC), 0));
			System.out.println("Conta criada com sucesso!");
			break;
		case 2:
			boolean flag2 = true;
			System.out.println("Digite o nome do cliente: ");
			String nomeCl = tec.nextLine();
			for(Conta c : contas) {
				if(c.getCliente().getNome().equals(nomeCl)) {
					flag2 = false;
					System.out.println("Digite o valor a depositar: ");
					double valorD = tec.nextDouble();
					c.deposito(valorD);
					System.out.println("Valor depositado com sucesso!");
					break;
				}
			}
			if(flag2) {
				System.out.println("Cliente não encontrado!");
			}
			break;
		case 3:
			boolean flag3 = true;
			System.out.println("Digite o nome do cliente: ");
			String nomeCli = tec.nextLine();
			for(Conta c : contas) {
				if(c.getCliente().getNome().equals(nomeCli)) {
					flag3 = false;
					System.out.println("Digite o valor a sacar: ");
					double valorS = tec.nextDouble();
					if(c.sacar(valorS)) {
						System.out.println("Saque realizado, seu saldo agora é de: R$" + c.getSaldo());
					}else {
						System.out.println("Saldo insuficiente, seu saldo é de: R$" + c.getSaldo());
					}
					break;
				}
			}
			if(flag3) {
				System.out.println("Cliente não encontrado!");
			}
			break;
		case 4:
			boolean flag4 = true;
			System.out.println("Digite o nome do cliente: ");
			String nomeClie = tec.nextLine();
			for(Conta c : contas) {
				if(c.getCliente().getNome().equals(nomeClie)) {
					flag4 = false;
					System.out.println("Seu saldo é de: R$"+c.getSaldo());
					break;
				}
			}
			if(flag4) {
				System.out.println("Cliente não encontrado!");
			}
			break;
		case 5:
			boolean flag5 = true;
			System.out.println("Digite o nome do cliente: ");
			String nomeClien = tec.nextLine();
			for(Conta c : contas) {
				if(c.getCliente().getNome().equals(nomeClien)) {
					flag5 = false;
					System.out.println("Nome:"+c.getCliente().getNome());
					System.out.println("CPF:"+c.getCliente().getCpf());
					if(c.getCliente().getSexo() == 'M') {
						System.out.println("Sexo: Masculino");
					}else {
						System.out.println("Sexo: Feminino");
					}
					break;
				}
			}
			if(flag5) {
				System.out.println("Cliente não encontrado!");
			}
			break;
		case 0:
			flag = false;
			break;
		default:
			System.out.println("Essa opção não é valida!");
			break;
		
		}
		
		
		
		
		}while(flag);
		

	}

}
