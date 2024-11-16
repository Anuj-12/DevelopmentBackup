#include <stdio.h>

int main(){

  int nm = 4; //nm = maximum number of rows

  for(int n = 1; n <= nm; n++){  //iterate through all the rows

    for(int b = 1; b <= nm - n; b++){  //for blank spaces
      printf(" ");
    }

    for(int s = 1; s <= n; s++){
      printf("* ");
    }

    printf("\n");
  }

  return 0;
}

