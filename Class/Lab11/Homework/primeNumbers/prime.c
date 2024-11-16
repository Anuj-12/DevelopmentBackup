#include <stdio.h>

void prime(int);

int main(){
  int num = 0;
  printf("Enter a number : ");
  scanf("%d", &num);
  prime(num);
}

void prime(int x){
  int count = 0;

  for(int i = 1; i <= x; i++){
    for(int j = 1; j <= i; j++){
      //count = (i % j == 0 ? count + 1 : count);
      if(i % j == 0){
        count++;
      }

    }

    if(count == 2){
      printf("%d ", i);
    }

    count = 0;
  }

  printf("\n");
}
