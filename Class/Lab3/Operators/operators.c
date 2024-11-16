#include <stdio.h>

int main(){

  int a = 1234;
  int b = 2;

  int sum = a + b;
  int diff = a - b;
  int mul = a * b;
  int div = a / b;
  int mod = a % b;
  
  printf("Number 1 = %d and Number 2 = %d \n", a, b);
  printf("Number 1 + Number 2 = %d\n",sum);
  printf("Number 1 - Number 2 = %d\n", diff);
  printf("Number 1 * Number 2 = %d\n", mul);
  printf("Number 1 / Number 2 = %d\n", div);
  printf("Number 1 %% Number 2 = %d\n", mod);

  return 0;
}
