import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {

        String usuario, senha;

        Scanner in = new Scanner(System.in);

        System.out.print("Digite aqui o nome de usuário: ");
        usuario = in.nextLine();

        System.out.print("Digite aqui sua senha: ");
        senha = in.nextLine();

        while (usuario.equals(senha)) {
            System.out.print("Erro nas informações. Por favor insira novamente as suas informações.");
            
            System.out.print("Digite aqui o nome de usuário: ");
            usuario = in.nextLine();
          
            System.out.print("Digite aqui sua senha: ");
            senha = in.nextLine();
        }
       
        in.close();
    }
}
//Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha igual ao nome do usuário, mostrando uma mensagem de erro e voltando a pedir as informações