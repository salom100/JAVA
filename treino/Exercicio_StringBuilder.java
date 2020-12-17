package br.edu.ifcvideira.treino;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exercicio_StringBuilder {
	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);
		StringBuilder palavra = new StringBuilder();
		String frase;
		String palavras[]= new String[100];
		int i;
		frase=(JOptionPane.showInputDialog("Digite uma frase"));
		palavras= frase.split(" ");
		for(i=(palavras.length-1);i>-1;i--) {
			palavra.append(palavras[i]+" ");
		}
		JOptionPane.showMessageDialog(null,"a frase e: \n"
				+ palavra);
		
	}
}
