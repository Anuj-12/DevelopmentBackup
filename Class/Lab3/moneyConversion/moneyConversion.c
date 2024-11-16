#include <stdio.h>

int main(){

  int paise = 1234;
  int rupee = paise / 100;
  int decimalRupee = paise % 100;

  printf("If the amount of paise is %d rupee is %d.%d\n", paise, rupee, decimalRupee);

  return 0;
}
