package br.com.fiap.cardapp.bean;

public class ItemCardapio {
	
	private int id;
	private String nome;
	private String descricao;
	private float valorCalorico;
	private float valor;
	private String foto;
	
	public ItemCardapio() {
		super();
	}

	public ItemCardapio(int id, String nome, String descricao, float valorCalorico, float valor, String foto) {
		super();
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.valorCalorico = valorCalorico;
		this.valor = valor;
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
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public float getValorCalorico() {
		return valorCalorico;
	}
	public void setValorCalorico(float valorCalorico) {
		this.valorCalorico = valorCalorico;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	
	
	
	

}
