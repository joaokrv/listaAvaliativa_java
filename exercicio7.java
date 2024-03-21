import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        
        int numeros;
        int maior;
        int i = 1;
        
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Digite aqui o número "+ i +": ");
            numeros = in.nextInt();
    
            maior = numeros;
                
            for (i = 2; i <= 5; i++){
                    
                System.out.print("Digite aqui o número "+ i +": ");
                numeros = in.nextInt();
                if (numeros > maior){
                    maior = numeros;
                }

            } System.out.print("O maior número foi : "+maior);

        in.close();
        }
    }
}
