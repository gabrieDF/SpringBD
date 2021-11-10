package br.com.SpringBD.beans;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_Pessoas")
public class Pessoas {

	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="nome", length=50)
	private String nome;
	
	@Column(name="genero", length=20)
	private String genero;
	
	@Column(name="cidade", length=30)
	private String cidade;
	
	@Column(name="idade", length=3)
	private int idade;
	
	
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
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
}