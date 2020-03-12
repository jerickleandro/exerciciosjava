import java.util.ArrayList;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		boolean flag = true;
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		String nome, cpf;
		double valor = 0;
		
		
		do {
		System.out.println("****************MENU*********************");
		System.out.println("*   1 - Cadastrar Cliente               *");
		System.out.println("*   2 - Saque de conta corrente         *");
		System.out.println("*   3 - Saque de conta polpança         *");
		System.out.println("*   4 - Deposito da conta corrente      *");
		System.out.println("*   5 - Deposito da conta poupança      *");
		System.out.println("*   0 - Sair                            *");
		System.out.println("*****************************************");
		int op = tec.nextInt();
		tec.nextLine();
		switch(op) {
		case 1:
			System.out.println("Digite o nome do clinte:");
			nome = tec.nextLine();
			System.out.println("Digite o CPF do cliente: (xxx.xxx.xxx-xx)");
			cpf = tec.nextLine();
			System.out.println("Digite o numero da conta:");
			int numConta = tec.nextInt();
		    System.out.println("Digite o valor da taxa:");
		    double taxa = tec.nextDouble();
		    tec.nextLine();
		    System.out.println("Digite o banco:");
		    String banco = tec.nextLine();
		    ContaCorrente cc = new ContaCorrente(numConta, taxa, 0, banco);
		    ContaPoupanca cp = new ContaPoupanca(numConta, taxa, 0, banco);
		    Cliente c = new Cliente(nome, cpf, cc, cp);
			clientes.add(c);
			System.out.println("Cliente cadastrado com sucesso!");
			break;
		case 2:
			if(clientes.size()>0) {
				System.out.println("Digite o CPF:");
				cpf = tec.nextLine();
				for(Cliente cl : clientes) {
					if(cl.getCpf().equalsIgnoreCase(cpf)) {
						System.out.println("Digite o valor a ser sacado: ");
						valor = tec.nextDouble();
						if(cl.getContaCorrente().sacar(valor)) {
							System.out.println("Saque realizado com sucesso!");
							System.out.println("Saldo atual da sua conta corrente: "+ cl.getContaCorrente().getSaldo()+ "R$");
						}
					}
				}
				
			}else {
				System.out.println("Não existe cliente cadastrado!");
			}
			
			
			break;
		case 3:
			if(clientes.size()>0) {
				System.out.println("Digite o CPF:");
				cpf = tec.nextLine();
				for(Cliente cl : clientes) {
					if(cl.getCpf().equalsIgnoreCase(cpf)) {
						System.out.println("Digite o valor a ser sacado: ");
						valor = tec.nextDouble();
						if(cl.getContaPoupanca().sacar(valor)) {
							System.out.println("Saque realizado com sucesso!");
							System.out.println("Saldo atual da sua conta poupança: "+ cl.getContaPoupanca().getSaldo()+ "R$");
						}else {
							System.out.println("Valor excede seu limite");
							System.out.println("Saldo atual da sua conta poupança: "+ cl.getContaPoupanca().getSaldo()+ "R$");
						}
					}
				}
				
			}else {
				System.out.println("Não existe cliente cadastrado!");
			}
			
			
			break;
		case 4:
			if(clientes.size()>0) {
				System.out.println("Digite o CPF:");
				cpf = tec.nextLine();
				for(Cliente cl : clientes) {
					if(cl.getCpf().equalsIgnoreCase(cpf)) {
						System.out.println("Digite o valor a ser depositado: ");
						valor = tec.nextDouble();
						cl.getContaCorrente().setSaldo(cl.getContaCorrente().getSaldo()+valor);
						System.out.println("Deposito realizado com sucesso!");
						System.out.println("Saldo atual da sua conta Corrente: "+ cl.getContaCorrente().getSaldo()+ "R$");
						
					}
				}
				
			}else {
				System.out.println("Não existe cliente cadastrado!");
			}
			
			
			break;
		case 5:
			if(clientes.size()>0) {
				System.out.println("Digite o CPF:");
				cpf = tec.nextLine();
				for(Cliente cl : clientes) {
					if(cl.getCpf().equalsIgnoreCase(cpf)) {
						System.out.println("Digite o valor a ser depositado: ");
						valor = tec.nextDouble();
						cl.getContaPoupanca().setSaldo(cl.getContaPoupanca().getSaldo()+valor);
						System.out.println("Deposito realizado com sucesso!");
						System.out.println("Saldo atual da sua conta Polpança: "+ cl.getContaPoupanca().getSaldo()+ "R$");
						
					}
				}
				
			}else {
				System.out.println("Não existe cliente cadastrado!");
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
