#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
int main(){
	int a, c = 0;
	int *list;
	scanf("%d", &a);
	list = (int*)malloc(sizeof(int) * a);
	int temp = a;
	for(int j = 0; j <temp; j++)
		scanf("%d", &list[j]); 
		
	for(int i = 0; i < temp; i++)
	{
		bool flag = list[i] > 1? true : false;
		for(int j = 2; j <= list[i] / 2; j++){
			if(list[i] % j == 0)
			{
				flag = false;
				break;
			} 
		}
		c += flag ? 1:0;
	}
	printf("%d", c);
	return 0;
}