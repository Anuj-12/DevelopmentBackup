#include <stdio.h>

int main(){

  int a, b, largest;
  
  printf("Please enter two numbers : \n");
  scanf("%d", &a);
  scanf("%d", &b);

  largest = b;

  if(a > b){
    largest = a;
  }

  printf("The largest number is %d\n", largest);
  return 0;
}
