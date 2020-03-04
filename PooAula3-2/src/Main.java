	import java.util.ArrayList;
	import java.util.Scanner;


	public class Main {

		public static void main(String[] args) {
			Scanner tec = new Scanner(System.in);
			ArrayList<Produto> produtos = new ArrayList<Produto>();
			boolean flag = true;
			
			
			do {
				System.out.println("****************MENU*********************");
				System.out.println("*   1 - Cadastrar produto               *");
				System.out.println("*   2 - Buscar produto                  *");
				System.out.println("*   3 - Listar todos os produtos        *");
				System.out.println("*   4 - Efetura venda do produto        *");
				System.out.println("*   0 - Sair                            *");
				System.out.println("*****************************************");
				int op = tec.nextInt();
				tec.nextLine();
				switch (op) {
					case 1:
						System.out.println("Digite o nome: ");
						String nome = tec.nextLine();
						System.out.println("Digite o codigo: ");
						long codigo = tec.nextLong();
						System.out.println("Digite o preço: ");
						double preco = tec.nextDouble();
						System.out.println("Digite a quantidade: ");
						int quantidade = tec.nextInt();
						produtos.add(new Produto(nome, codigo, preco, quantidade));
						System.out.println("Produto cadastrado com sucesso!");
						
						break;
					case 2:
						if(produtos.size()>0) {
							System.out.println("Digite o nome do produto:");
							String nome2 = tec.nextLine();
							for(Produto p : produtos) {
								if(p.getNome().equals(nome2)) {
									System.out.println("Nome: "+p.getNome());
									System.out.println("Codigo: " + p.getCodigo());
									System.out.println("Preço: " + p.getPreco());
									System.out.println("Quantidade: " + p.getQuantidade());
								}
							}
							
						}else {
							System.out.println("Ainda não existe produto cadastrado.");
						}
						break;
					case 3:
						if(produtos.size()>0) {
							for(Produto p : produtos) {
								System.out.println("Nome: "+p.getNome());
							}
							
						}else {
							System.out.println("Ainda não existe livro cadastrado.");
						}
						
						break;
					case 4:
						if(produtos.size()>0) {
							System.out.println("Digite o nome do produto:");
							String nome3 = tec.nextLine();
							for(int i = 0; i<produtos.size(); i++) {
								if(produtos.get(i).getNome().equals(nome3)) {
									produtos.remove(i);
									System.out.println("Produto vendido!");
								}
							}
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

