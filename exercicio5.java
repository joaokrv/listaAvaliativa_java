import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {

        double habitantesA, habitantesB,taxaCrescA, taxaCrescB;
        int anos=0;
        
        habitantesA = 80000;
        habitantesB = 200000;

        Scanner in = new Scanner(System.in);

        System.out.print("Digite aqui a taxa de crescimento do  país A: ");
        taxaCrescA = in.nextDouble();
        
        System.out.print("Digite aqui a taxa de crescimento do  país B: ");
        taxaCrescB = in.nextDouble();
        
                while (habitantesA <= habitantesB) {
        
                    habitantesA += habitantesA * taxaCrescA;
                    habitantesB += habitantesB * taxaCrescB;
                    anos ++;
                    
                } System.out.print("Foram necessários "+anos+" para que a população do país A iguale ou ultrapasse a população do país B.");
                
                in.close();
    } 
} 
// Montnha, testei alguns valores e dependendo ele fica muito tempo rodando e não consegue imprimir a mensagem final, não sei o que pode ser. Só que com valores menores ele funciona normalmente.