package br.edu.ifcvideira.Lista6;

public class Quilowatt {
	private double SalarioMin;
	private double quantidadeKw;
		
	public double getSalarioMin(){
		return SalarioMin;
	}
	public double getQuantidadeKw() {
		return quantidadeKw;
	}
	public void setQuantidadeKw(double quantidadeKw) {
		this.quantidadeKw = quantidadeKw;
	}
	public void setSalarioMin(double salarioMin) {
		SalarioMin = salarioMin;
	}
	public double valorkw(){
		return(double)this.getSalarioMin()/7/100;
	}
	public double valorTotal(){
		return valorkw()*this.getQuantidadeKw();
	}
	public double desconto(){
		return valorTotal()*0.9;
	}
		
		
}
