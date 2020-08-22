#include <stdio.h>

int main(){
	int x, y, w, h;
	scanf("%d%d%d%d", &x, &y, &w, &h);
	int res_x = (x > w - x ? w - x: x);
	int res_y = (y > h - y ? h - y: y);
	printf("%d", res_x > res_y ? res_y : res_x);
	return 0;
}