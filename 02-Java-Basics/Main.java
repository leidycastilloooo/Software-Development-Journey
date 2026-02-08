public class Main {
    public static void main(String[] args) {
        // Eingabewerte (Simulierte Eingabe)
        double zahl1 = 50.5;
        double zahl2 = 10.0;
        
        // Berechnungen
        double summe = zahl1 + zahl2;
        double differenz = zahl1 - zahl2;
        double produkt = zahl1 * zahl2;
        double quotient = zahl1 / zahl2;
        
        // Ausgabe des "Rechners"
        System.out.println("--- Java Mini-Rechner ---");
        System.out.println("Zahl 1: " + zahl1);
        System.out.println("Zahl 2: " + zahl2);
        System.out.println("-------------------------");
        System.out.println("Addition (+):       " + summe);
        System.out.println("Subtraktion (-):    " + differenz);
        System.out.println("Multiplikation (*): " + produkt);
        System.out.println("Division (/):       " + quotient);
        System.out.println("-------------------------");
        
        // Logik-Check: Ist die Summe größer als 100?
        boolean istGross = summe > 100;
        System.out.println("Ist das Ergebnis groesser als 100? " + istGross);
    }
}
