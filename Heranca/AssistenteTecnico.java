package br.edu.ifcvideira.Heranca;

public class AssistenteTecnico extends Funcionario{
	public double calcularSalarioAssistTecnico(){
		return this.getSalario()*1.2;
	}
}
