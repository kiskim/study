#include <stdio.h>
#include <stdlib.h>


char **map = NULL;

void draw_star(int x, int y, int n)
{
	if(n == 1){
		map[x][y] = '*';
		return;
	}
	int m = n / 3;
	for(int i = 0;  i < 3; i++)
	{
		for(int j = 0; j < 3; j++)
		{
			if(i == 1 && j == 1)
				continue;
			draw_star(x + i * m, y + j * m, m);
		}
	}
}

int main(){
	int n;
	scanf("%d", &n);
	map = (char**)malloc(sizeof(char*) * n);
	for(int i = 0; i < n; i++){
		map[i] = (char*)malloc(sizeof(char) * n);
		for(int j = 0; j < n; j++)
			map[i][j] = ' ';
	}
	draw_star(0, 0, n);
	for(int i = 0; i < n; i++)
		printf("%s\n", map[i]);
	return 0;
}