#include<string.h>

char* intToRoman(int num) {
    char *M[10] = {"", "M", "MM", "MMM"};
    char *C[10] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
    char *X[10] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
    char *T[10] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
    char *result = (char*) malloc(sizeof(char)*100);
    strcat(result, M[(num%10000) / 1000]);
    strcat(result, C[(num%1000) / 100]);
    strcat(result, X[(num%100) / 10]);
    strcat(result, T[(num%10) / 1]);

    return result;
}
