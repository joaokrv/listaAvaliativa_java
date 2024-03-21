import java.util.Scanner;

public class exercicio17 {
    public static void main(String[] args) {
        
        try (Scanner in = new Scanner(System.in)) {
            
            int numero1, i, fatorial = 1, cont = 1;

            do{
                System.out.print("Digite aqui o fatorial que deseja ver: ");
                numero1 = in.nextInt();
            
                for (i = 1; i <= numero1; i++){ 
                fatorial = fatorial * i;
                }

                System.out.print("o fatorial !"+numero1+" = "+fatorial);
                cont++;

            } while (cont < 2);   
        }
    }
}