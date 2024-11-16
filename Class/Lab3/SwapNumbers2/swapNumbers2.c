#include <stdio.h> 

int main(){

  int a = 123;
  int b = 234;
  int c;

  printf("Before swap : \n");
  printf("\tFirst number = %d\n", a);
  printf("\tSecond number = %d\n", b);

  c = a;
  a = b;
  b = c;

  printf("After swap : \n");
  printf("\tFirst number = %d\n", a);
  printf("\tSecond number = %d\n", b);
  return 0;
}
