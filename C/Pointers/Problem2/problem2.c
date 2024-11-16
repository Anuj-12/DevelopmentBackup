#include <stdio.h>

int main(){

  int num1 = 100;
  int num2 = 200;
  int *pNum1 = &num1;
  int *pNum2 = &num2;

  printf("Addition of pointer variables : %d\n", *pNum1 + *pNum2);
  printf("Division of pointer variables : %d\n", *pNum2 / *pNum1);

  return 0;
}
