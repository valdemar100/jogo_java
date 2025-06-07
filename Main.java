import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Personagem> listaPersonagens = new ArrayList<>();

        System.out.print("Quantos personagens deseja cadastrar? ");
        int quantidade = entrada.nextInt();
        entrada.nextLine();

        for (int i = 0; i < quantidade; i++) {
            System.out.println("Cadastro do personagem " + (i + 1) + ":");
            System.out.println("1 - Arqueiro");
            System.out.println("2 - Cavaleiro");
            System.out.println("3 - Mago");
            int tipo = entrada.nextInt();
            entrada.nextLine();

            System.out.print("Nome: ");
            String nome = entrada.nextLine();

            System.out.print("Nível: ");
            int nivel = entrada.nextInt();
            entrada.nextLine(); 

            switch(tipo) {
                case 1:
                    System.out.print("Tipo de flecha ");
                    String tipodeflecha = entrada.next();
                    entrada.nextLine(); 
                    listaPersonagens.add(new Arqueiro(nome, nivel, tipodeflecha));
                    break;
                case 2:
                    System.out.print("Montaria: ");
                    String montaria = entrada.nextLine();
                    listaPersonagens.add(new Cavaleiro(nome, nivel, montaria));
                    break;
                case 3:
                    System.out.print("Elemento: ");
                    String elemento = entrada.nextLine();
                    listaPersonagens.add(new Mago(nome, nivel, elemento));
                    break;
                default:
                    System.out.println("Tipo de personagem inválido! ");
                    i--;
                    break;
            }
        }

        System.out.println("Personagens Cadastrados ");
        for (Personagem p : listaPersonagens) {
            System.out.println(p);
        }

        entrada.close();
    }
}
