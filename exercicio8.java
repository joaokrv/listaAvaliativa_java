import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {
        
        int numeros;
        double cont = 0;
        double soma = 0;
        
        Scanner in = new Scanner(System.in);
        
            do {
                System.out.print("Digite aqui o número: ");
                numeros = in.nextInt();

                if (numeros >= 0){
                    soma = numeros + soma;
                    cont++;
                } 
            } while (cont < 5);

            System.out.print("A média dos números foi de "+soma/cont);
            in.close();
        
    }        
}