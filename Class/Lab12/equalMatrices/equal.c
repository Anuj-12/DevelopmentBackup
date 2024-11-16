#include <stdio.h>

int main(){

  int row, col, count = 0;
  printf("Enter no. of rows : ");
  scanf("%d", &row);
  printf("Enter no. of columns : ");
  scanf("%d", &col);

  int mat1[row][col];
  printf("Enter values to the matrix\n");

  for(int i = 0; i < row; i++){
    for(int j = 0; j < col; j++){
      printf("Enter a[%d][%d] value : ", i, j);
      scanf("%d", &mat1[i][j]);
    }
  }

  int mat2[row][col];
  printf("Enter values to the matrix\n");

  for(int i = 0; i < row; i++){
    for(int j = 0; j < col; j++){
      printf("Enter b[%d][%d] value : ", i, j);
      scanf("%d", &mat2[i][j]);
    }
  }

  printf("The given Matrix A is : \n");
  for(int i = 0; i < row; i++){
    for(int j = 0; j < col; j++){
      printf("%d ", mat1[i][j]);
    }
    printf("\n");
  }

  printf("The given Matrix B is : \n");
  for(int i = 0; i < row; i++){
    for(int j = 0; j < col; j++){
      printf("%d ", mat2[i][j]);
    }
    printf("\n");
  }

  for(int i = 0; i < row; i++){
    for(int j = 0; j < col; j++){
      if(mat1[i][j] == mat2[i][j]){
        count++;
      }
    }
  }

  if(count == row * col){
    printf("Matrix A is equal to Matrix B\n");
  }else {
    printf("Matrix A is not equal to Matrix B\n");
  }
}
