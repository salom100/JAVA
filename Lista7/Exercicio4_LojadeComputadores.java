package br.edu.ifcvideira.Lista7;

import javax.swing.JOptionPane;

public class Exercicio4_LojadeComputadores {
	public static void main(String args[]) {
		Exercicio4_Computadores C = new Exercicio4_Computadores();
		String processador="";
		String memoria="";
		String disco="";
		String monitor="";
		int op;
		int i;
		double valor;
		for(i=0;i<4;i++) {
			op=Integer.parseInt(JOptionPane.showInputDialog("Escolha as opções de compra (A placa mae vem junto custando 900 reais \n\n"
					+ "1- processadores \n"
					+ "2- memorias \n"
					+ "3- discos \n"
					+ "4- monitores \n"
					+ "5- Finalizar Compra"));
			if(op==1) {
				op=Integer.parseInt(JOptionPane.showInputDialog("Escolha o Processador: \n\n"
						+ "processador|Preço \n"
						+ "1- 600MHz   700 R$\n"
						+ "2- 800MHz   830 R$\n"
						+ "3- 933MHz   910 R$\n"));
				if(op==1) {
					valor=700;
					processador="600MHz";
					C.setprocessadores(valor);
					valor=0;
				}else if(op==2) {
					valor=830;
					processador="800MHz";
					C.setprocessadores(valor);
					valor=0;
				}else if(op==3) {
					valor=910;
					processador="933MHz";
					C.setprocessadores(valor);
					valor=0;
				}
			}else if (op==2) {
				op=Integer.parseInt(JOptionPane.showInputDialog("Escolha a memoria : \n\n"
						+ "Memorias | Preço\n"
						+ "1- 1GB     150R$\n"
						+ "2- 2GB     300R$\n"
						+ "3- 4GB     600R$\n"
						+ "4- 8GB     1200R$\n"));
				if(op==1) {
					valor=150;
					memoria="1GB";
					C.setmemoria(valor);
					valor=0;
				}else if(op==2) {
					valor=300;
					memoria="2GB";
					C.setmemoria(valor);
					valor=0;
				}else if(op==3) {
					valor=600;
					memoria="4GB";
					valor=0;
				}else if(op==4) {
					valor=1200;
					memoria="8GB";
					valor=0;
				}
			}else if(op==3) {
				op=Integer.parseInt(JOptionPane.showInputDialog("Escolha o disco rigido: \n\n"
						+ "   Discos | Preço \n"
						+ "1- 500GB    400R$ \n"
						+ "2- 1Tb      600R$ \n"
						+ "3- 2Tb      800R$ \n"));
				if(op==1) {
					valor=400;
					disco="500GB";
					C.setdisco(valor);
					valor=0;
				}else if(op==2) {
					valor=600;
					disco="1TB";
					C.setdisco(valor);
					valor=0;
				}else if(op==3) {
					valor=800;
					disco="2TB";
					C.setdisco(valor);
					valor=0;
				}
			}else if(op==4) {
				op=Integer.parseInt(JOptionPane.showInputDialog("Escolha o monitor : \n\n"
						+ "Monitor |preço \n"
						+ "1- 17 Polegadas 390R$ \n"
						+ "2- 19 Polegadas 520R$ \n"));
				if(op==1) {
					valor=390;
					monitor="17 Polegadas";
					C.setmonitor(valor);
					valor=0;
				}else if(op==2) {
					valor=520;
					monitor="19 Polegadas";
					C.setmonitor(valor);
					valor=0;
				}
			}
		}
		C.setplaca();
		C.somatotal();
		
		JOptionPane.showMessageDialog(null, "A configuração escolhida foi: \n\n"
				+ "Placa mae  valor: 900\n"
				+ "Processador: "+processador+"  valor: "+C.getprocessadores()+" \n"
						+ "Memoria: "+memoria+"  valor: "+C.getmemoria()+" \n"
								+ "Disco: "+disco+"  valor: "+C.getdisco()+" \n"
										+ "monitor:"+monitor+"  valor: "+C.getmonitor()+" \n"
												+ "O Valor total da Configuração é: "+C.gettotal()+" \n\n"
														+ "Finalizando...");
	}
}
