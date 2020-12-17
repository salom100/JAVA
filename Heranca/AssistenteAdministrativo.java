package br.edu.ifcvideira.Heranca;

public class AssistenteAdministrativo extends Funcionario {
	private String numMatricula;
	private int turno;
	public String getNumMatricula() {
		return numMatricula;
	}
	public void setNumMatricula(String numMatricula) {
		this.numMatricula = numMatricula;
	}
	public int getTurno() {
		return turno;
	}
	public void setTurno(int turno) {
		this.turno = turno;
	}
	
	
	public double calculaSalarioAssistAdm(){
			return this.getSalario()*1.3;
	}
}
