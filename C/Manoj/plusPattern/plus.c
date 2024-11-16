#include <stdio.h>

int main(){

  for(int i = 1; i <= 5; i++){

    for(int j = 1; j<= 5; j++){

      if(j < 3 && i != 3){
        printf("  ");
      }else if(j == 3 && i != 3){
        printf("*");
      }else if(i == 3){
        printf("* * * * *");
        break;
      }
    }

    printf("\n");
  }
}
