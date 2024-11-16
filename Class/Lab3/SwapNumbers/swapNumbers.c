#include <stdio.h>

int main(){

  int a = 2;
  int b = 3;

  printf("The first number is %d and the second number is %d \n", a, b);

  a = a + b;
  b = a - b;
  a = a - b;

  printf("After swapping the first number is %d and the second number is %d \n", a, b);

  return 0;
}
