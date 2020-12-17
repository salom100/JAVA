package br.edu.ifcvideira.Lista4;
import java.util.Scanner;

public class Exercicio6 {
	 public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		int []numeros= new int [4];
		int i;
		for(i=0;i<3;i++) {
			System.out.println("Digite um numeros  de 1 a 9 na posição "+(i+1));
			numeros[i]=Integer.parseInt(entrada.nextLine());
		}
		//centenas
		if((numeros[0]==1)&&(numeros[1]==0)&&(numeros[2]==0)) {
			System.out.print("Cem ");
		}else if(numeros[0]==1) {
			System.out.print("Cento  ");
		}
		if(numeros[0]==2) {
			System.out.print("Duzentos  ");
		}else if(numeros[0]==3) {
			System.out.print("Trezentos  ");
		}else if(numeros[0]==4) {
			System.out.print("Quatrocentos  ");
		}else if(numeros[0]==5) {
			System.out.print("Quinhentos  ");
		}else if(numeros[0]==6) {
			System.out.print("Seiscentos  ");
		}else if(numeros[0]==7) {
			System.out.print("Setecentos  ");
		}else if(numeros[0]==8) {
			System.out.print("Oitocentos  ");
		}else if(numeros[0]==9) {
			System.out.print("Novecentos  ");
		}
		
		//dezenas
		if((numeros[1]==1)&&(numeros[2]==0)){
			System.out.print("e Dez");
		}else if((numeros[1]==1)&&(numeros[2]==1)){
			System.out.print("e Onze");
		}else if((numeros[1]==2)&&(numeros[2]==2)) {
			System.out.print("e  Doze  ");
		}else if((numeros[1]==2)&&(numeros[2]==3)) {
			System.out.print("e  Treze  ");
		}else if((numeros[1]==2)&&(numeros[2]==4)) {
			System.out.print("e  Quatorze  ");
		}else if((numeros[1]==2)&&(numeros[2]==5)) {
			System.out.print("e  Quinze ");
		}else if((numeros[1]==2)&&(numeros[2]==6)) {
			System.out.print("e  Dezesseis  ");
		}else if((numeros[1]==2)&&(numeros[2]==7)) {
			System.out.print("e  Dezessete  ");
		}else if((numeros[1]==2)&&(numeros[2]==8)) {
			System.out.print("e  Dezoito  ");
		}else if((numeros[1]==2)&&(numeros[2]==9)) {
			System.out.print("e  Dezenove  ");
		}
		
		if(numeros[1]==2) {
			System.out.print("e  Vinte  ");
		}else if(numeros[1]==3) {
			System.out.print("e Trinta ");
		}else if(numeros[1]==4) {
			System.out.print("e Quarenta ");
		}else if(numeros[1]==5) {
			System.out.print("e Cincuenta");
		}else if(numeros[1]==6) {
			System.out.print("e Sessenta ");
		}else if(numeros[1]==7) {
			System.out.print("e Setenta ");
		}else if(numeros[1]==8) {
			System.out.print("e Oitenta");
		}else if(numeros[1]==9) {
			System.out.print("e Noventa" );
		}
		
		//unidades
		if(numeros[2]==1){
			System.out.print("e Um ");
		}else if(numeros[2]==2) {
			System.out.print("e  Dois  ");
		}else if(numeros[2]==3) {
			System.out.print("e Tres ");
		}else if(numeros[2]==4) {
			System.out.print("e Quatro ");
		}else if(numeros[2]==5) {
			System.out.print("e Cinco");
		}else if(numeros[2]==6) {
			System.out.print("e Seis ");
		}else if(numeros[2]==7) {
			System.out.print("e Sete ");
		}else if(numeros[2]==8) {
			System.out.print("e Oito");
		}else if(numeros[2]==9) {
			System.out.print("e Nove" );
		}
		entrada.close();
	}
}
