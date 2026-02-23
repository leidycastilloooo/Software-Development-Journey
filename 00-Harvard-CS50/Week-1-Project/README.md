# CS50x Harvard - Woche 1: C 🚀

Dieses Repository enthält meine Lösungen für die Übungen der ersten Woche des CS50-Kurses der Harvard University. In dieser Woche sind wir von der visuellen Programmierung (Scratch) zur textbasierten Programmierung mit der Sprache **C** übergegangen.

## 🧠 Gelernte Konzepte

In dieser Woche habe ich die Grundlagen der Informatik vertieft:
* **Kompilierung:** Quellcode mit `make` in Maschinencode umwandeln.
* **Datentypen:** Verwendung von `int`, `float`, `char` und `string`.
* **Schleifen:** Implementierung von `for` und `while` Schleifen.
* **Bedingungen:** Logische Entscheidungen mit `if`, `else if` und `else`.

---

## 🛠️ Verwendete Werkzeuge

| Werkzeug | Beschreibung |
| :--- | :--- |
| **VS Code** | Der Editor für das Schreiben des Quellcodes. |
| **Terminal** | CLI zum Kompilieren und Ausführen von Programmen. |
| **Compiler (Clang/Make)** | Werkzeug zur Übersetzung von C in Binärcode. |
| **Check50** | Automatisierte Tests von Harvard zur Korrektheit. |
| **Style50** | Tool zur Überprüfung des Programmierstils. |

---

## 📂 Gelöste Aufgaben

### 1. Hello / Me
Ein einfaches Programm, das den Benutzer nach seinem Namen fragt und eine personalisierte Begrüßung ausgibt.
* **Konzepte:** `get_string`, `printf`, Platzhalter (`%s`).

### 2. Mario (Piramiden)
Erstellung einer Treppe aus `#` Zeichen, ähnlich wie im Spiel Super Mario.
* **Herausforderung:** Verschachtelte Schleifen (**Nested Loops**), um Zeilen und Spalten zu steuern.

### 3. Cash / Credit
Ein Programm, das berechnet, wie viele Münzen für ein Wechselgeld benötigt werden (Gieriger Algorithmus).
* **Wichtig:** Umgang mit **Floating-Point Imprecision** (Gleitkomma-Ungenauigkeit).

---
### 3. Eigenes Projekt: Logik-Erweiterung (In Arbeit 🛠️)
Basierend auf der Mario-Aufgabe entwickle ich aktuell eine eigene Variante, die über die Standard-Pyramide hinausgeht. 
* **Ziel:** Anwendung von verschachtelten Schleifen auf komplexere Muster.
* **Fokus:** Vertiefung der Logik hinter Zeilen- und Spalten-Interaktionen in C, um dynamischere Strukturen im Terminal zu erzeugen.
## 🚀 Ausführung der Programme

Um eines der Programme lokal zu testen, verwende die folgenden Befehle im Terminal:

1. Kompilieren:
   ```bash
   make dateiname
