import java.util.Scanner;

public class exercicio20 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in); 
            
            int numero = 1, i, fatorial = 1;

            System.out.print("Digite o valor -1 para parar de inserir números.\n");

            while (numero != -1){

                System.out.print("\nDigite aqui o fatorial que deseja: ");
                numero = in.nextInt();

                if (numero >= 0 && numero < 16) {
                    for (i = 1; i <= numero; i++){ 
                        fatorial = fatorial * i;
                        }  System.out.print("O fatorial !"+numero+" = "+fatorial+"\n");
                            fatorial = 1;
                } else {
                    System.out.print("Insira um valor entre 0 e 15 (caso queira encerrar o programa digite -1 novamente): ");
                    numero = in.nextInt();
                    
                    if (numero >= 0 && numero < 16) {
                        for (i = 1; i <= numero; i++){ 
                            fatorial = fatorial * i; 
                        } System.out.print("O fatorial !"+numero+" = "+fatorial+"\n");
                        fatorial = 1;
                    }
                }
            }
    
        in.close();

    }
}