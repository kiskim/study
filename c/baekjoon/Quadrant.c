#include <stdio.h>

int main (void)
{
    int a, b;
    scanf("%d %d", &a, &b);
    char c = a > 0 ? (b > 0 ? '1' : '4') : (b > 0 ? '2' : '3');
    printf("%c", c);
    return 0;

}