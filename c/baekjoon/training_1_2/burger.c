#include <stdio.h>

int main()
{
    int a = 2000, b, c;;
    int temp;
    for(int i = 0; i < 3; i++)
    {
        scanf("%d", &temp);
        a = a > temp ? temp : a;
    }
    scanf("%d %d", &b, &c);
    printf("%d", a + (b > c ? c : b) - 50);
    return 0;
}