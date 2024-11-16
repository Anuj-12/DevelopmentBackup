#include <stdio.h>

void swap(int*, int*);

int main(){
  int a, b;
  printf("Enter two numbers a and b: \n");
  scanf("%d", &a);
  scanf("%d", &b);
  swap(&a, &b);
  printf("a = %d, b = %d\n", a, b);
}

void swap(int *x, int *y){
  *x = *x + *y;
  *y = *x - *y;
  *x = *x - *y;
}
