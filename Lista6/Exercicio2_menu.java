package br.edu.ifcvideira.Lista6;

import javax.swing.JOptionPane;


public class Exercicio2_menu {
	public static void main(String[] args) {
		Exercicio2_fundo cc= new Exercicio2_fundo();
		int numero=0;//inserir n1 e n2
		int valor=0;//para trocar
		int op;
		for(;;) {
			op=Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha uma das opçoes abaixo \n"
					+ "1)inserir um valor em N1 e N2 \n"
					+ "2)Trocar os valores \n"
					+ "3)mostrar os valores\n"
					+ "4)Sair"	));
			if(op==1) {
				numero=Integer.parseInt(JOptionPane.showInputDialog("Digite o valor que deseja armazenar em N1"));
				cc.setn1(numero);
				valor=cc.getn1();
				numero=0;
				numero=Integer.parseInt(JOptionPane.showInputDialog("Digite o valor que deseja armazenar em N2"));
				cc.setn2(numero);
			}else if(op==2) {
				cc.troca(numero, valor);
			}else if(op==3) {
				JOptionPane.showMessageDialog(null, "N1="+cc.getn1()+" \n"
						+ "N2="+cc.getn2());
			}else {
				JOptionPane.showMessageDialog(null, "Finalizando..");
				break;
			}
			
		}
		
	}
	
}
