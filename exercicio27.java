//Faça um programa que calcule o número médio de alunos por turma. Para isto, peça a quantidade de turmas e a quantidade de alunos para cada turma. As turmas não podem ter mais de 40 alunos.

import java.util.Scanner;

public class exercicio27 {
    public static void main(String[] args) {
        
        int media, turmas, alunos = 0, soma = 0;

        Scanner in = new Scanner(System.in);

            System.out.print("Digite aqui o número de turmas: ");
            turmas = in.nextInt();

                for ( int cont = 1 ; cont <= turmas; cont++){
                    System.out.print("\nDigite aqui quantos alunos tem na turma "+cont+": ");
                    alunos = in.nextInt();
                    soma += alunos;
                }
        
                media = soma/turmas;
            
                if (media > 40){
                    System.out.println("\nAs turmas estão superlotadas.");
                } else {
                    System.out.println("As turmas estão com "+media+" alunos em média.");
                }
       
        in.close();
    } 
}

