#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>
#include <string.h>

char* solution(int a, int b) {
    char* answer = (char*)malloc(4);
	int n = b;
	for(int i = 1; i < a; i++)
	{
		switch (i)
		{
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:	n+=31;	break;
		case 2:	n+=29;	break;
		default: n+=30; break;
		}
	}
	n = n % 7;
	switch (n)
	{
	case 1: strcpy(answer, "FRI"); break;
	case 2: strcpy(answer, "SAT"); break;
	case 3: strcpy(answer, "SUN"); break;
	case 4: strcpy(answer, "MON"); break;
	case 5: strcpy(answer, "TUE"); break;
	case 6: strcpy(answer, "WED"); break;
	case 0: strcpy(answer, "THU"); break;
	default: break;
	}
    return answer;
}
int main()
{
	printf("%s", solution(5, 24));
}