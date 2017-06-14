
public class GerenciadorDePessoa {
	int numMaxDePessoas = 20;
	Pessoa[] pessoas = new Pessoa[numMaxDePessoas];
	
	public void cadastrar_pessoa(Pessoa pessoa){
		for (int i = 0; i < numMaxDePessoas; i++) {
			if (pessoas[i].pessoas_iguais(pessoa)) {
				return;
			}
		}
		for (int j = 0; j < numMaxDePessoas; j++) {
			if (pessoas[j].getNome().equals(null)) {
				pessoas[j] = pessoa;
				return;
			}
		}
	}
	


}
