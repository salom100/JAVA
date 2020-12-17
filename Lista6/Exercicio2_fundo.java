package br.edu.ifcvideira.Lista6;

public class Exercicio2_fundo {
	private int n1;
	public int getn1(){
		return n1;
	}
	public void setn1(int numero) {
		this.n1=numero;
	}
	
	private int n2;
	public int getn2(){
		return n2;
	}
	public void setn2(int numero) {
		this.n2=numero;
	}
	
	public void troca (int numero, int valor) {
		this.setn1(numero);
		this.setn2(valor);
	}
}

