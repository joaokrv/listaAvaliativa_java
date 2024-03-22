import java.util.Scanner;

public class exercicio22 {
    public static void main(String[] args) {
        
        try (Scanner in = new Scanner(System.in)) {
            int i, numero, divisores = 0;

            System.out.print("Digite aqui o número: ");
            numero = in.nextInt();

                for (i = 1; i <= numero ; i++) {
                
                    if (numero % i == 0) {
                        divisores++;
                    }
                    if (numero % i == 0){    
                        System.out.println("\nO número "+numero+" é divisivel por "+i+".");
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
