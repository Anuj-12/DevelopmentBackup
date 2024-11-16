#include <stdio.h>

void fibonacci(int);

int main(){
  int num = 0;
  printf("Enter a number : ");
  scanf("%d", &num);
  fibonacci(num);
}

void fibonacci(int x){
  int f1 = 0, f2 = 1;

  if(x == 1){
    printf("0\n");
    return;
  }else if(x == 2){
    printf("1\n");
    return;
  }

  for(int i = 2; i <= x; i++){
    {
      if(i == x){
        printf("%d\n",f2);
      }
      int temp = f1;
      f1 = f2;
      f2 = f1 + temp;
    }
  }
}
