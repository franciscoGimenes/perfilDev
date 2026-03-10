import java.util.Scanner;

public class PerfilDev {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao sistema de perfil de desenvolvedor!");
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha

        System.out.print("Digite sua linguagem de programação favorita: ");
        String linguagemFavorita = scanner.nextLine();

        System.out.printf("Olá, %s! Você tem %d anos e sua linguagem de programação favorita é %s.%n",
                nome, idade, linguagemFavorita);

        scanner.close();
    }
}