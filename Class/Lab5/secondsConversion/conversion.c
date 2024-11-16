#include <stdio.h>

int main(){
  
  int seconds, secondsLeft, hours, minutes;
  printf("Please enter the amount of seconds : \n");
  scanf("%d", &seconds);

  hours = seconds / 3600;
  minutes = (seconds % 3600) / 60;
  secondsLeft = (seconds % 3600) % 60;

  printf("%d seconds = %d hours, %d minutes and %d seconds\n", seconds, hours, minutes, secondsLeft);

  return 0;
}
