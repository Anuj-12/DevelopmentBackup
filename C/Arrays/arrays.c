#include <stdio.h>

int main()
{
  int numbers[10];  //defines an array of size 10 (integers)
  
  //populate the array
  numbers[0] = 10;
  numbers[1] = 20;
  numbers[2] = 30;
  numbers[3] = 40;
  numbers[4] = 50;
  numbers[5] = 60;
  numbers[6] = 70;
  numbers[7] = 80;
  numbers[8] = 90;
  numbers[9] = 100;

  printf("The 6th element here is : %d\n" , numbers[5]);

  return 0;
}