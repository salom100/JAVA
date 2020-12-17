package br.edu.ifcvideira.Lista6;

import javax.swing.JOptionPane;

public class PrincipalQuilowatt {
	public static void main(String[] args) {
		Quilowatt kw= new Quilowatt();
		
		double salarioMinimo;
		double quantkw;
		salarioMinimo=Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do salario minimo:"));
		quantkw=Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de quilowatts gasta:"));
		
		kw.setQuantidadeKw(quantkw);
		kw.setSalarioMin(salarioMinimo);
		
		JOptionPane.showMessageDialog(null, "A residencia tera que pagar: "+kw.valorTotal()+"\n"
				+ "Valor vom  10 % de desconto: "+kw.desconto());
		
	}
}
