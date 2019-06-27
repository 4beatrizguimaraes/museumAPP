package Interface;

public class ObradeArte {
	private String nome;
	private String localizacao;
	private Categoria categoria;
	private Autor autor;
	private Museu museu;
	private int codigo;
	private int numcode = 1;
	
	public ObradeArte(String nome, String loc, Categoria categoria, Autor autor){
		this.nome = nome;
		this.localizacao = loc;
		this.categoria = categoria;
		this.codigo = numcode;
		numcode++;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public Museu getMuseu() {
		return museu;
	}

	public void setMuseu(Museu museu) {
		this.museu = museu;
	}
	
	
}
