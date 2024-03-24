//Os números primos possuem várias aplicações dentro da Computação, por exemplo na Criptografia. Um número primo é aquele que é divisível apenas por um e por ele mesmo. Faça um programa que peça um número inteiro e determine se ele é ou não um número primo.

import java.util.Scanner;

public class exercicio34 {
    public static void main(String[] args) {
        
        try (Scanner in = new Scanner(System.in)) {
            int i, numero, divisores = 0;

            System.out.print("Digite aqui o número: ");
            numero = in.nextInt();

                for (i = 1; i <= numero ; i++) {
                
                    if (numero % i == 0) {
                        divisores++;
                    } 
                }    
                if (divisores == 2){
                        System.out.print("\nO número "+numero+" é primo.");
                } else {
                        System.out.print("\nO número "+numero+" não é primo.");
                }                

        in.close();
        
        }
    }
}

