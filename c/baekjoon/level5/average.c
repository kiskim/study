#include <stdio.h>

int main()
{
    int temp;
    int res = 0;
    for(int i = 0; i < 5; i++)
    {
        scanf("%d", &temp);
        res += (temp >= 40 ? temp : 40);
    }
    printf("%d", res / 5);
    return 0;
}