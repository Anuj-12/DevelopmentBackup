//CALCULATOR

#include <stdio.h>

int main(){

  float a, b;
  char op;

  printf("Enter two numbers : \n");
  scanf("%f", &a);
  scanf("%f", &b);

  printf("Please select an operation from the menu : \n A for Addition\n S for Subtraction\n M for Multiplication\n D for Divison\n");
  scanf(" %c", &op);

  switch(op){
    case 'A' : printf("The sum is %.2f\n", a + b);
      break;
    case 'S' : printf("The difference is %.2f\n", a - b);
      break;
    case 'M' : printf("The product is %.2f\n", a * b);
      break;
    case 'D' : printf("The quotient is %.2f\n", a / b);
      break;
    default : printf("Please enter a valid character\n"); 
  }

  return 0;
}
