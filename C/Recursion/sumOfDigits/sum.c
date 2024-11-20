#include <stdio.h>

int add(int, int);

int main(){

  printf("%d\n", add(4552345, 0));
}

int add(int n, int acc){
  
  if(n != 0){
    acc += n % 10;
    return add(n / 10, acc);
  }

  if(n == 0 && acc / 10 != 0) return add(acc / 10, acc % 10);

  return acc;
}
