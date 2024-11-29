package View;

import java.util.Scanner;

public class AMenuInicial {

	Scanner scan = new Scanner(System.in);
	private static int opcao;
	
	GerenciarLivrosA aluguelDeLivro = new GerenciarLivrosA();
	GerenciarLivrosB devolucaoDeLivro = new GerenciarLivrosB();
	GerenciarLivrosC cadastrarLivro = new GerenciarLivrosC();
	//GerenciarUsuário cadastrarUsuario = new GerenciarUsuário();
	
	private static String subMenu = """
			  Bem vindo a nossa biblioteca
			  Menu principal
			1) Aluguel de livro
			2) Devolução de livro
			3) Gerenciar livro
			4) Sair
			Escolha uma das opções
			""";

	public void exibirMenuInicial() {

		System.out.println(subMenu);
		opcao = scan.nextInt();
		switch (opcao) {

		case 1:
		aluguelDeLivro.gerenciarLivros1();
			break;

		case 2:
			devolucaoDeLivro.gerenciarLivros2();
			break;

		case 3:
		cadastrarLivro.gerenciarLivros3();;
			break;
	
			default:
			System.out.println("Até a próxima!");
			break;
		

		}

	}
}
