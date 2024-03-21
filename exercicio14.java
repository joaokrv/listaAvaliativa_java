import java.util.Scanner;

public class exercicio14 {
    public static void main(String[] args) {
        
        int i=1, numeros, impar = 0, par = 0;
        
        try (Scanner in = new Scanner(System.in)) {
            
            for (i = 1; i <= 10; i++){
                System.out.print("Digite aqui o número "+ i +": ");
                numeros = in.nextInt();
            
                if(numeros % 2 != 0){
                impar++;
                }
            
                if (numeros % 2 == 0) {
                par++; 
                }
            }
            System.out.print("Foram contados "+par+" números pares e "+impar+" números ímpares.");
        
        in.close();
        }
    }   
}