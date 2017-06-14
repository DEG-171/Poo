
public class GerenciadorDePessoa {
	int numMaxDePessoas = 20;
	Pessoa[] pessoas = new Pessoa[numMaxDePessoas];
	
	public void cadastrar_pessoa(Pessoa pessoas){
		for (int i = 0; i < numMaxDePessoas; i++) {
			if (pessoas[i].eventos_iguais(pessoas)) {
				return;
			}
		}
		for (int j = 0; j < numMaxDePessoas; j++) {
			if (pessoas[j].getNome() == null) {
				pessoas[j] = pessoas;
				return;
			}
		}
	}


}
