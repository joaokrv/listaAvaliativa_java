//Uma academia deseja fazer um senso entre seus clientes para descobrir o mais alto, o mais baixo, a mais gordo e o mais magro, para isto você deve fazer um programa que pergunte a cada um dos clientes da academia seu código, sua altura e seu peso. O final da digitação de dados deve ser dada quando o usuário digitar 0 (zero) no campo código. Ao encerrar o programa também deve ser informados os códigos e valores do clente mais alto, do mais baixo, do mais gordo e do mais magro, além da média das alturas e dos pesos dos clientes

import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio37 {
    public static void main(String[] args) {
        
        double altura, peso, somaPeso = 0, somaAltura = 0, maiorAltura = Integer.MIN_VALUE, menorAltura = Integer.MAX_VALUE, maiorPeso = Integer.MIN_VALUE, menorPeso = Integer.MAX_VALUE;
        double contPeso = 0, contAltura = 0, mediaPeso, mediaAltura; 
        int codigo = -1 ,codigoGordo = 0, codigoMagro = 0, codigoAlto = 0, codigoBaixo = 0;
 
        Scanner in = new Scanner(System.in);
        DecimalFormat dec = new DecimalFormat("0.00");

            System.out.println("Para finalizar o programa digite 0 quando for colocar o código.");

            while (codigo != 0) {
            
                System.out.print("\nDigite aqui seu código: ");
                codigo = in.nextInt();
                    if (codigo == 0) {
                        System.out.println("\nPrograma finalizado.\n\n");
                        break;
                    }
                    System.out.print("Digite aqui seu peso: ");
                    peso = in.nextDouble();
                        if (peso > maiorPeso) {
                            maiorPeso = peso;
                            codigoGordo = codigo;
                        } else if (peso < menorPeso) {
                            menorPeso = peso;
                            codigoMagro = codigo;
                        }
                        somaPeso += peso;
                        contPeso++;
            
                    System.out.print("Digite aqui sua altura: ");
                    altura = in.nextDouble();
                        if (altura > maiorAltura) {
                            maiorAltura = altura;
                            codigoAlto = codigo;
                        } else if (altura < menorAltura) {
                            menorAltura = altura;
                            codigoBaixo = codigo;
                        }
                        somaAltura += altura;
                        contAltura++;
            }

            mediaPeso=somaPeso/contPeso;
            mediaAltura=somaAltura/contAltura;

        in.close();

        System.out.print("O maior peso e menor peso são respectivamente: "+maiorPeso+" KG - código "+ codigoGordo +", "+menorPeso+" KG - código "+ codigoMagro +" .");
        System.out.print("\nA maior altura e menor altura são respectivamente: "+maiorAltura+" M - código"+ codigoAlto +", "+menorAltura+" M - código "+ codigoBaixo +" .");
        System.out.print("\nA média de peso dos clientes é: "+(dec.format(mediaPeso)));
        System.out.print("\nA média de altura dos clientes é: "+(dec.format(mediaAltura)));

    }
}