//Foi feita uma estatística em cinco cidades brasileiras para coletar dados sobre acidentes de trânsito. Foram obtidos os seguintes dados:
//Código da cidade
//Número de veículos de passeio (em 1999);
//Número de acidentes de trânsito com vítimas (em 1999). Deseja-se saber:
//Qual o maior e menor índice de acidentes de transito e a que cidade pertence;
//Qual a média de veículos nas cinco cidades juntas;
//Qual a média de acidentes de trânsito nas cidades com menos de 2.000 veículos de passeio

import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio40 {
    public static void main(String[] args) {
        
        try (Scanner in = new Scanner(System.in)) {
            DecimalFormat dec = new DecimalFormat("00.00");

                double maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE ;
                int i = 1, codigoMaior = 0, codigoMenor = 0, contCarros = 0;
                double indiceAcidente, mediaCarros, acidentes, carros, indiceCidadeMenor = 0;
                
                for (i = 1 ; i <= 5 ; i++){
                    System.out.print("\nDigite aqui a quantidade de carros de passeio da cidade "+i+" : ");
                    carros = in.nextDouble();
                    contCarros += carros;

                    System.out.print("Digite aqui o número de acidentes com vítmas na cidade "+i+" : ");
                    acidentes = in.nextDouble();
                    
                    indiceAcidente = acidentes/carros;

                    if (carros < 2000){
                        indiceCidadeMenor = indiceAcidente;
                    }

                    if (indiceAcidente > maior) {
                        codigoMaior = i;
                        maior = indiceAcidente;
                    } else if ( indiceAcidente < menor) {
                        codigoMenor = i;
                        menor = indiceAcidente;
                    }
                }
            
            
            mediaCarros = contCarros/5;

            System.out.print("\nA média de acidentes de transito nas cidade com menos de 2000 carros é de "+(dec.format(indiceCidadeMenor))+" acidentes.");
            System.out.print("\nA média de carros de todas as cidades é de "+mediaCarros);
            System.out.print("\nA cidade "+codigoMaior+" é a cidade com maior índice de acidentes de transito com "+(dec.format(maior))+" acidentes.");
            System.out.print("\nA cidade "+codigoMenor+" é a cidade com menor índice de acidentes de transito com "+(dec.format(menor))+" acidentes.");

        in.close();
        }

    }    
}
