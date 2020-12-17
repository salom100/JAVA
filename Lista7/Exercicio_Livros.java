package br.edu.ifcvideira.Lista7;

public class Exercicio_Livros {
	private String titulo;
	private String autor;
	private int ano;
	
	public Exercicio_Livros(String titulo, String autor, int ano) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.ano = ano;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
}
