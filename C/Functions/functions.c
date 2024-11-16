#include <stdio.h>
#include <string.h>

void printline();

int main(){

  printline();
  printf("\nI just printed a line\n");
  printline();

  return 0;
}

void printline() {

  for(int i = 0; i < 40; i++){
    printf("-");
  }
}
