package br.edu.ifcvideira.Lista3;

import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		double massa;
		double massaini=0;
		int horas=0;
		int minutos=0;
		int segundos=0;
		int cont=0;
		System.out.println("Digite a massa do objeto radioativo");
		massa=Double.parseDouble(entrada.nextLine());
		massaini=massa;
		for(;;) {
			massa=massa/2;
			cont+=50;
			if(massa<0.5) {
				break;
			}
		}
		System.out.println("Segundos passados:"+cont);
		if(cont>=3600) {
			horas=cont/3600;
			cont=cont-(horas*3600);
		}
		if((cont<3600)&&(cont>=60)) {
			minutos=cont/60;
			cont=cont-(minutos*60);
		}
		if(cont<60) {
			segundos=cont;
		}
		System.out.println("O valor inicial da massa era:"+massaini);
		System.out.println("O valor final da massa e de :"+massa);
		System.out.println("Demorou "+horas+":"+minutos+":"+segundos);
		
		entrada.close();
	}
}
