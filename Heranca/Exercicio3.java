package br.edu.ifcvideira.Heranca;

import javax.swing.JOptionPane;

public class Exercicio3 {
	public static void main(String[] args) {
		Normal N= new Normal();
		CamaroteInferior CI = new CamaroteInferior();
		CamaroteSuperior CS = new CamaroteSuperior();
		
		int op;
		for(;;) {
			op=Integer.parseInt(JOptionPane.showInputDialog("Bem vindo a Sala São Paulo escolha a sua opção: (Ingresso = 50 R$)\n"
					+ "1- Ingresso Normal   \n"
					+ "2- Ingresso Vip (Aumento de 50%)\n"
					+ "3- Sair \n"));
			if(op==1) {
				N.setValor(50);
				JOptionPane.showMessageDialog(null, "Voce escolheu um ingresso de um local normal\n"
						+ "o valor a ser pago e: "+N.getValor());
			}else if(op==2) {
				
				op=Integer.parseInt(JOptionPane.showInputDialog("Escolha qual o tipo de camarote voce quer :\n"
						+ "1- Superior (Aumento de mais 50%) \n"
						+ "2- Inferior (So o preço do VIP) \n"));
				if(op==1) {
					CS.setValor(50);
					JOptionPane.showMessageDialog(null, "Os dados do seu ingresso: \n"
							+ "local: "+CS.local()+" \n"
									+ "Preço: "+CS.adicional()+"\n");
				}else if(op==2) {
					CI.setValor(50);
					JOptionPane.showMessageDialog(null, "Os dados do seu ingresso: \n"
							+ "local: "+CI.local()+" \n"
									+ "Preço: "+CI.aumento()+"\n");
				}
			}else if (op==3) {
				JOptionPane.showMessageDialog(null, "Obrigado pela preferencia: \n");
				break;
			}else {
				JOptionPane.showMessageDialog(null, "A opção escolhida esta totalmente fora de qualquer padrao estabelecido e oferecido pela tabela acima !!, por favor selecione uma opção cabivel para as opções oferecidas ao usuario. \n", "Error" , JOptionPane.ERROR_MESSAGE);
				
			}
		}
		
	}
}
