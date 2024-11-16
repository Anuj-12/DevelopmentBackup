#include <stdio.h>

int main()
{
  int numbers[2][3];

  for(int i = 0; i < 2; i++){
    for(int j = 0; j < 3; j++){
      numbers[i][j] = i + j;
      printf("%d\n", numbers[i][j]);
    }
  }
  
  return 0;
}
