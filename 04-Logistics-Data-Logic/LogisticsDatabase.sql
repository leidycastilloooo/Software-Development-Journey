-- Datenbank-Struktur für Solvares Logistics Simulation
CREATE TABLE Lieferungen (
    Auftragsnummer INT PRIMARY KEY,
    Zielort VARCHAR(100),
    AktuellerStatus VARCHAR(50), -- 'Pending', 'In Transit', 'Delivered'
    FahrerName VARCHAR(100)
);

-- Beispiel-Daten für Hamburg-Bramfeld
INSERT INTO Lieferungen (Auftragsnummer, Zielort, AktuellerStatus, FahrerName)
VALUES (101, 'Hamburg-Bramfeld', 'Pending', 'Leidy Castillo');
