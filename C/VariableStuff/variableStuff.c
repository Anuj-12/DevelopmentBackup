#include <stdio.h>

int function1();

int main(){

  int x = 10;
  printf("%d\n", x);

  x = 20;
  printf("%d\n", function1() - x);

  return 0;
}

int function1(){

  int x = 100;

  return x;
}
