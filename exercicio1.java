import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        
        int nota;

        Scanner in = new Scanner(System.in);

        System.out.print("Digite um número: ");
        nota = in.nextInt();

        while (nota < 0 || nota > 10) {
            System.out.print("Número inválido, tente novamente: ");
            nota = in.nextInt();
        } 
        
        in.close();
    }
}