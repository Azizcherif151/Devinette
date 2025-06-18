import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int inconnu = random.nextInt(100) + 1; // Nombre entre 1 et 100
        Scanner scanner = new Scanner(System.in);

        int essais = 0;
        boolean gagne = false;

        System.out.println("Bienvenue dans le jeu de devinettes !");
        System.out.println("Essayez de deviner le nombre entre 1 et 100. Vous avez 10 tentatives.");

        while (essais < 10) {
            System.out.print("Essai #" + (essais + 1) + " : ");
            int devine = scanner.nextInt();
            essais++;

            if (devine == inconnu) {
                System.out.println("Bravo ! Vous avez deviné le nombre en " + essais + " tentative(s).");
                gagne = true;
                break;
            } else if (devine < inconnu) {
                System.out.println("Le nombre est plus grand.");
            } else {
                System.out.println("Le nombre est plus petit.");
            }
        }

        if (!gagne) {
            System.out.println(" Désolé, vous avez utilisé vos 10 essais. Le nombre était : " + inconnu);
        }

        scanner.close();
    }
}
