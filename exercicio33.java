//O Departamento Estadual de Meteorologia lhe contratou para desenvolver um programa que leia as um conjunto indeterminado de temperaturas, e informe ao final a menor e a maior temperaturas informadas, bem como a média das temperaturas.

import java.util.Scanner;

public class exercicio33 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        double soma = 0;
        double maior = Integer.MIN_VALUE;
        double menor = Integer.MAX_VALUE;
        double valorLido = 1;
        double cont = 0;
        char parar ='.';

            do {
                System.out.print("\nDigite aqui a temperatura em °C: ");             
                valorLido = in.nextDouble();
                cont++;
                    
                    if (valorLido != 0) {
                        soma += valorLido;
                    }
                    if (valorLido > maior) {
                        maior = valorLido;
                    } else if (valorLido < menor) {
                        menor = valorLido;
                    }
                
                System.out.print("\nSe quiser parar o programa (y/n): ");
                parar = in.next().charAt(0);

            } while(parar != 'y') ;
            
            System.out.println("\nMaior = " + maior +" °C\n");
            System.out.println("Menor = " + menor +" °C\n");   
            System.out.println("Média = "+soma/cont+" °C\n");

        in.close();
    }
}