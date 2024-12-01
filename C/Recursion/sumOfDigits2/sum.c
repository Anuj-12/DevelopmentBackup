/*Second Sum of Digits*/
#include <stdio.h>

int sum(int, int);

int main(){
  int num = 0;
  printf("Enter a number : ");
  scanf("%d", &num);
  printf("%d\n", sum(num, 0));

  return 0;
}

int sum(int a, int acc){

  if(a / 10 == 0) return acc + a;

  return sum(a/10, acc + (a % 10));
}
