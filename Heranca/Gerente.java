package br.edu.ifcvideira.Heranca;

public class Gerente extends Funcionario {

	public double calcularSalarioGerente(){
		return this.getSalario()*1.5;
	}
}
