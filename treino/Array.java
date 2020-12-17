package br.edu.ifcvideira.treino;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Array {
	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);
		ArrayList<String>alunos=new ArrayList<String>();
		String nome;
		int op;
		int busca;
		int i=0;
		for(;;) {
			op=Integer.parseInt(JOptionPane.showInputDialog("Digite a opção que deseja: \n"   
					+ "1- Inserir Alunos \n"
					+ "2- Consultar Aluno \n"
					+ "3- Inserir alunos no meio da Lista \n"
					+ "4- Remover aluno \n"
					+ "5- Sair"));
			if(op==1) {
				nome=(JOptionPane.showInputDialog("Insira o nome do aluno"));
				alunos.add(nome);
				i+=1;
			}else if(op==2) {
				op=Integer.parseInt(JOptionPane.showInputDialog("Deseja consultar o aluno por \n"
						+ "1- Nome \n"
						+ "2- Numero \n"));
				if(op==1) {
					nome=(JOptionPane.showInputDialog("Digite o nome a ser procurado "));	
					if(alunos.contains(nome)) {
						JOptionPane.showMessageDialog(null, "O nome foi encontrado");
					}else {
						JOptionPane.showMessageDialog(null, "O nome nao se encontra na lista");
					}
				}else if(op==2) {
					busca=Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da posição do aluno na lista"));
					JOptionPane.showMessageDialog(null,alunos.get(busca));
				}
			}else if(op==3) {
				nome=(JOptionPane.showInputDialog("Digite o nome que sera inserido no meio da lista"));
				alunos.set((i/2), nome);
				i+=1;
			}else if(op==4) {
				op=Integer.parseInt(JOptionPane.showInputDialog("Como você deseja remover os alunos \n"
						+ "1- nome \n"
						+ "2- numero \n"));
				if(op==1) {
					nome=(JOptionPane.showInputDialog("Digite o nome que deseja retirar da lista"));
					alunos.remove(nome);
				}else if(op==2) {
					busca=Integer.parseInt(JOptionPane.showInputDialog("Digite o numero do aluno para que ele seja removido \n"));
					alunos.remove(busca);
				}
			}else if(op==5) {
				JOptionPane.showMessageDialog(null, "Finalizando...");
				break;
			}else {
				JOptionPane.showMessageDialog(null, "Opção invalida !!");
			}
		}
	}
}
