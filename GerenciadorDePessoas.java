
public class GerenciadorDePessoa {
	Pessoa[] pessoas;

	// Cadastrar nova pessoa
	public void cadastrar_pessoa(int cpf, String nome, int idade) {
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;

	}

	// Deletar cadastro de pessoa
	public void excluir_pessoa(int cpf, String nome, int idade) {
		this.nome = "";
		this.cpf = 0;
		this.idade = 0;
	}
}
