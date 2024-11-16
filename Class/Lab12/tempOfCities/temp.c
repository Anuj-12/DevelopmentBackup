#include <stdio.h>

int main(){
  int cities = 0, days = 0;

  printf("Enter the number of cities : ");
  scanf("%d", &cities);
  printf("\nEnter the number of days : ");
  scanf("%d", &days);

  int arr[cities][days];

  printf("\nEnter the temperature : ");

  for(int i = 0; i < cities; i++){
    for(int j = 0; j < days; j++){
      scanf("%d", &arr[i][j]);
    }
  }

  for(int i = 0; i < cities; i++){
    for(int j = 0; j < days; j++){
      printf("City %d, Day %d = %d\n", i + 1, j + 1, arr[i][j]);
    }
  }

  return 0;
}
