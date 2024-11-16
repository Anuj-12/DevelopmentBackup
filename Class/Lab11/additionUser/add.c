#include <stdio.h>

void add(int*, int*);

int main(){
  int a = 0, b = 0;
  printf("Enter two numbers : \n");
  scanf("%d",&a);
  scanf("%d",&b);
  add(&a,&b);
}

void add(int *x, int *y){
  printf("The addition of both the numbers is : %d\n", *x + *y);
}
