#include <stdio.h>

void PRIME(int);

int main(){
  int num = 0;
  printf("Please enter a number : \n");
  scanf("%d", &num);
  PRIME(num);
}

void PRIME(int x){
  int count = 0;
  for(int i = 1; i <= x; i++){
    if(x % i == 0){
      count++;
    }
  }

  if(count == 2){
    printf("This number is prime\n");
  }else{
    printf("This number is not prime\n");
  }
}
