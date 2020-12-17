package br.edu.ifcvideira.Lista4;
import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int []numeros = new int[51];
		int i,j;
		for(i=0;i<50;i++) {
			System.out.println("Digite um valor para a posição "+(i+1));
			numeros[i]=Integer.parseInt(entrada.nextLine());
		}
		
		for(j=0;j<50;j++) {
			for(i=0;i<50;i++) {
			if(numeros[i]==0) {
				numeros[i]=numeros[i+1];
				numeros[i+1]=0;
			}
		}
		
		}
		for(i=0;i<50;i++) {
			System.out.print(numeros[i]+" ");
		}
		
		entrada.close();
	}
}
