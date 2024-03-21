import java.util.Scanner;

public class exercicio18 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
            int valorLido = 1;
            int menor , maior;
            int soma = 0;
        
            menor = maior = valorLido;

            System.out.print("Digite o valor 0 para parar de inserir números.\n");
        
            do {
                System.out.print("Digite aqui o número: ");             
                if (valorLido != 0) {
                    valorLido = in.nextInt();
                    if (valorLido != 0) {
                        soma += valorLido;
                    if (valorLido > maior) {
                        maior = valorLido;
                    } else if (valorLido < menor) {
                        menor = valorLido;
                    }
                  }
                }

            } while(valorLido != 0) ;
            
            System.out.println("Maior = " + maior +"\n");
            System.out.println("Menor = " + menor +"\n");   
            System.out.println("Soma = " + soma +"\n");

        in.close();
    }
}