//Way to get a string with whitespace as user input

#include <stdio.h>
#include <string.h>

int main(){

  char line[100];
  int count = 0;

  while(line[count-1] != '\n'){
    line[count] = getchar();
    count++;
  }

  printf("The entered string is : \n");
  printf("%s\n", line);
  return 0;
}
