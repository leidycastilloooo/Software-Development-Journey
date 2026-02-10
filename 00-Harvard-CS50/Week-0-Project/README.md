# 🦖 Projekt 0: Hungriger Dinosaurier

Dies ist mein Abschlussprojekt für die Woche 0 des CS50-Kurses der Harvard University.

### 🎮 Spielbeschreibung
In diesem Spiel steuert der Spieler einen hungrigen Dinosaurier. Das Ziel ist es, Logik und Bewegung zu kombinieren, um die Mechaniken von Scratch zu demonstrieren.

### 🛠️ Implementierte Konzepte (Week 0):
* **Events:** Das Spiel startet mit dem "Grüne Flagge"-Event.
* **Loops:** Ich nutze `wiederhole fortlaufend`, damit der Dinosaurier auf Eingaben reagiert oder sich Objekte bewegen.
* **Conditions:** Falls der Dinosaurier ein Objekt berührt, passiert eine Aktion (Essen oder Punktabzug).
* **Variables:** Es gibt eine Variable für die Punkte (`Punkte` / `Score`).
* **Sound:** Das Spiel nutzt Soundeffekte zur Interaktion.

### 🚀 Wie man es startet:
1. Lade die Datei `Hungriger Dinosaurier (1).sb3` aus diesem Ordner herunter.
2. Öffne den [Scratch Editor](https://scratch.mit.edu/projects/editor/).
3. Gehe auf *Datei -> Von deinem Computer laden* und wähle die Datei aus.
## 🔗 Online Version

Du kannst das Spiel direkt im Browser ausprobieren: 
[Hungriger Dinosaurier auf Scratch](https://scratch.mit.edu/projects/1276860129/)

## 🧩 Code-Logik (Abstraktion)
In diesem Projekt habe ich folgende Logik implementiert:
1. **Bewegung:** Steuerung über Tastatur-Events.
2. **Kollisionsabfrage:** Ein `falls... dann`-Block prüft ständig, ob der Dinosaurier die Nahrung berührt.
3. **Punkte:** Erhöhung der Variable bei Erfolg.
