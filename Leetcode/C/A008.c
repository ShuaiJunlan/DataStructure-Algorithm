#include<limits.h>
int myAtoi(char* str) {
    //int length = sizeof(*str) / sizeof(char);
    //  check the length
    //int index = 0;
    //  skip the blank character
    while(*str == ' ')
    {
        str++;
    }
    int is_positive = 1;
    if(*str == '+' || *str == '-')
    {
        is_positive = (*str == '-' ? 0 : 1);
        str++;
    }
    long num = 0;
    while(*str >= '0' && *str <= '9')
    {
        int digit = *str - '0';
        num = num * 10 + digit;
        if(INT_MAX < num)
        {
            return is_positive ? INT_MAX : INT_MIN;
        }
        str++;
    }
    return num * (is_positive ? 1 : -1);
}
