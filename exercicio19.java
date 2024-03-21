import java.util.Scanner;

public class exercicio19 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
            int valorLido = 0;
            int menor , maior;
            int soma = 0;
        
            menor = maior = valorLido;

            System.out.print("Digite o valor -1 para parar de inserir números.\n\n");
        
            do {
                System.out.print("Digite aqui o número ");             
                if (valorLido >= 0 && valorLido < 1001) {
                    valorLido = in.nextInt();
                    if (valorLido >= 0 && valorLido < 1001) {
                        soma += valorLido;
                    if (valorLido > maior && valorLido >= 0 && valorLido < 1001) {
                        maior = valorLido;
                    } else if (valorLido < menor && valorLido >= 0 && valorLido < 1001) {
                        menor = valorLido;
                    }
                  }
                } else {
                    System.out.print("que de preferncia seja entre 0 e 1000 : ");
                    valorLido = in.nextInt();
                    if (valorLido >= 0 && valorLido < 1001) {
                        soma += valorLido;
                    if (valorLido > maior && valorLido >= 0 && valorLido < 1001) {
                        maior = valorLido;
                    } else if (valorLido < menor && valorLido >= 0 && valorLido < 1001) {
                        menor = valorLido;
                    }
                  }
                }  
            } while(valorLido != -1);
            
            System.out.println("\nMaior = " + maior +"\n");
            System.out.println("Menor = " + menor +"\n");   
            System.out.println("Soma = " + soma +"\n");

        in.close();
    }
}