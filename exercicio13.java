import java.util.Scanner;

public class exercicio13 {
    public static void main(String[] args) {
        
        int base = 0, expoente = 0, resultado = 1, i=0;

        Scanner in = new Scanner(System.in);

        System.out.print("Digite o valor da base: ");
        base = in.nextInt();

        System.out.print("\nDigite o valor do expoente: ");
        expoente = in.nextInt();

        if (expoente < 0) {
            System.out.print("Digite o valor de um expoente positivo: ");
            expoente = in.nextInt();
        }
        
        for (i = 0; i < expoente; i++){
                
            if (expoente == 0){
                System.out.print("\nO resultado da potenciação é : 1");
            }else { 
                resultado = resultado * base;
            }
                
            in.close();
        } System.out.print("\nO resultudo da potenciação da base "+base+" com o expoente "+expoente+" é: "+resultado);
    }     
}

