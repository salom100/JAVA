package br.edu.ifcvideira.Heranca;

import javax.swing.JOptionPane;

public class Exercicio2 {
	public static void main (String[] args) {
	Cachorro C= new Cachorro();
	Gato G= new Gato();
	
	int op;
		
	for(;;) {
		op=Integer.parseInt(JOptionPane.showInputDialog("voce deseja cadastrar qual animal ?\n"
				+ "1- Cachorro \n"
				+ "2- Gato\n"
				+ "3- Sair"));
		if(op==1) {
			C.setNome(JOptionPane.showInputDialog("Digite o nome do seu Cachorro"));
			C.setRaca(JOptionPane.showInputDialog("Digite a Ra�a do "+C.getNome()));
			JOptionPane.showMessageDialog(null, "Os dados e sons que o seu cachorro faz s�o:\n"
					+ "Nome: "+C.getNome()+" \n"
							+ "Ra�a: "+C.getRaca()+" \n"
									+ "Som: "+C.latido());
		}else if(op==2) {

			G.setNome(JOptionPane.showInputDialog("Digite o nome do seu gato"));
			G.setRaca(JOptionPane.showInputDialog("Digite a Ra�a do "+G.getNome()));
			JOptionPane.showMessageDialog(null, "Os dados e sons que o seu cachorro faz s�o:\n"
					+ "Nome: "+G.getNome()+" \n"
							+ "Ra�a: "+G.getRaca()+" \n"
									+ "Som: "+G.som());
		}else if(op==3) {
			JOptionPane.showMessageDialog(null, "Finalizando o programa obrigado pela preferencia");
			break;
		}
		else {
			JOptionPane.showMessageDialog(null, "A sua escolha esta logicamente fora dos padroes oferecidos de escolhas de cadastramento de animais, por favor reconsidere as suas op��es !! ", "error", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	}
	
	
}
