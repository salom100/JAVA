package br.edu.ifcvideira.Lista7;

import javax.swing.JOptionPane;

public class Exercicio1_Menu {
	public static void main(String[] args) {
		Exercicio1_Bastidores p1 = new Exercicio1_Bastidores();
		Exercicio1_Bastidores p2 = new Exercicio1_Bastidores();
		Exercicio1_Bastidores p3 = new Exercicio1_Bastidores();
		int op;
		
		p1.setNome(String.valueOf(JOptionPane.showInputDialog("Digite o nome da pessoa 1")));
		p1.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade de "+p1.getNome())));
		
		p2.setNome(String.valueOf(JOptionPane.showInputDialog("Digite o nome da pessoa 2")));
		p2.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade de "+p2.getNome())));
		
		p3.setNome(String.valueOf(JOptionPane.showInputDialog("Digite o nome da pessoa 3")));
		p3.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade de "+p3.getNome())));
		
		for(;;){
			op=Integer.parseInt(JOptionPane.showInputDialog("Dados atuais das pessoas: \n"
					+ p1.getNome()+" : "+p1.getIdade()+" Anos \n"
							+ p2.getNome()+" : "+p2.getIdade()+" Anos \n"
									+ p3.getNome()+" : "+p3.getIdade()+" Anos \n\n"
											+ "Quem Fez aniversario ?\n"
											+ "1- "+p1.getNome()+" \n"
													+ "2- "+p2.getNome()+" \n"
															+ "3- "+p3.getNome()+" \n"
																	+ "4- Finalizar"));
			if(op==1){
				p1.setfazAniversario();
			}else if(op==2){
				p2.setfazAniversario();
			}else if(op==3){
				p3.setfazAniversario();
			}else if(op==4){
				JOptionPane.showMessageDialog(null, "Idades após finalizar o programa: \n"
						+ p1.getNome()+" : "+p1.getIdade()+" Anos\n"
								+ p2.getNome()+" : "+p2.getIdade()+" Anos\n"
										+ p3.getNome()+" : "+p3.getIdade()+" anos");
				break;
			}else{
				JOptionPane.showMessageDialog(null, "Opção invalida!");
			}
		}	
	}	
}
