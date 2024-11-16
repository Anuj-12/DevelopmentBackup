#include <stdio.h>

int main(){

  int metersGiven, kilometers, meters;
  printf("Please enter the distance in meters : ");
  scanf("%d", &metersGiven);
  
  kilometers = metersGiven / 1000;
  meters = metersGiven % 1000;

  printf("%d m = %d Km and %d m\n", metersGiven, kilometers, meters);

  return 0;
}
