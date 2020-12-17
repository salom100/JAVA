package br.edu.ifcvideira.Lista6;

import javax.swing.JOptionPane;

public class Exercicio3 {
	public static void main(String[] args) {
		Exercicio3_makingoff m = new Exercicio3_makingoff();
		double sal=0;
		double watt=0;
		double salario=0;
		sal=Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do salario minimo"));
		m.setSalario(sal);
		salario=sal;
		watt=Double.parseDouble(JOptionPane.showInputDialog("Digite quanto watts gastaram no mes"));
		m.setgasto(watt);
		
		m.valor(salario);
		m.pagar(m.getSalario(), watt);
		
		m.desconto(m.getSalario());
		JOptionPane.showMessageDialog(null, "O valor a ser pago é: "+m.getSalario()+" \n"
				+ "O valor a ser pago com o desconto e :"+m.getgasto());
	}

}
