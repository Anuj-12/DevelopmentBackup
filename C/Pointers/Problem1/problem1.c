#include <stdio.h>
int main(){

  int num = 1989; // Integer named num is set to 1989
  int *pNum = &num;  // Integer pointer named pNum is set to the address of num

  printf("%u\n", *pNum);  // Print the value at the address stored in pNum
  printf("%u\n", pNum); // Print the value stored in pNum i.e. the address of pNum
 
  return 0;
}
