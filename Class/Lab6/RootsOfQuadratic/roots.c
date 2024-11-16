#include <stdio.h>
#include <math.h>

int main(){

  float a, b, c, d, r1, r2, r3;

  printf("Please enter the values of a, b and c respectively :\n");
  scanf("%f", &a);
  scanf("%f", &b);
  scanf("%f", &c);

  d = (b * b) - (4 * a * c);
  r1 = -b / (2 * a);

  if(d > 0){
    
    r2 = sqrt(d / (4 * a * a ));
    printf("The roots are real and unequal\n");
    printf("The roots are %.2f and %.2f\n", r1 + r2, r1 - r2);
  } else if(d == 0){

    printf("The roots are real and equal\n");
    printf("The roots are both %.2f\n", r1);
  } else{

    r2 = sqrt(-d / (4 * a * a ));
    printf("The roots are imaginary\n");
    printf("The roots are %.2f + i%.2f and %.2f - i%.2f\n", r1, r2, r1, r2);
  }

  return 0;
}
