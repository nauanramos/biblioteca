package View;

import java.util.Scanner;

import Model.Livro;

public class GerenciarLivrosC {

	Scanner scan = new Scanner(System.in);
	int opcao;
	
	private static AMenuInicial menuInicial = new AMenuInicial();

	Livro livro = new Livro();

	String subMenu = """
			Gerenciar livro
			1) Cadastrar livro
			2) Excluir livro
			3) Editar livro
			4) Listar livros
			5) Voltar
			Escolha uma das opções
			""";

	public void gerenciarLivros3() {

		System.out.println(subMenu);
		opcao = scan.nextInt();
		switch (opcao) {
		case 1:

		Livro livroNovo = new Livro();

			System.out.print("Digite a categoria do livro: ");
			scan.nextLine();
			livroNovo.setCategoria(scan.nextLine());

			System.out.print("Digite a descrição do livro: ");
			livroNovo.setDescricao(scan.nextLine());

			System.out.print("Digite a nome do livro: ");
			livroNovo.setNome(scan.nextLine());

			System.out.print("Digite o autor do livro: ");
			livroNovo.setAutor(scan.nextLine());

			
			livro.cadastrarLivro(livroNovo);
			System.out.println("Livro cadastrado com sucesso !!!");

			menuInicial.exibirMenuInicial();

			break;

		case 2:

			System.out.println("Digite a nome do livro que deseja excluir: ");
			String nomeExcluir = scan.next();
			if (livro.consultarPorNome(nomeExcluir) == null) {
				System.out.println("Livro não localizado!");
			} else {

				livro.excluirLivro(nomeExcluir);
				System.out.println("Livro excluído com sucesso!");
				livro.listarLivros();
			}

			menuInicial.exibirMenuInicial();

			break;

		case 3:
			System.out.println("Informe a nome do livro a ser editado:");
			String editarLivro = scan.next();
			Livro livroEncontrado = livro.consultarPorNome(editarLivro);
			if (livroEncontrado != null) {
				System.out.println("Informe a categoria:");
				livroEncontrado.setCategoria(scan.next()); 
		
				System.out.println("Digite a nova descrição:");
				livroEncontrado.setDescricao(scan.next());
		
				System.out.println("Digite o novo nome do livro:");
				livroEncontrado.setNome(scan.next()); 
		
				System.out.println("Digite o novo autor do livro:");
				livroEncontrado.setAutor(scan.next()); 
		
				// Atualiza o livro na lista chamando o método editarLivro
				livro.editarLivro(editarLivro, livroEncontrado); // Passa o livro atualizado
		
				System.out.println("Livro alterado com sucesso!");
			} else {
				System.out.println("Livro não encontrado!");
			}
			menuInicial.exibirMenuInicial();
			break;

		case 4:
			System.out.println("Todos os livros");
			livro.listarLivros();
			menuInicial.exibirMenuInicial();
			break;

		case 5:
			menuInicial.exibirMenuInicial();
			break;

		default:
			System.out.println("Opção inválida!");

		}
		
	}

}
