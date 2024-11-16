#include <stdio.h>

int main(){

  int num, reverse;
  printf("Please enter the desired number : \n");
  scanf("%d", &num);

  reverse = (100 * (num % 10)) + (((num / 10) % 10) * 10) + (num / 100);
  printf("The reversed number is %d\n", reverse);

  return 0;
}
