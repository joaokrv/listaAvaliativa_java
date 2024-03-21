import java.util.Scanner;

public class exercicio12 {
    public static void main(String[] args) {
        
        int numero, multiplicacao, resultado;
        
        Scanner in = new Scanner(System.in);
        
            System.out.print("Digite o número que deseja ver a tabuada: ");
            numero = in.nextInt();

            while (numero < 1 || numero > 10){
                System.out.print("Digite um número entre 1 e 10: ");
                numero = in.nextInt();
            }
            
            if (numero >= 1 || numero <= 10) {
                System.out.println("\nTabuada do número "+numero+"\n");
            }

            for (multiplicacao = 1; multiplicacao <=10; multiplicacao++){
                if (numero >= 1 || numero <= 10){
                    resultado = numero * multiplicacao;
                    
                    System.out.println(numero+" X "+ multiplicacao +" = "+resultado);
                    
                    in.close();
                }
            }
        
    }
}
    

