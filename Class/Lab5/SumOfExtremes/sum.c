#include <stdio.h>

int main(){

  int num, sum;

  printf("Please enter a six digit number :\n");
  scanf("%d", &num);

  sum += (num % 10) + (num / 100000);
  printf("The sum of extremes of %d is %d\n", num, sum);

  return 0;
}
