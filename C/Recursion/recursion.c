#include <stdio.h>

long factorial(int, long);

int main(){
  factorial(5,1);
}

long factorial(int n, long acc){

  if(n == 0){
    printf("Base Case %d\n", acc);
    return acc;
  }

  printf("Before recursion n=%d\n", n);
  acc = factorial(n-1, n * acc);
  printf("After recursion n=%d\n", acc);
  return acc;
}
