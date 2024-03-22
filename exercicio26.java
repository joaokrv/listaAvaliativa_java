//Numa eleição existem três candidatos. Faça um programa que peça o número total de eleitores. Peça para cada eleitor votar e ao final mostrar o número de votos de cada candidato.

import java.util.Scanner;

public class exercicio26 {
    public static void main(String[] args) {
        
        int contA = 0, contB = 0, contC = 0, eleitor;
        char voto;

        Scanner in = new Scanner(System.in);
        System.out.print("Digite aqui o número de eletiores: ");
        eleitor = in.nextInt();

        for ( int cont = 1 ; cont <= eleitor; cont++){
            System.out.print("Digite aqui se seu voto vai para o candidato A, B ou C: ");
            voto = in.next().charAt(0);

                if ( voto == 'A'){
                    System.out.println("Voto contabilizado para o candidato A.\n");
                    contA++;
                }
                if ( voto == 'B'){
                    System.out.println("Voto contabilizado para o candidato B.\n");
                    contB++;
                }
                if ( voto == 'C'){
                    System.out.println("Voto contabilizado para o candidato C.\n");
                    contC++;
                } else if (voto != 'A' && voto != 'B' & voto != 'C'){
                    System.out.println("Voto inválido.\n");
                    cont--;
                }
        }
        
                
        if (contA > contB && contA > contC){
            System.out.println("Candidato A venceu a eleição com "+contA+" votos.");
            System.out.println("Candidato B ficou com "+contB+" votos.");
            System.out.println("Candidato C fico com "+contC+" votos.");
            System.out.println("\nPrograma finalizado.");

        
        } else if (contB > contA && contB > contC){
            System.out.println("Candidato B venceu a eleição com "+contB+" votos.");
            System.out.println("Candidato A ficou com "+contA+" votos.");
            System.out.println("Candidato C fico com "+contC+" votos.");
            System.out.println("\nPrograma finalizado.");

        } else if (contC > contA && contC > contB){
            System.out.println("Candidato C venceu a eleição com "+contC+" votos.");
            System.out.println("Candidato A ficou com "+contA+" votos.");
            System.out.println("Candidato B fico com "+contB+" votos.");
            System.out.println("\nPrograma finalizado.");

        } else if (contC == contA && contC == contB){
            System.out.println("Os candidatos empataram.");
            System.out.println("\nPrograma finalizado.");

        } else if (contC == contB){
            System.out.println("Os candidatos B e C empataram com "+contC+" votos.");
            System.out.println("\nPrograma finalizado.");
        } else if (contA == contB){
            System.out.println("Os candidatos A e B empataram com "+contB+" votos.");
            System.out.println("\nPrograma finalizado.");
        } else if (contA == contC){
            System.out.println("Os candidatos A e C empataram com "+contC+" votos.");
            System.out.println("\nPrograma finalizado.");
        }


        in.close();
    } 
}