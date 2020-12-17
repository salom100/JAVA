package br.edu.ifcvideira.Lista6;

import javax.swing.JOptionPane;

public class Exercicio1_menu {
	public static void main(String[] args) {
		Exercicio1_Contador cc= new Exercicio1_Contador();
		int op;
		int valor=1;
		for(;;){
			op=Integer.parseInt(JOptionPane.showInputDialog("Digite a opção que deseja: \n"
					+ "1- Inserir\n"
					+ "2- Retirar\n"));
			if(op==1){
				cc.Numero(valor);
				JOptionPane.showMessageDialog(null, "o numero que vc possui e:"+cc.getNumero());
			}else if(op==2){
				cc.Subtrai(valor);
				JOptionPane.showMessageDialog(null, "O valor é igual a: "+cc.getNumero());
			}
		else{
				JOptionPane.showMessageDialog(null, "Opção invalida");
			}
		}
	}
}
