package br.edu.ifcvideira.treino;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class StringBuilder_Pesadao {
	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);
		String frase;
		String letra;
		
		frase=(JOptionPane.showInputDialog("Digite uma frase"));
		letra=(JOptionPane.showInputDialog("Digite a letra que voce deseja subtituir por *"));
		frase=frase.replaceAll(letra, "*");
		
		JOptionPane.showMessageDialog(null,"A frase alterada é: \n"
				+frase);
	}
	
	
}
