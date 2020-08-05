#include <stdio.h>
#include <stdlib.h>
int main(){
	int n;
	int *count;
	char **str;
	scanf("%d", &n);
	str = malloc(sizeof(char*) * n);
	count = malloc(sizeof(int) * n);
	for(int i = 0; i < n; i++)
	{
		str[i] = malloc(sizeof(char) * 20);
		scanf("%d %s", &count[i], str[i]);
	}
	for(int i = 0; i < n; i++){
		int k = 0;
		while(str[i][k]){
			for(int j = 0; j < count[i]; j++)
				printf("%c", str[i][k]);
			k++;
		}
		printf("\n");
		k = 0;
	}
	return 0;
}