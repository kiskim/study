#include <stdio.h>

int main(){
	int a[26], n = 0;
	char input[100];
	scanf("%s", input);
	for(int i = 0; i < 26; i++)
		a[i] = -1;
	while(input[n]){
		a[input[n] - 'a'] = a[input[n] - 'a'] == -1 ? n : a[input[n] - 'a'];
		n++;
	}
	for(int i  = 0; i < 26; i++)
		printf("%d ", a[i]);
	return 0;
}