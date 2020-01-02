package Teste;

public class Livro implements Publicacao {
	
	private String titulo;
	private String autor;
	private int totalPaginas;
	private int pagAtual;
	private boolean aberto;
	private Pessoa leitor;
	
	
	
	
	public Livro(String titulo, String autor, int totalPaginas, Pessoa leitor) {
		this.titulo = titulo;
		this.autor = autor;
		this.aberto = false;
		this.pagAtual = 0;
		this.totalPaginas = totalPaginas;
		this.leitor = leitor;
	}
	
	
	public String detalhes() {
		return "Livro [titulo=" + titulo + ",\n autor=" + autor + ", \n totalPaginas=" + totalPaginas + ", pagAtual="
				+ pagAtual + ",\n aberto=" + aberto + ",\n leitor=" + leitor.getNome() + "]";
	}





	public String getTitulo() {
		return titulo;
	}



	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}



	public String getAutor() {
		return autor;
	}



	public void setAutor(String autor) {
		this.autor = autor;
	}



	public int getTotalPaginas() {
		return totalPaginas;
	}



	public void setTotalPaginas(int totalPaginas) {
		this.totalPaginas = totalPaginas;
	}



	public int getPagAtual() {
		return pagAtual;
	}



	public void setPagAtual(int pagAtual) {
		this.pagAtual = pagAtual;
	}



	public boolean isAberto() {
		return aberto;
	}



	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}



	public Pessoa getLeitor() {
		return leitor;
	}



	public void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}


	public void abrir() {
		this.aberto = true;
		
	}


	public void fechar() {
		this.aberto = false;
		
	}


	public void avancarPag() {
		this.pagAtual++;
		
	}


	public void voltarPag() {
		this.pagAtual--;
		
	}


	public void folhear(int p) {
		if(this.aberto) {
			this.pagAtual = p;
		}
		
	}
}
