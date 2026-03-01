#include <stdio.h>
#include <cs50.h>

int main(void)
{
    // Rennstreckenlänge abfragen
    int distance;
    do
    {
        distance = get_int("Track Distance (5-20): ");
    }
    while (distance < 5 || distance > 20);

    // Step 2:Das Rennen zeichnen
    printf("\nSTART\n");

    for (int i = 0; i < distance; i++)
    {
        // Die Strecke zeichnen
        printf("|");

        // Das Auto an der aktuellen Position
        if (i == (distance / 2))
        {
            printf(" 🏎️  "); // Dein Auto
        }
        else
        {
            printf(" . "); // Leere Strecke
        }

        printf("|\n");
    }

    printf("FINISH\n");
}
