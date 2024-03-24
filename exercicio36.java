//Desenvolva um programa que faça a tabuada de um número qualquer inteiro que será digitado pelo usuário, mas a tabuada não deve necessariamente iniciar em 1 e terminar em 10, o valor inicial e final devem ser informados também pelo usuário, conforme exemplo abaixo:

import java.util.Scanner;

public class exercicio36 {
    public static void main(String[] args) {
        
        int numero, multiplicacao, resultado, maior, menor;
        
        Scanner in = new Scanner(System.in);
        
            System.out.print("Digite o número que deseja ver a tabuada: ");
            numero = in.nextInt();
            System.out.print("\nComeçar por: ");
            menor = in.nextInt();
            System.out.print("\nTerminar em: ");
            maior = in.nextInt();
            while (numero < 0){
                System.out.print("Digite um número positivo: ");
                numero = in.nextInt();
            }
            if (menor > maior){
                System.out.print("O segundo número deve ser maior que o primeiro. Digite novamento onde deve terminar: ");
                maior = in.nextInt();
            }
            
            if (numero >= 0) {
                System.out.println("\nTabuada do número "+numero+" começando por "+menor+" e terminando em "+maior+"\n");
            }

            for (multiplicacao = menor; multiplicacao <= maior; multiplicacao++){
                if (numero >= 0){
                    resultado = numero * multiplicacao;
                    
                    System.out.println(numero+" X "+ multiplicacao +" = "+resultado);
                    
                    in.close();
                }
            }
        
    }
}