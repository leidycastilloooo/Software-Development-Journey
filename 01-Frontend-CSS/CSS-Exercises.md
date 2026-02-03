# Frontend Design Log
Hier sind meine Zertifikate und Ergebnisse der CSS-Übungen.

---

## 🐸 Flexbox Froggy (Level 24)

![Froggy](main/01-Frontend-CSS/froggy.jpg)

### Lösung:
```css
flex-wrap: wrap-reverse;
flex-direction: column-reverse;
align-content: space-between;
justify-content: center;
```
###  flex-wrap: wrap-reverse: Erlaubt den Elementen, in mehrere Zeilen umzubrechen, aber in umgekehrter Reihenfolge (von unten nach oben).
###  flex-direction: column-reverse: Ändert die Hauptachse auf vertikal und dreht die Reihenfolge der Elemente um.
###  align-content: space-between: Verteilt den Platz zwischen den Zeilen gleichmäßig, sodass die erste und letzte Zeile an den Rändern liegen.
### justify-content: center: Zentriert die Elemente entlang der Hauptachse (hier vertikal).

- Grid Garden
![Garden](WhatsApp%20Image%202026-02-03%20at%208.07.13%20PM.jpeg)

## 🥕 Grid Garden (Level 28)
Der Code:
CSS
```grid-template: 1fr 50px / 1fr 4fr;```

(Erklärung):
### grid-template: Ist eine Kurzschreibweise für Zeilen (rows) und Spalten (columns).
1fr 50px: Definiert zwei Zeilen. Die erste nimmt den restlichen verfügbaren Platz ein (1fr), die zweite ist genau 50px hoch.
1fr 4fr: Definiert zwei Spalten. Die zweite Spalte ist viermal so breit wie der erste.
