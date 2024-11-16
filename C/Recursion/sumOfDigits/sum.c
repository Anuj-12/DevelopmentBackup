#include <stdio.h>

int sum (int, int);

int main(){

  int num = 0;
  printf("Enter the number : ");
  scanf("%d", &num);
  printf("%d\n", sum(num, 0));

  return 0;
}

int sum(int n, int acc){

  if(n / 10 == 0 && acc / 10 == 0) return acc + n;
  if(n / 10 == 0 && acc / 10 != 0) return sum(acc + n, 0);

  int su = acc + (n % 10);
  return sum(n / 10, acc + (n % 10));
}
