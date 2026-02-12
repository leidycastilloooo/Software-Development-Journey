import java.util.Scanner; // Importiert die Scanner-Klasse für Benutzereingaben

public class Main {
    public static void main(String[] args) {
        // Scanner-Objekt erstellen
        Scanner input = new Scanner(System.in);

        System.out.println("--- 🚀 Mein Java-Rechner (Pro-Version) ---");

        // Erste Zahl abfragen
        System.out.print("Gib die erste Zahl ein: ");
        double zahl1 = input.nextDouble();

        // Zweite Zahl abfragen
        System.out.print("Gib die zweite Zahl ein: ");
        double zahl2 = input.nextDouble();

        // Mathematische Operationen
        double summe = zahl1 + zahl2;
        double differenz = zahl1 - zahl2;
        double produkt = zahl1 * zahl2;

        // Ausgabe der Ergebnisse
        System.out.println("\n--- Ergebnisse ---");
        System.out.println("Summe (Addition):       " + summe);
        System.out.println("Differenz (Subtraktion): " + differenz);
        System.out.println("Produkt (Multiplikation): " + produkt);

        // Logik-Prüfung (wie in Scratch)
        if (summe > 100) {
            System.out.println("💡 Hinweis: Die Summe ist groesser als 100!");
        } else {
            System.out.println("💡 Hinweis: Die Summe ist 100 oder weniger.");
        }

        System.out.println("-------------------------");
        
        // Scanner schließen
        input.close();
    }
}
