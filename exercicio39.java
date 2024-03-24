import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio39 {
    public static void main(String[] args) {
        
        try (Scanner in = new Scanner(System.in)) {
            DecimalFormat dec = new DecimalFormat("0.00");


                double maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE, altura;
                int i = 1, alunoAlto = 0, alunoBaixo = 0;

                for (i = 1 ; i <= 10 ; i++){
                    System.out.print("Digite aqui a altura do aluno "+i+" : ");
                    altura = in.nextDouble();
                    
                    if (altura > maior) {
                        alunoAlto = i;
                        maior = altura;
                    } else if ( altura < menor) {
                        alunoBaixo = i;
                        menor = altura;
                    }
                }
            
            System.out.print("\nO aluno "+alunoAlto+" é o maior da sala com "+(dec.format(maior))+" M de altura.");
            System.out.print("\n\nO aluno "+alunoBaixo+" é o menor da sala com "+(dec.format(menor))+" M de altura.");

        in.close();
        }

    }    
}
