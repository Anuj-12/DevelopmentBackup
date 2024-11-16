#include <stdio.h>

void factorial(float);

int main(){
  float num = 0;
  printf("Enter a number : \n");
  scanf("%f", &num);
  factorial(num);
  return 0;
}

void factorial(float x){
  float factorial = 1;

  if(x > 0){
   for(float i = 1; i <= x; i++){
      factorial *= i;
   }
  }

  printf("The factorial of %f is %f\n", x, factorial);
}
