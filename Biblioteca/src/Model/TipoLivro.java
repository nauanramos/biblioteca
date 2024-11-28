package Model;

public class TipoLivro {

	protected String categoria;
	protected String descricao;

	public TipoLivro(String categoria, String descricao) {
		super();
		this.categoria = categoria;
		this.descricao = descricao;

	}

	public TipoLivro() {
		
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}



}
