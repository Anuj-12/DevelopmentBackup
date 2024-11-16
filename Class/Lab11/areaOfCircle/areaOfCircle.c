#include <stdio.h>

void areaOfCircle(float);

int main(){
  float radius;
  printf("Enter the radius of the circle : ");
  scanf("%f", &radius);
  areaOfCircle(radius);

  return 0;
}

void areaOfCircle(float r){
  printf("The area of the circle with radius %f is : %f\n", r, 3.14 * r * r);
  printf("The its perimeter is %f\n", 2 * 3.14 * r);
}
