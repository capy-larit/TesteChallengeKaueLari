package br.com.fiap.cardapp.bean;

public class Integrante {
	
	private int id;
	private String nome;
	private String rm;
	private String foto;
	
	public Integrante() {
		super();
	}
	
	public Integrante(int id, String nome, String rm, String foto) {
		super();
		this.id = id;
		this.nome = nome;
		this.rm = rm;
		this.foto = foto;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRm() {
		return rm;
	}
	public void setRm(String rm) {
		this.rm = rm;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	
	

}
