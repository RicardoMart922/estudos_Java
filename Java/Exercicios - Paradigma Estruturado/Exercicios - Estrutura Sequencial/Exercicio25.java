/*
25 - Faça um programa que receba uma hora (uma variável para hora e outra para 
minutos), calcule e mostre: 
a) a hora digitada convertida em minutos; 
b) o total dos minutos, ou seja, os minutos digitados mais a conversão anterior; 
c) o total dos minutos convertidos em segundos. 
 */
package exercicio.estrutura.sequencial;

import java.util.Scanner;

public class Exercicio25 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int hora = 0, minutos = 0, horaConvertidaMinutos = 0, totalMinutos = 0, totalSegundos = 0;
        
        System.out.printf("Hora: ");
        hora = in.nextInt();
        
        System.out.printf("Minutos: ");
        minutos = in.nextInt();
        
        horaConvertidaMinutos = hora * 60;
        System.out.printf("Hora convertida em minutos: %d;\n", horaConvertidaMinutos);
        
        totalMinutos = horaConvertidaMinutos + minutos;
        System.out.printf("Total de minutos: %d;\n", totalMinutos);
        
        totalSegundos = totalMinutos * 60; 
        System.out.printf("Total de segundos: %d.\n", totalSegundos);
        
        in.close();
    }     
}
