#include <stdio.h>

int main(){

  int a, i = 1, reverse;
  printf("Please enter the number : ");
  scanf("%d", &a);

  while(a > 0){

    reverse *= 10;
    reverse += (a % 10);
    a /= 10;
  }

  printf("The reversed number is : %d\n", reverse);
}
