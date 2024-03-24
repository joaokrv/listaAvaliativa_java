//Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário. Ex.: 5!=5.4.3.2.1=120. A saída deve ser conforme o exemplo abaixo:

import java.util.Scanner;

public class exercicio32 {
    public static void main(String[] args) {
        
        try (Scanner in = new Scanner(System.in)) {
            
            int numero1, fatorial, numero;
    
            System.out.print("Digite um número: ");
            numero1 = in.nextInt();
            
            numero = numero1;
            fatorial = 1;
            
            System.out.print(numero1+"! = ");
            
            while (numero > 0){
                
                fatorial *= numero;
            
                if (numero > 1){
                    System.out.print(numero + " . ");
                } else {
                    System.out.print(numero);
                }
                
                numero -= 1;
            }
            System.out.print(" = "+fatorial);
            
        }
    }
}