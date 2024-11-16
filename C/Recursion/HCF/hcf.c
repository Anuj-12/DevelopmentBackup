#include <stdio.h>

int hcf(int, int);

int main(){
  
  int n1 = 0, n2 = 0;
  printf("Enter both the numbers : \n");
  scanf("%d", &n1);
  scanf("%d", &n2);

  printf("The HCF is %d\n", hcf(n1, n2));
}

int hcf(int a, int b){

  if(a % b == 0) return b;

  return hcf(b, a % b);
}
