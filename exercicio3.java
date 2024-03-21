import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {

        String nome;
        char sexo, estadoCivil;
        int idade;

        Scanner in = new Scanner(System.in);

        System.out.print("Digite aqui seu nome: "); 
        nome = in.next();
            
            while (nome.length() <= 3) {
            System.out.print("Digite um nome válido: ");
            nome = in.next();
        }
        
        System.out.print("Digite aqui sua idade: ");
        idade = in.nextInt();
            
            while (idade <= 0 || idade > 150) {
            System.out.print("Digite uma idade válida: ");
            idade = in.nextInt();
        }
        
        System.out.print("Digite aqui seu sexo: ");
        sexo = in.next().charAt(0);
            
            while (sexo != 'f' && sexo != 'm') {
            System.out.print("Digite um sexo válido: ");
            sexo = in.next().charAt(0);
        }
        
        System.out.print("Digite aqui qual o seu estado civil: ");
        estadoCivil = in.next().charAt(0);

            while (estadoCivil != 's' && estadoCivil != 'c' && estadoCivil != 'v' && estadoCivil != 'd') {
                System.out.print("Digite aqui um estado civil válido: ");
                estadoCivil = in.next().charAt(0);
            }
            
            in.close();
       
    }
      
}
