import java.util.Scanner; // Importamos la herramienta para leer el teclado

public class Main {
    public static void main(String[] args) {
        // Creamos el "Scanner" para leer la entrada del usuario
        Scanner input = new Scanner(System.in);

        System.out.println("--- 🚀 Mein Java-Rechner (Pro-Version) ---");

        // Pedir el primer número
        System.out.print("Gib die erste Zahl ein: ");
        double zahl1 = input.nextDouble();

        // Pedir el segundo número
        System.out.print("Gib die zweite Zahl ein: ");
        double zahl2 = input.nextDouble();

        // Operaciones
        double summe = zahl1 + zahl2;
        double differenz = zahl1 - zahl2;
        double produkt = zahl1 * zahl2;

        // Mostrar resultados
        System.out.println("\n--- Ergebnisse ---");
        System.out.println("Addition: " + summe);
        System.out.println("Subtraktion: " + differenz);
        System.out.println("Multiplikation: " + produkt);

        // Lógica de comparación (como en Scratch)
        if (summe > 100) {
            System.out.println("💡 Hinweis: Die Summe ist groesser als 100!");
        } else {
            System.out.println("💡 Hinweis: Die Summe ist 100 oder weniger.");
        }

        System.out.println("-------------------------");
        
        // Es importante cerrar el Scanner al final
        input.close();
    }
}
