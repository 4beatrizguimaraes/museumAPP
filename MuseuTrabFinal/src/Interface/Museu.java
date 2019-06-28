package Interface;

import java.util.ArrayList;

public class Museu {
	private String nome;
	private Localizacao localizacao;
	private Categoria categoria;
	private ArrayList<ObradeArte> obrasdeArte;
	
	
	public Museu(String nome, Localizacao loc, Categoria categoria){
		this.nome = nome;
		this.localizacao = loc;
		this.categoria = categoria;
	}
	
	public void adicionaObra(ObradeArte obradeArte){
		this.obrasdeArte.add(obradeArte);
		this.obrasdeArte.setMuseu(this);
	}
	
	public void adicionaObra(ArrayList<ObradeArte> obrasdeArte){
		for(ObradeArte obradeArte : obrasdeArte){
			this.obrasdeArte.add(obradeArte);
			this.obra.setMuseu(this);
		}
	}
	
	public void excluiObra(ObradeArte obradeArte){
		this.obrasdeArte.remove(obradeArte);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Localizacao getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(Localizacao localizacao) {
		this.localizacao = localizacao;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	
}
