//Sum of upper triangular matrix

#include <stdio.h>

int main(){

  int row, col;
  printf("Enter no. of rows : ");
  scanf("%d", &row);
  printf("Enter no. of columns : ");
  scanf("%d", &col);

  int mat[row][col];
  printf("Enter values to the matrix\n");

  for(int i = 0; i < row; i++){
    for(int j = 0; j < col; j++){
      printf("Enter a[%d][%d] value : ", i, j);
      scanf("%d", &mat[i][j]);
    }
  }

  int sum = 0;

  for(int i = 0; i < row; i++){
    for(int j = i + 1; j < col; j++){
      sum += mat[i][j];
    }
  }

  printf("The given matrix is : \n");
  for(int i = 0; i < row; i++){
    for(int j = 0; j < col; j++){
      printf("%d ", mat[i][j]);
    }
    printf("\n");
  }

  printf("Sum of the upper triangular matrix is : %d\n", sum);

  return 0;
}
