package br.edu.ifcvideira.Lista6;

public class Exercicio3_makingoff {
	private double Salario;
	private double gasto;
	
	public double getSalario() {
		return Salario;
	}
	public void setSalario(double sal) {
		this.Salario=sal;
	}
	public void valor(double salario) {
		this.Salario=((Salario/7)/100);
	}
	public void pagar(double Salario, double watt) {
		this.Salario=(Salario*watt);
	}
	public double getgasto() {
		return gasto;
	}
	public void setgasto(double watt) {
		this.gasto=watt;
	}
	public void desconto(double getSalario) {
		this.gasto=(getSalario-(getSalario*0.1));
	}
}

