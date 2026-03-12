import java.util.Scanner; // importando Scanner    

public class PerfilDev {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao sistema de perfil de desenvolvedor do chico corinthiano!");
        System.out.print("Digite seu nome e sobrenome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha pendente

        System.out.print("Você gosta de progamação orientada a objetos? (true/false): ");
        String gostaPOO = scanner.nextBoolean() ? "gosta" : "não gosta";
        scanner.nextLine(); // Consumir a quebra de linha pendente

        System.out.println("Você tem experiencia na area de desenvolvimento? (true/false): ");
        boolean temExperiencia = scanner.nextBoolean();
        String experiencia = temExperiencia ? "tem" : "não tem";
        scanner.nextLine(); // Consumir a quebra de linha pendente

        System.out.print("Digite sua linguagem de programação favorita: ");
        String linguagemFavorita = scanner.nextLine();

        System.out.printf("Olá, %s! Você tem %d anos, %s de programação orientada a objetos, %s experiencia na área de desenvolvimento e sua linguagem de programação favorita é %s.%n",
                nome, idade, gostaPOO, experiencia, linguagemFavorita);

        scanner.close();
    }
}
