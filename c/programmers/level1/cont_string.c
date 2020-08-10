#include <stdio.h>
#include <stdbool.h>

bool solution(char *s){
	if(!(strlen(s) == 4 || strlen(s) == 6))
		return false;
	for(int i = 0; i < strlen(s); i++)
	{
		if(!(s[i] >= '0' && s[i] <= '9'))
			return false;
	}
	return true;
}
