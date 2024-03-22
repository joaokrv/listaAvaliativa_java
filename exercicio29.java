//O Sr. Manoel Joaquim possui uma grande loja de artigos de R$ 1,99, com cerca de 10 caixas. Para agilizar o cálculo de quanto cada cliente deve pagar ele desenvolveu um tabela que contém o número de itens que o cliente comprou e ao lado o valor da conta. Desta forma a atendente do caixa precisa apenas contar quantos itens o cliente está levando e olhar na tabela de preços. Você foi contratado para desenvolver o programa que monta esta tabela de preços, que conterá os preços de 1 até 50 produtos

import java.text.DecimalFormat;

public class exercicio29 {
    public static void main(String[] args) {
        
        int produtos = 1; 
        double valorProduto = 1.99;
        double soma = 0;

        DecimalFormat dec = new DecimalFormat("0.00");

            for ( produtos = 1 ; produtos <= 50; produtos++){
                soma += valorProduto;
                System.out.println(produtos+" - R$ "+(dec.format(soma)));
            }
            
    } 
}
