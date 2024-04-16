import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter taille:");
        String taille = scanner.nextLine();

        System.out.println("Enter poids:");
        String poids = scanner.nextLine();

        infoColis info = new infoColis(taille, poids);
        ServiceLivraison service = new ServiceLivraison();

        String r = service.livrerColis(info);
        System.out.println(r);

        scanner.close();
    }
}