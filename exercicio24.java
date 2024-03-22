import java.util.Scanner;

public class exercicio24 {
    public static void main(String[] args) {
        
        int media, numero = 0, cont = 0, soma = 0;

        System.out.println("Caso queira parar o programa insira -1.");

        Scanner in = new Scanner(System.in);

            while (numero != -1) {
                System.out.print("Digite aqui a nota: ");
                    numero = in.nextInt();
                    if (numero == -1){
                        System.out.println("Programa finalizado.");
                        break;   
                    }
                    if (numero >= 0){
                        soma += numero;
                        cont++;
                    }
            }
        
            media = soma/cont;   
        
            System.out.println("A média foi de "+media);

        in.close();
    } 
}

