//O Sr. Manoel Joaquim expandiu seus negócios para além dos negócios de 1,99 e agora possui uma loja de conveniências. Faça um programa que implemente uma caixa registradora rudimentar. O programa deverá receber um número desconhecido de valores referentes aos preços das mercadorias. Um valor zero deve ser informado pelo operador para indicar o final da compra. O programa deve então mostrar o total da compra e perguntar o valor em dinheiro que o cliente forneceu, para então calcular e mostrar o valor do troco. Após esta operação, o programa deverá voltar ao ponto inicial, para registrar a próxima compra.

import java.util.Scanner;
import java.text.DecimalFormat;

public class exercicio31 {
    public static void main(String[] args) {
        
        int produtos = 1; 
        double valorProduto = 0;
        double soma = 0;
        double pagamento = 0, troco = 0;
        
        try (Scanner in = new Scanner(System.in)) {
             DecimalFormat dec = new DecimalFormat("0.00");

                System.out.print("Caso queira parar a operação digite 0\n");
                
                    while(produtos != 0){
                            System.out.print("\nDigite aqui o valor do produto: R$ ");
                            valorProduto = in.nextDouble();
                            soma += valorProduto;
                            
                            System.out.print("\nSe deseja passar mais um produto tecle 1: ");
                            produtos = in.nextInt();
                        
                            if (produtos == 0){
                            System.out.print("\nOpreação encerrada. \n");
                        }
                    }
                    
                    System.out.println("Total = R$ "+(dec.format(soma)));
                    System.out.print("Dinheiro = R$ ");
                    pagamento = in.nextDouble();
                    troco = soma-pagamento;
                    System.out.println("Troco = R$ "+(dec.format(troco)));

            in.close();
        }
    } 
}
