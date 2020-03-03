
public class Livro {
	private String autor;
	private String editora;
	private int isbn;
	private String titulo;
	private int anoDeEdicao;
	
	public Livro(String autor, String editora, int isbn, String titulo, int anoDeEdicao) {
		super();
		this.autor = autor;
		this.editora = editora;
		this.isbn = isbn;
		this.titulo = titulo;
		this.anoDeEdicao = anoDeEdicao;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAnoDeEdicao() {
		return anoDeEdicao;
	}

	public void setAnoDeEdicao(int anoDeEdicao) {
		this.anoDeEdicao = anoDeEdicao;
	}
	
	
	
	

}
