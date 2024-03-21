import java.util.Scanner;

public class exercicio16 {
    public static void main(String[] args) {
        
        try (Scanner in = new Scanner(System.in)) {
            int numero1 = 1, numero2 = 0, i, posicao = 0;

            System.out.print("Digite aqui a posição que deseja ver: ");
            posicao = in.nextInt();
 
            for (i=0; i < posicao - 2; i++){ 
                numero1 = numero1 + numero2;
                numero2 = numero1 - numero2;
            }
        
            if (numero1>500){
                System.out.print("O número da posição "+posicao+" ultrapassou o valor de 500.");
            } else {
                System.out.print("A posição "+posicao+" tera o resultado "+numero1 );
            }
        
            in.close();
        }
    }
}