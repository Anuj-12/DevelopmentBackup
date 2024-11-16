#include <stdio.h>

int main(){

  int arr[5] = {1,2,3,0,5};
  int *p = arr;

  printf("%d\n", *p + *(p + 1) + *(p + 2) + *(p + 3) + *(p + 4));
}
