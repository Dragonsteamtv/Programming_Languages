#include <stdio.h>

main()
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
    celcius = lower;
    printf("\n%6s\t%3s\n", "Celcius", "Fahr");
    while(celcius <= upper) {
        fahr = 1.800 * celcius + 32;
        printf("%6.0f\t%3.0f\n", celcius,fahr);
        celcius = celcius + step;
    }

    // for Statement (1.3)
    int fahr2;
    printf("\n%3s\t%6s\t%6s\n", "Fahr", "Celcius", ">for loop" );
    for(fahr2 = 0; fahr2 <= 300; fahr2 = fahr2+20)
        printf("%3d\t%6.1f\n", fahr2, (5.0/9.0)*(fahr2-32));

    printf("\n%3s\t%6s\t%6s\n", "Fahr", "Celcius", ">for loop modified" );
    for(fahr2 = 300; fahr2 >= 0; fahr2 = fahr2-20)
        printf("%3d\t%6.1f\n", fahr2, (5.0/9.0)*(fahr2-32));
    
    // Symbolic constants 
    // example:
    #define LOWER 0
    #define UPPER 300
    #define STEP 20
    printf("\n%3s\t%6s\t%6s\n", "Fahr", "Celcius", ">symbolic constants" );
    for(fahr2 = LOWER; fahr2 <= UPPER; fahr2 = fahr2+STEP)
        printf("%3d\t%6.1f\n", fahr2, (5.0/9.0)*(fahr2-32));

    //file copying 1.5.1
    /* copy input to ouput; ver 1 */
    printf("copy input to ouput; ver 1 ");
    int c;

    c = getchar();
    while(c != EOF){
        putchar(c);
        c = getchar();
    }

    printf("copy input to ouput; ver 2 ");
    while ((c =getchar()) != EOF){
        putchar(c);
    }
    //exercise 1-6
    while (c = getchar() != EOF){
        putchar(c);
    }

    //1.5.2 charachter counting
    /*count charachters in input; 1st version*/
    long nc; // at least 32 bits - max : 32767

    nc = 0;
    while(getchar() != EOF){
        ++nc; //increments var +1
    }
    printf("%ld\n", nc); //%ld = long integer

    double nc2; // double increases the storage space  

    for(nc2 = 0; getchar() != EOF; ++nc2);
    printf("%.0f\n", nc2); //%.0f supresses the . and decimal points
*/
    int c3, nl;

    nl = 0;
    while ((c3 = getchar()) != EOF)
        if (c3 == `\n`) // if statement controls the increment of nl | == checks if statment is equal
                        // the `` represent an integer value = to numerical value of the charachter
                        //
            ++nl;
    printf("%d\n", nl); //

}