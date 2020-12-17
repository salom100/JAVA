package br.edu.ifcvideira.Lista7;

public class Exercicio4_Computadores {
	private double placa;
	private double processadores;
	private double memoria;
	private double disco;
	private double monitor;
	private double total;
	
	public double getplaca() {
		return placa;
	}
	public void setplaca() {
		this.placa=900;
	}
	public double getprocessadores() {
		return processadores;
	}
	public void setprocessadores(double valor) {
		this.processadores=valor;
	}
	public double getmemoria() {
		return memoria;
	}
	public void setmemoria(double valor) {
		this.memoria=valor;
	}
	public double getdisco() {
		return disco;
	}
	public void setdisco(double valor) {
		this.disco=valor;
	}
	public double getmonitor() {
		return monitor;
	}
	public void setmonitor(double valor) {
		this.monitor=valor;
	}
	
	public double gettotal() {
		return total;
	}
	public void settotal(double valor) {
		this.total=valor;
	}
	public void somatotal() {
		this.settotal(this.getplaca()+this.getmemoria()+this.getprocessadores()+this.getdisco()+this.getmonitor());
	}
	
}
