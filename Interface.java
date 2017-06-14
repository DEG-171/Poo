
public class Interface {
	public void mainMenu() {
		int opcao_menu = 0;
		while (opcao_menu != 3) {
			opcao_menu = visao.requisitaInteiro(
					"Menu Principal:\n"+
					"O que gostaria de fazer agora?\n" +
					"1-Criar Evento\n"+
					"2-Editar Evento\n" +
					"3-Excluir Evento\n" +
					"4-Consultar Evento\n" +
					"5-Voltar ao menu anterior\n");
			switch (opcao_menu) {
			case 1:
				menu_evento();
				break;
			case 2:
				menu_pessoas();
				break;
			case 3:
				visao.messageOut();
				break;
			}
		}
	}

	public void menu_evento()

	{
		int opcao_evento = 0;
		while (opcao_evento != 5) {
			visao.requisitaInteiro(
					"O que gostaria de fazer agora?Escolha uma das opcoes abaixo:\n" +
					"1-Criar Evento\n"+
					"2-Editar Evento\n" +
					"3-Excluir Evento\n" +
					"4-Consultar Evento\n" +
					"5-Voltar ao menu anterior\n");

			switch (opcao_evento) {
			case 1:
				criar_evento();
				break;
			case 2:
				editar_evento();
				break;
			case 3:
				excluir_evento();
				break;
			case 4:
				consultar_evento();
				break;
			case 5:
				mainMenu();
				break;
			}
		}

	}

	public void menu_pessoas() {
		int opcao_pessoas = 0;

		while (opcao_pessoas != 5) {
			visao.requisitaInteiro(
				"O que gostaria de fazer agora?Escolha uma das opcoes abaixo:\n" +
				"1-Cadastrar pessoa\n"+
				"2-Alterar dados cadastrais\n" +
				"3-Excluir Cadastro\n" +
				"4-Detalhes de pessoa cadastrada\n" +
				"5-Voltar ao menu anterior\n");
			
			opcao_pessoas = visao.requisitaInteiro("Opcoes do Gerenciador de Pessoas:");
			switch(opcao_pessoas) {
			case 1:
				cadastrar_pessoa();
				break;
			case 2:
				alterar_dados_pessoa();
				break;
			case 3:
				excluir_pessoa();
				break;
			case 4:
				detalhes_pessoa();
				break;
			case 5:
				mainMenu();
				break;
			}
		}
	}

	public void alterar_dados_pessoa() {
		int alterar_dados_pessoa = 0;

		while (alterar_dados_pessoa != 4) {
			visao.requisitaInteiro(
				"O que gostaria de fazer agora?Escolha uma das opcoes abaixo:\n" +
				"1-Cadastrar pessoa\n"+
				"2-Alterar dados cadastrais\n" +
				"3-Excluir Cadastro\n" +
				"4-Detalhes de pessoa cadastrada\n" +
				"5-Voltar ao menu anterior\n");
			
			alterar_dados_pessoa = visao.requisitaInteiro("Gostaria de Alterar:");
			switch(alterar_dados_pessoa) {
			case 1:
				alterar_nome();
				break;
			case 2:
				alterar_cpf();
				break;
			case 3:
				alterar_idade();
				break;
			case 4:
				mainMenu();
				break;
			}
		}
	}
	public void editar_evento() {
		int editar_evento = 0;

		while (editar_evento != 6) {
			visao.requisitaInteiro(
				"O que gostaria de fazer agora?Escolha uma das opcoes abaixo:\n" +
				"1-Alterar nome do evento\n"+
				"2-Alterar data do evento\n" +
				"3-Alterar local do evento\n"+
				"4-Alterar preco do evento\n" +
				"5-Alterar autor do evento\n" +
				"6-Voltar ao menu anterior\n");
			switch (opcao_evento) {
			case 1:
				criar_evento();
				break;
			case 2:
				editar_evento();
				break;
			case 3:
				excluir_evento();
				break;
			case 4:
				consultar_evento();
				break;
			case 5:
				mainMenu();
				break;
			}
			}
		}
}
