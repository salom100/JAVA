package br.edu.ifcvideira.Heranca;

public class CamaroteSuperior extends Vip {
	public String local(){
		return "O Ingresso faz parte do Camarote Superior";
	}
	public double adicional() {
		return aumento()*1.5;
	}
}
