#include <stdio.h>
#include <math.h>

int main(){

  float a, b, c, d, r1, r2;
  int state;

  printf("Please enter the values of a, b and c respectively : ");
  scanf("%f %f %f", &a, &b, &c);
  
  d = (b * b) - (4 * a * c);
  r1 = -b / (2 * a);
  
  state == (d == 0) ? 1 : ((d > 0) ? 1 : 2);

  switch(state){
    
    case 0 :
      d = -d;
      r2 = sqrt(d / ( 4 * a * a));
      printf("The roots are imaginary\nThey are %.2f + i%.2f and %.2f - i%.2f\n",r1, r2, r1, r2);
      break;
    case 1 : 
      r2 = sqrt(d / (4 * a * a));
      printf("The roots are real and unequal\nThey are %.2f and %.2f\n", r1 + r2, r1 - r2);
      break;
    default: printf("The roots are real and equal\nThey are both %.2f\n", r1);
  }
}
