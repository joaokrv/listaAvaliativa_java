import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        
        int numeroUm, numeroDois, i;

        Scanner in = new Scanner(System.in);
        
            System.out.print("Digite o valor do primeiro número: ");
            numeroUm = in.nextInt();
            System.out.print("Digite o valor do segundo número: ");
            numeroDois = in.nextInt();

            if (numeroDois<numeroUm) {
                System.out.print("Digite o valor do primeiro número: ");
                numeroUm = in.nextInt();
                System.out.print("Digite o valor do segundo número: ");
                numeroDois = in.nextInt();
            } else { 
                for(i = numeroUm; i <= numeroDois; i++){
                    System.out.println(i); 
                    in.close();
                }            
            }   
    }
}