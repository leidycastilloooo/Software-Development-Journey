using System;
using System.Collections.Generic;

namespace LogisticsSystem
{
    // Diese Klasse repräsentiert die Logik eines Transportauftrags
    class OrderLogic
    {
        static void Main(string[] args)
        {
            // Simulation einer Bestellung aus der SQL-Datenbank
            var deliveryOrder = new Dictionary<string, string>
            {
                { "OrderID", "101" },
                { "Destination", "Hamburg-Bramfeld" },
                { "Status", "Pending" } // Der Ausgangsstatus ist 'Ausstehend'
            };

            Console.WriteLine($"--- Solvares Logistics: Status-Update ---");
            Console.WriteLine($"Auftrag {deliveryOrder["OrderID"]} nach {deliveryOrder["Destination"]} gefunden.");

            // Logik zur Zustandsänderung (Simulation der Aktion eines Fahrers)
            UpdateStatus(deliveryOrder, "In Transit");
            
            // Ankunftssimulation am Zielort
            UpdateStatus(deliveryOrder, "Delivered");
        }

        static void UpdateStatus(Dictionary<string, string> order, string newStatus)
        {
            order["Status"] = newStatus;
            
            if (newStatus == "In Transit")
            {
                Console.WriteLine("Update: Der LKW ist jetzt auf dem Weg. (Ressourcen optimiert).");
            }
            else if (newStatus == "Delivered")
            {
                Console.WriteLine("Update: Paket erfolgreich in Hamburg zugestellt!");
            }
        }
    }
}

