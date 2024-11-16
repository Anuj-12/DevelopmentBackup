#include <stdio.h>

int main(){

  char a;

  printf("Please enter an alphabet : \n");
  scanf("%c", &a);

  if(a >= 'A' && a <= 'Z'){
    printf("You have entered '%c' which is already in uppercase \n", a);
  } else if (a >= 'a' && a <= 'z'){
    printf("The uppercase of the entered letter is '%c'\n", a - 32);
  } else{
    printf("You have not entered an alphabet\n");
  }

  return 0;
}
