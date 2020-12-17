package br.edu.ifcvideira.Lista6;

public class Exercicio1_Contador {
	private int numero;
	public int getNumero(){
		return numero;
	}
	public void setNumero(int num){
		this.numero=num;
	}
	public void Numero(int valor){
		this.setNumero(this.getNumero()+1);
	}
	public void Subtrai(int valor){
		this.setNumero(this.getNumero()-1);
	}
}
