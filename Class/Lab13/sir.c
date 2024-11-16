#include <stdio.h>
#include <stdlib.h>

int main(){

  int sum = 0, n; int *p; int i; float avg;
  printf("Enter the no of students\n");
  scanf("%d", &n);

  p = (int *)malloc(n * 2);
  for(i = 0; i < n; i++){
    scanf("%d",(p+i));
  }

  for(i = 0; i < n; i++){
    sum = sum + *(p+i);
  }

  avg = sum / n;
  printf("Average = %f\n", avg);
  return 0;
} 
