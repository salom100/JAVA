package br.edu.ifcvideira.Heranca;

import javax.swing.JOptionPane;

public class Exercicio4 {
	public static void main (String []args) {
		Novo N= new Novo();
		Velho V= new Velho();
		
		int op;
		
		for(;;) {
			op=Integer.parseInt(JOptionPane.showInputDialog("Escolha as op�oes de cadastramento de imoveis: \n"
					+ "1- Cadastar imovel Novo \n"
					+ "2- Cadastrar imovel Velho\n"
					+ "3- Sair "));
			if(op==1) {
				N.setEndere�o(JOptionPane.showInputDialog("Digite o endere�o do imovel"));
				N.setPreco(Double.parseDouble(JOptionPane.showInputDialog("Digite o pre�o do imovel ")));
				JOptionPane.showMessageDialog(null, "Dados do imovel :\n"
						+ "Endere�o: "+N.getEndere�o()+"\n"
								+ "por ser um imovel novo o pre�o teve um adicional de 25% o valor a ser pago �: "+N.adicional());
			}else if(op==2) {
				V.setEndere�o(JOptionPane.showInputDialog("Digite o endere�o do imovel"));
				V.setPreco(Double.parseDouble(JOptionPane.showInputDialog("Digite o pre�o do imovel ")));
				JOptionPane.showMessageDialog(null, "Dados do imovel :\n"
						+ "Endere�o: "+V.getEndere�o()+"\n"
								+ "por ser um imovel novo o pre�o teve um adicional de 25% o valor a ser pago �: "+V.desconto());
			}else if(op==3) {
				JOptionPane.showMessageDialog(null, "Obrigado pela preferencia");
				break;
			}else {
				JOptionPane.showMessageDialog(null, "Sua escolha n�o esta cabivelmente concordante com as op�oes oferecidas ao usuario \n"
						+ " Nem com os dados de processamento deste programa que tem como intuito o cadastramento e amostra de pre�os de imoveis atraves do que o tempo os determina\n Por favor escolha as op��es oferecidas para bom uso e proveito do programa e suas funcionalidades !!  " ,"Error",JOptionPane.ERROR_MESSAGE);
			}
		}
	}
}
