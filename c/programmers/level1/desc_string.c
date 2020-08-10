#include <stdio.h>
#include <string.h>
#include <stdlib.h>
char *solution(char *s)
{
	int len = strlen(s);
	char temp;
	char *answer = malloc(sizeof(char) * len) + 1;
	strcpy(answer, s);
	for(int i = 0; i < len - 1; i++)
	{
		for(int j = i; j < len; j++)
		{
			if(answer[i] < answer[j] && answer[i] != '\0')
			{
				//printf("%c %c\n", answer[i], answer[j]);
				temp = answer[i];
				answer[i] = answer[j];
				answer[j] = temp;
			}
		}
	}
	return answer;
}

int main()
{
	char *s = solution("Zbcdefg");
	printf("%s", s);
	return 0;
}