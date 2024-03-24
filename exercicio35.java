import java.util.Scanner;

public class exercicio35 {
    public static void main(String[] args) {
        
        try (Scanner in = new Scanner(System.in)) {
            int i, numero = -1, divisores = 0;
            
            System.out.print("Digite 0 para parar de inserir números. \n\n");
            

            while (numero != 0){ 
                System.out.print("Digite aqui o número: ");
                numero = in.nextInt();
                if (numero == 0){
                    System.out.println("Programa finalizado.");
                    break;   
                }
                for (i = 1; i <= numero ; i++) {
                    if (numero % i == 0) {
                        divisores++;
                    }
                }
                if (divisores == 2){
                    System.out.println("O número "+numero+" é primo.\n");
                } else {
                    System.out.println("O número "+numero+" não é primo, digite outro.\n");
                }
                divisores = 0;
            }

        in.close();
        
        }
    }
}