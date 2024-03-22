//Faça um programa que calcule o valor total investido por um colecionador em sua coleção de CDs e o valor médio gasto em cada um deles. O usuário deverá informar a quantidade de CDs e o valor para em cada um.

import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio28 {
    public static void main(String[] args) {
        
        int cd = 0; 
        double soma = 0, media, valorInvestido = 0;

        Scanner in = new Scanner(System.in);
        DecimalFormat dec = new DecimalFormat("0.00");

        System.out.print("Digite aqui a quantidade de CD's que você possui: ");
        cd = in.nextInt();

            for ( int cont = 1 ; cont <= cd; cont++){
                System.out.print("\nDigite aqui o valor do CD "+cont+": ");
                valorInvestido = in.nextDouble();
                soma += valorInvestido;
            }
        
            media = soma/cd;
            
            System.out.println("\nO valor de cada CD em média foi de: R$ "+(dec.format(media)));
            
        in.close();
    } 
}
