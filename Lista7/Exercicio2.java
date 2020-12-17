package br.edu.ifcvideira.Lista7;

import javax.swing.JOptionPane;

public class Exercicio2 {
	public static void main(String[] args) {
		Exercicio2_Porta po= new Exercicio2_Porta();
		
		int op;
		
		op=Integer.parseInt(JOptionPane.showInputDialog("Qual o estado inicial da porta: "
				+ "1- Aberta "
				+ "2- Fechado \n"));
		if(op==1){
			po.setEstado(true);
		}else{
			po.setEstado(false);
		}
		po.setCor(String.valueOf(JOptionPane.showInputDialog("Qual a cor da porta:")));
		po.setDimensaoX(Double.parseDouble(JOptionPane.showInputDialog("Digite a dimensao X")));
		po.setDimensaoY(Double.parseDouble(JOptionPane.showInputDialog("Digite a dimensao Y")));
		po.setDimensaoZ(Double.parseDouble(JOptionPane.showInputDialog("Digite a dimensao Z")));
		
		for(;;){
			op=Integer.parseInt(JOptionPane.showInputDialog("Dados atuais da porta: "
					+ "Estado:"+po.retornaEstado()+"\n"
							+ "Cor:"+po.getCor()+"\n"
									+ "Dimensão X:"+po.getDimensaoX()+"\n"
											+ "Dimensão Y:"+po.getDimensaoY()+"\n"
													+ "Dimensão Z:"+po.getDimensaoZ()+"\n\n"
															+ "Escolha uma opção: \n"
															+ "1 - Alterar Estado: \n"
															+ "2 - Alterar Cor: \n"
															+ "3 - Alterar Dimensão X\n"
															+ "4 - Alterar Dimensão Y\n"
															+ "5 - Alterar Dimensão Z\n"
															+ "6 - Sair"));
			if(op==1){
				po.mudaEstado();
			}else if(op==2){
				po.setCor(String.valueOf(JOptionPane.showInputDialog("Qual a cor da porta:")));
			}else if(op==3){
				po.setDimensaoX(Double.parseDouble(JOptionPane.showInputDialog("Digite a dimensão X")));
			}else if(op==4){
				po.setDimensaoY(Double.parseDouble(JOptionPane.showInputDialog("Digite a dimensão Y")));
			}else if(op==5){
				po.setDimensaoZ(Double.parseDouble(JOptionPane.showInputDialog("Digite a dimensão Z")));
			}else if(op==6){
				JOptionPane.showMessageDialog(null, "Finalizando..");
				break;
			}else{
				JOptionPane.showMessageDialog(null, "Opção invalida");
			}
		}
		
	}
}

//vetor arraylist string builder Metodos
