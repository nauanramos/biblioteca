package Model;

import java.util.ArrayList;
import java.util.List;

public class Livro extends TipoLivro {
	
	private String nome, autor;
	private boolean alugado;
	
	private static List<Livro> listaLivros = new ArrayList<>();

	public Livro(String nome, String autor, String categoria, String descricao ) {
		super(categoria, descricao );
		this.nome = nome;
		this.autor = autor;
		this.alugado = false;
		
	}

	public static List<Livro> getListaLivros() {
		return listaLivros;
	}

	public static void setListaLivros(List<Livro> listaLivros) {
		Livro.listaLivros = listaLivros;
	}

	public Livro() {
		super();
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	public boolean getAlugado() {
		return alugado;
	}

	public void setAlugado(boolean alugado) {
		this.alugado = alugado;
	}
		
	public void cadastrarLivro(Livro livroNovo) {
		listaLivros.add(livroNovo);
	}

	
	public void excluirLivro(String nome) {
		for (int i = 0; i < listaLivros.size(); i++) {
			Livro livro = listaLivros.get(i);
			if (livro.getNome().equals(nome)) {
				listaLivros.remove(i);
				return; 

				
			}
		}
	}

	
	public Livro consultarPorNome(String nome) {
		for (Livro livro : listaLivros) {
			if (livro.getNome().equalsIgnoreCase(nome)) {
				return livro; // Retorna o livro encontrado
			}
		}
		return null; // Retorna null se não encontrar o livro
	}

	// METODO PARA ALTERAR UM Livro 
	public void editarLivro(String nome, Livro livro) {
		for (int i = 0; i < listaLivros.size(); i++) {
			if (listaLivros.get(i).getNome().equalsIgnoreCase(nome)) {
				listaLivros.set(i, livro);
			}
		}
	}

	// METODO PARA LISTAR TODOS Livros DA LISTA
	public void listarLivros() {
		if (listaLivros.isEmpty()) {
			System.out.println("Não há livros cadastrados.");
		} else {
			for (Livro livro : listaLivros) {
				System.out.println(livro); 
			}
		}
	}
	public void alugarLivro() {
        if (this.alugado) {
            System.out.println("Este livro já está alugado.");
        } else {
            this.alugado = true;
            System.out.println("Livro alugado com sucesso!");
        }
    }

    public void devolverLivro() {
        if (!this.alugado) {
            System.out.println("Este livro não estava alugado.");
        } else {
            this.alugado = false;
            System.out.println("Livro devolvido com sucesso!");
        }
    }

	@Override
	public String toString() {
		return "Livro [nome=" + nome + ", autor=" + autor + ", categoria= " + categoria + ", descricao=" + descricao + ", alugado=" + alugado +"]";
	}

	}
