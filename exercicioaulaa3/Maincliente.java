package exercicioaulaa3;

import java.util.Scanner;
public class Maincliente {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Cliente c1 = new Cliente ();

       
        System.out.println("Nome do Cliente: ");
        c1.setNome (ler.nextLine());

        System.out.println("Digite a idade: ");
        c1.setidade(ler.nextInt());

        System.out.println("Digite o salário de "+c1.getNome());
        c1.setRenda(ler.nextDouble());

        
        System.out.println("*********");
        System.out.println("Carregando dados de "+c1.getNome());
        System.out.println("*********");
        
       
        System.out.println("O nome do cliente é: "+c1.getNome());
        System.out.println("A idade do cliente é: "+c1.getidade());
        System.out.println("O salário do cliente é: "+c1.getRenda());

        
        System.out.println(c1.classificarIdade());
        System.out.println(c1.classificarRenda());
    }
}
