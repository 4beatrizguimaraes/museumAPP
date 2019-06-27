package Interface;

import java.util.ArrayList;

public class Museu {
	private String nome;
	private Localizacao localizacao;
	private Categoria categoria;
	private ArrayList<ObradeArte> obras;
	
	
	public Museu(String nome, Localizacao loc, Categoria categoria){
		this.nome = nome;
		this.localizacao = loc;
		this.categoria = categoria;
	}
	
	public void adicionaObra(ObradeArte obra){
		obras.add(obra);
		obra.setMuseu(this);
	}
	
	public void adicionaObra(ArrayList<ObradeArte> obrasdeArte){
		for(ObradeArte obra : obrasdeArte){
			obras.add(obra);
			obra.setMuseu(this);
		}
	}
	
	public void excluiObra(ObradeArte obra){
		obras.remove(obra);
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
