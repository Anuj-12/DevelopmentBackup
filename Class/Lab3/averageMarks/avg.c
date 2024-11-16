#include <stdio.h>

int main(){

  int n1 = 160;
  int n2 = 170;
  int n3 = 165;
  int n4 = 180;
  int n5 = 185;
  float avg = (n1 + n2 + n3 + n4 + n5) / 5;
  float percent = (avg / 200) * 100 ;

  printf("The average marks obtained is %.2f\n", avg);
  printf("The percentage obtained is %.2f%%\n", percent);

  return 0;
}
