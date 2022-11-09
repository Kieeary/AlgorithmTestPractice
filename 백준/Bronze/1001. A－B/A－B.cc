#include<stdio.h>

int main() {
	int a, b;
	scanf("%d %d", &a, &b);
	if (a > 0) {
		if (b < 10) {
			printf("%d", a - b);
		}
		else
			printf("b가 10이상의 숫자입니다.");
	}
	else("a가 음수입니다.");
	
}