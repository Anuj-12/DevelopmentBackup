#include <stdio.h>

int main(){

  int n, sum;
  printf("Please enter a number : ");
  scanf("%d", &n);

  while(n > 0){

    sum += n%10;
    n/=10;
  }

  printf("The sum is %d\n", sum);

  return 0;
}
