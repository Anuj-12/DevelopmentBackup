#include <stdio.h>

int main(){

  for(int i = 1; i <= 4; i++){
    for(int j = 1; j <= 11; j++){

      if(j == 1 || j == 11){
        printf("*");
        continue;
      }

      if(j % 2 == 0){
        printf(" ");
      }else if((i == 1 || i == 4) && j % 2 != 0){
        printf("*");
      }else if((i != 1 || i != 4) && j % 2 == 0){
        printf(" ");
      }else{
        printf(" ");
      }
    }

    printf("\n");
  }

  return 0;
}
