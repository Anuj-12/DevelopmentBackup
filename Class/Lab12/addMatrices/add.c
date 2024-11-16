#include <stdio.h>

int main(){
  float mat1[2][2];
  float mat2[2][2];

  printf("Enter the elements of 1st matrix\n");
  for(int i = 0; i <= 1; i++){
    for(int j = 0; j <= 1; j++){
      printf("Enter a%d%d : ", i + 1, j + 1);
      scanf("%f", &mat1[i][j]);
    }
  }

  printf("Enter the elements of 2nd matrix\n");
  for(int i = 0; i <= 1; i++){
    for(int k = 0; k <= 1; k++){
      printf("Enter b%d%d : ", i + 1, k + 1);
      scanf("%f", &mat2[i][k]);
    }
  }

  printf("Sum of Matrices :\n");
  for(int i = 0; i <= 1; i++){
    for(int j = 0; j <= 1; j++){
      printf("%f\t", mat1[i][j] + mat2[i][j]);
    }
    printf("\n");
  }

  return 0;
}
