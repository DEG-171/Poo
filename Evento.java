public class Evento {

	//Atributos
	private double preco;
	private int[] data = new int[3]
	private String local;
	private String nome;
	private String autor;
	

	//Construtor
	public Evento(double preco, int[] data, String local, String nome,String autor) {
		super();
		
		this.preco = preco;
		this.local = local;
		this.nome = nome;
		this.autor = autor;
		this.data[0] = data[0];
		this.data[1] = data[1];
		this.data[2] = data[2];
	}
	public boolean eventos_iguais(Evento evento){
		if(
		(this.nome.equals(evento.nome))&&
		(this.local.equals(evento.local))&&
		(this.autor.equals(evento.autor))&&
		(this.preco == evento.preco)&&
		(this.data.equals(evento.data))
		) {
			return true;
		else{
			return false;
			}
		}
	}
	
	//Getters and Setters
	public double getPreco() {
		return preco;
	}

	public void setPreco(double novopreco) {
		this.preco = novopreco;
	}

	public int[] getData() {
		return data;
	}

	public void setData(int[] novadata) {
		this.data = novadata;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String novolocal) {
		this.local = novolocal;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String novonome) {
		this.nome = novonome;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String novoautor) {
		this.autor = novoautor;
	}

}
