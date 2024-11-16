#include <stdio.h>

int main(){

  int num, sum;

  printf("Please enter a three digit number : ");
  scanf("%d", &num);

  sum += (num % 10) + ((num / 10) % 10) + (num / 100);
  printf("The sum of all the digits of %d is %d\n", num, sum);

  return 0;
}
