#include <stdio.h>
main()
{
// for Statement (1.3)
    int fahr2;
    printf("\n%3s\t%6s\t%6s\n", "Fahr", "Celcius", ">for loop" );
    for(fahr2 = 0; fahr2 <= 300; fahr2 = fahr2+20)
        printf("%3d\t%6.1f\n", fahr2, (5.0/9.0)*(fahr2-32));

    printf("\n%3s\t%6s\t%6s\n", "Fahr", "Celcius", ">for loop modified" );
    for(fahr2 = 300; fahr2 >= 0; fahr2 = fahr2-20)
        printf("%3d\t%6.1f\n", fahr2, (5.0/9.0)*(fahr2-32));
}