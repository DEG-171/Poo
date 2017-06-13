
public class Evento {

	private String nome;
	private String autor;
	private int preço;
	private int[] data = new int[3];
	private String local;

	public Evento(String nome, String autor, int preço, int[] data, String local) {
		super();
		this.nome = nome;
		this.autor = autor;
		this.preço = preço;
		this.data[0] = data[0];
		this.data[1] = data[1];
		this.data[2] = data[2];
		this.local = local;
	}

	public void Excluir() {
		this.nome = null;
		this.autor = null;
		this.preço = 0;
		this.data[0] = 00;
		this.data[1] = 00;
		this.data[2] = 0000;
		this.local = null;
	}

	public boolean equals(Evento evento) {
		if (this.nome.equals(evento.nome)) {
			// System.out.print("1,");
			if (this.autor.equals(evento.autor)) {
				// System.out.print("2,");
				if (this.preço == evento.preço) {
					// System.out.print("3,");
					if (evento.equal(this.data)) {
						// System.out.println("4,");
						if (this.local.equals(evento.local)) {
							return true;
						}
					}
				}
			}
		}
		return false;
	}

	public boolean equal(int[] data) {
		boolean igualdade = true;
		for (int i = 0; i < this.data.length; i++) {
			if (this.data[i] != data[i]) {
				igualdade = false;
			}
		}
		return igualdade;
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

	public int getPreço() {
		return preço;
	}

	public void setPreço(int preço) {
		this.preço = preço;
	}

	public int[] getData() {
		return data;
	}

	public void setData(int[] data) {
		this.data = data;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

}
