#include <stdio.h>

int main(){

  int number = 376;
  int first = number / 100;
  int second = (number / 10) % 10;
  int third = number % 10;

  printf("%d reversed is %d%d%d\n", number, third, second, first);
}
