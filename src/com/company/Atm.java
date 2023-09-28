package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);

	int valor, nota100, nota50, nota20, nota10, nota5, nota2, nota1;
	System.out.println("Digite o valor de saque:");
	valor = entrada.nextInt();

	    nota100 = valor/100;
	    valor = valor%100;
        nota50 = valor/50;
        valor = valor%50;
        nota20 = valor/20;
        valor = valor%20;
        nota10 = valor/10;
        valor = valor%10;
        nota5 = valor/5;
        valor = valor%5;
        nota2 = valor/2;
        valor = valor%2;
        nota1 = valor/1;
        //valor = valor%1;

        System.out.println("A quantidade de cédulas disponíveis são:");
        System.out.println("Nota de $100:"+ nota100);
        System.out.println("Nota de $50:"+ nota50);
        System.out.println("Nota de $20:"+ nota20);
        System.out.println("Nota de $10:"+ nota10);
        System.out.println("Nota de $5:"+ nota5);
        System.out.println("Nota de $2:"+ nota2);
        System.out.println("Nota de $1:"+ nota1);


    }
}
