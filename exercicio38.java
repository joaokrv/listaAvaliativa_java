//Um funcionário de uma empresa recebe aumento salarial anualmente: Sabe-se que:
//Esse funcionário foi contratado em 1995, com salário inicial de R$ 1.000,00;
//Em 1996 recebeu aumento de 1,5% sobre seu salário inicial;
//A partir de 1997 (inclusive), os aumentos salariais sempre correspondem ao dobro do percentual do ano anterior. Faça um programa que determine o salário atual desse funcionário. Após concluir isto, altere o programa permitindo que o usuário digite o salário inicial do funcionário.

import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.Scanner;

public class exercicio38 {
    public static void main(String[] args) {
        
        Calendar c = Calendar.getInstance();
        Scanner in = new Scanner(System.in);
        DecimalFormat dec = new DecimalFormat("0.00");

        
        double percentual= 0.0015, salario, reajuste;
        int anoInicio, anoAtual = c.get(Calendar.YEAR);

            System.out.print("Digite aqui quando você começou ganhando: ");
            salario = in.nextDouble();

            System.out.print("Digite aqui o ano que começou na empresa: ");
            anoInicio = in.nextInt();
                
            in.close();

                for ( ; anoInicio <= anoAtual ; anoInicio++){

                    reajuste = salario * percentual;
                    salario += reajuste * 2;

                }
        
            System.out.println("O seu salário atual é de: R$ "+(dec.format(salario)));
        
    }
}