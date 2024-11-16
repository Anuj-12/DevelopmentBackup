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

  if(x == 0){
    printf("Number : 0\n");
    printf("Position : 1\n");
    return;
  }else if(x == 1){
    printf("Number : 1\n");
    printf("Position : 2\n");
    return;
  }

  for(int i = 2; f2 <= x; i++){

    if(f2 == x){
      printf("This number is in the fibonacci series :\n");
      printf("  Number : %d \n  Position : %d\n", x, i);
      return;
    }

    int temp = f1;
    f1 = f2;
    f2 = f1 + temp;
  }

  printf("This number is not in the fibonacci series\n");
  return;
}
