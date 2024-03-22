//Faça um programa que peça para n pessoas a sua idade, ao final o programa devera verificar se a média de idade da turma varia entre 0 e 25,26 e 60 e maior que 60; e então, dizer se a turma é jovem, adulta ou idosa, conforme a média calculada.

import java.util.Scanner;

public class exercicio25 {
    public static void main(String[] args) {
        
        int media, numero = -1, cont = 0, soma = 0;

        System.out.println("Caso queira parar o programa insira 0.");

        Scanner in = new Scanner(System.in);

            while (numero != 0) {
                System.out.print("Digite aqui a idade: ");
                    numero = in.nextInt();
                    if (numero == 0){
                        System.out.println("\nPrograma finalizado.\n");
                        break;   
                    }
                    if (numero >= 0){
                        soma += numero;
                        cont++;
                    }
            }
        
            media = soma/cont;
            
            if (media > 0 && media <= 25){
                System.out.println("A turma é jovem, e a idade média é: "+media);
            }
            if (media > 25 && media <= 60){
                System.out.println("A turma é adulta, e a idade média é: "+media);
            } 
            if (media >= 61) {
                System.out.println("A turma é idosa, e a idade média é: "+media);
            }

        in.close();
    } 
}