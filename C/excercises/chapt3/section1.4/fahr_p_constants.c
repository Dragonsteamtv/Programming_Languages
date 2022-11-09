#include <stdio.h>

main() {
// Symbolic constants 
    // example:
    #define LOWER 0
    #define UPPER 300
    #define STEP 20
    int fahr2;
    printf("\n%3s\t%6s\t%6s\n", "Fahr", "Celcius", ">symbolic constants" );
    for(fahr2 = LOWER; fahr2 <= UPPER; fahr2 = fahr2+STEP)
        printf("%3d\t%6.1f\n", fahr2, (5.0/9.0)*(fahr2-32));
}