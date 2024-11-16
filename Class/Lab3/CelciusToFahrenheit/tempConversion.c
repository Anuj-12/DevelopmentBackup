#include <stdio.h>

int main(){

  int c = 32;
  float convertedF = ((9./5.) * c) + 32;
  int f = 128;
  float convertedC = (f - 32) * 5./9.;

  printf("When celsius is %d, fahrenheit is %.2f\n", c, convertedF);
  printf("When fahrenheit is %d, celsius is %.2f\n", f, convertedC);
  
  return 0;
}
