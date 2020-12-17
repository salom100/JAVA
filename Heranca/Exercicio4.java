package br.edu.ifcvideira.Heranca;

import javax.swing.JOptionPane;

public class Exercicio4 {
	public static void main (String []args) {
		Novo N= new Novo();
		Velho V= new Velho();
		
		int op;
		
		for(;;) {
			op=Integer.parseInt(JOptionPane.showInputDialog("Escolha as opçoes de cadastramento de imoveis: \n"
					+ "1- Cadastar imovel Novo \n"
					+ "2- Cadastrar imovel Velho\n"
					+ "3- Sair "));
			if(op==1) {
				N.setEndereço(JOptionPane.showInputDialog("Digite o endereço do imovel"));
				N.setPreco(Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do imovel ")));
				JOptionPane.showMessageDialog(null, "Dados do imovel :\n"
						+ "Endereço: "+N.getEndereço()+"\n"
								+ "por ser um imovel novo o preço teve um adicional de 25% o valor a ser pago é: "+N.adicional());
			}else if(op==2) {
				V.setEndereço(JOptionPane.showInputDialog("Digite o endereço do imovel"));
				V.setPreco(Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do imovel ")));
				JOptionPane.showMessageDialog(null, "Dados do imovel :\n"
						+ "Endereço: "+V.getEndereço()+"\n"
								+ "por ser um imovel novo o preço teve um adicional de 25% o valor a ser pago é: "+V.desconto());
			}else if(op==3) {
				JOptionPane.showMessageDialog(null, "Obrigado pela preferencia");
				break;
			}else {
				JOptionPane.showMessageDialog(null, "Sua escolha não esta cabivelmente concordante com as opçoes oferecidas ao usuario \n"
						+ " Nem com os dados de processamento deste programa que tem como intuito o cadastramento e amostra de preços de imoveis atraves do que o tempo os determina\n Por favor escolha as opções oferecidas para bom uso e proveito do programa e suas funcionalidades !!  " ,"Error",JOptionPane.ERROR_MESSAGE);
			}
		}
	}
}
