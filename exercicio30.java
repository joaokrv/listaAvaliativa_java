//O Sr. Manoel Joaquim acaba de adquirir uma panificadora e pretende implantar a metodologia da tabelinha, que já é um sucesso na sua loja de 1,99. Você foi contratado para desenvolver o programa que monta a tabela de preços de pães, de 1 até 50 pães, a partir do preço do pão informado pelo usuário.

import java.util.Scanner;
import java.text.DecimalFormat;

public class exercicio30 {
    public static void main(String[] args) {
        
        int produtos = 1; 
        double valorProduto = 0;
        double soma = 0;
        
        try (Scanner in = new Scanner(System.in)) {
             DecimalFormat dec = new DecimalFormat("0.00");

                System.out.print("Insira o valor do pão: R$ ");
                valorProduto = in.nextDouble();


                    for ( produtos = 1 ; produtos <= 50; produtos++){
                        soma += valorProduto;
                        System.out.println(produtos+" - R$ "+(dec.format(soma)));
                    }
            
            in.close();
        }
    } 
}
