package br.edu.ifcvideira.Lista7;

public class Exercicio1_Bastidores {
	private int idade;
	private String nome;
	
	
	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public void setfazAniversario(){
		this.setIdade(this.getIdade()+1);
	}
	
	
	
	
}
