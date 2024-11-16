#include <stdio.h>

int main(){
  int mat1[3][3];
  int mat2[3][3];
  int mul[3][3];
  int sum = 0;

  printf("Enter values for matrix A\n");
  for(int i = 0; i < 3; i++){
    for(int j = 0; j < 3; j++){
      scanf("%d", &mat1[i][j]);
    }
  }

  printf("Enter values for matrix B\n");
  for(int i = 0; i < 3; i++){
    for(int j = 0; j < 3; j++){
      scanf("%d", &mat2[i][j]);
    }
  }

  for(int i = 0; i < 3; i++){   //Iterate through the rows
    for(int j = 0; j < 3; j++){   //Iterate through the columns
      for(int k = 0; k < 3; k++){   //Iterate through the elements
        sum += mat1[i][k] * mat2[k][j];
        mul[i][j] = sum;
      }

      sum = 0;
    }
  }

  printf("After multiplication the resultant matrix is : \n");
  for(int i = 0; i < 3; i++){
    for(int j = 0; j < 3; j++){
      printf("%d ", mul[i][j]);
    }
    printf("\n");
  }

  return 0;
}
