package View;

import java.util.Scanner;

import Model.Livro;

public class GerenciarLivrosB {

	Scanner scan = new Scanner(System.in);
	int opcao;
	private static AMenuInicial menuInicial = new AMenuInicial();
	Livro livro = new Livro();

	String subMenu = """
			Biblioteca
			1) Devolver livro por nome
			2) Voltar para o menu superior
			Escolha uma das opções
			""";

	public void gerenciarLivros2() {

		System.out.println(subMenu);
		opcao = scan.nextInt();
		switch (opcao) {
			case 1:
			System.out.println("Digite nome do Livro");
			String consultarLivro = scan.next();
			Livro livroConsultado = livro.consultarPorNome(consultarLivro);
			if (livroConsultado == null) {
				System.out.println("Livro não encontrado.");
			} else {
				livroConsultado.devolverLivro();  // Devolve o livro
			}
			gerenciarLivros2();
			break;

		case 2:
		menuInicial.exibirMenuInicial();
			break;

		default:
			System.out.println("Opção inválida!");
			gerenciarLivros2();

		}

	}

}
