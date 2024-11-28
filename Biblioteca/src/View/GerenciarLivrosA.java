package View;

import java.util.Scanner;

import Model.Livro;

public class GerenciarLivrosA {

	Scanner scan = new Scanner(System.in);
	int opcao;
	private static AMenuInicial menuInicial = new AMenuInicial();
	Livro livro = new Livro();

	String subMenu = """
			Biblioteca
			1) Consultar livro por nome
			2) Voltar para o menu superior
			Escolha uma das opções
			""";

	public void gerenciarLivros1() {

		System.out.println(subMenu);
		opcao = scan.nextInt();
		switch (opcao) {
			case 1:
			System.out.println("Digite nome do Livro");
			String consultarLivro = scan.next();
			Livro livroConsultado = livro.consultarPorNome(consultarLivro);
			if (livroConsultado == null) {
				System.out.println("Livro não localizado, tente novamente");
			} else {
				System.out.println("Livro localizado!");
				livroConsultado.alugarLivro();  // Aluga o livro
			}
			gerenciarLivros1();
			break;

		case 2:
		menuInicial.exibirMenuInicial();
			break;

		default:
			System.out.println("Opção inválida!");
			gerenciarLivros1();

		}

	}

}
