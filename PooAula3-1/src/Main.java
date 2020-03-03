import java.util.ArrayList;
import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		ArrayList<Livro> livros = new ArrayList<Livro>();
		boolean flag = true;
		
		
		do {
			System.out.println("****************MENU*********************");
			System.out.println("*   1 - Cadastrar livro                 *");
			System.out.println("*   2 - Buscar livro por titulo         *");
			System.out.println("*   3 - Buscar livro por autor          *");
			System.out.println("*   4 - Listar todos os livro           *");
			System.out.println("*   0 - Sair                            *");
			System.out.println("*****************************************");
			int op = tec.nextInt();
			tec.nextLine();
			switch (op) {
				case 1:
					System.out.println("Digite o autor: ");
					String autor = tec.nextLine();
					System.out.println("Digite a editora: ");
					String editora = tec.nextLine();
					System.out.println("Digite o ISBN: ");
					int isbn = tec.nextInt();
					tec.nextLine();
					System.out.println("Digite o titulo: ");
					String titulo = tec.nextLine();
					System.out.println("Digite o Ano de edição: ");
					int anoDeEdicao = tec.nextInt();
					tec.nextLine();
					livros.add(new Livro(autor, editora, isbn, titulo, anoDeEdicao));
					System.out.println("Livro cadastrado com sucesso!");
					
					break;
				case 2:
					if(livros.size()>0) {
						System.out.println("Digite o titulo do livro:");
						String titulo2 = tec.nextLine();
						for(Livro l : livros) {
							if(l.getTitulo().equals(titulo2)) {
								System.out.println("Titulo: "+l.getTitulo());
								System.out.println("Autor: " + l.getAutor());
								System.out.println("Editora: " + l.getEditora());
								System.out.println("ISBN: " + l.getIsbn());
							}
						}
						
					}else {
						System.out.println("Ainda não existe livro cadastrado.");
					}
					break;
				case 3:
					if(livros.size()>0) {
						System.out.println("Digite o titulo do livro:");
						String autor2 = tec.nextLine();
						for(Livro l : livros) {
							if(l.getAutor().equals(autor2)) {
								System.out.println("Titulo: "+l.getTitulo());
							}
						}
						
					}else {
						System.out.println("Ainda não existe livro cadastrado.");
					}
					
					break;
				case 4:
					if(livros.size()>0) {
						for(Livro l : livros) {
							System.out.println("Titulo: "+l.getTitulo());
						}
						
					}else {
						System.out.println("Ainda não existe livro cadastrado.");
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
