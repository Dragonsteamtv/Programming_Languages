#include <stdio.h>

main () 
{
    // Temperature conversion with while
    float fahr, celcius;
    int lower, upper, step;

    lower = 0; 
    upper = 300; 
    step = 20;
    fahr = lower;
    printf("%3s\t%6s\n", "Fahr", "Celcius");
    while (fahr <= upper) {
        celcius = (5.0/9.0) * (fahr-32);
        printf("%3.0f\t%6.1f\n", fahr,celcius);
        fahr = fahr + step;
    }
    // Excercise 1-4 reverse table + 1-3 extra heading
    celcius = lower;
    printf("\nCelcius to fahr converter""\n%6s\t%3s\n", "Celcius", "Fahr");
    while(celcius <= upper) {
        fahr = 1.800 * celcius + 32;
        printf("%6.0f\t%3.0f\n", celcius,fahr);
        celcius = celcius + step;
    }
}