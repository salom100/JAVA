package br.edu.ifcvideira.Heranca;

public class Velho extends Imovel{
	
	public double desconto() {
		return getPreco()*0.75;
	}
}
