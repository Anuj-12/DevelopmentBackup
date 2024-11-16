#include <stdio.h>

int main(){

  float cp, sp , mp, disco, loss, margin;

  printf("Please enter the buying price : ");
  scanf("%f", &cp);
  printf("\nPlease enter the marked price : ");
  scanf("%f", &mp);
  printf("\nPlease enter the discount offered : ");
  scanf("%f", &disco);

  sp = mp * (1 - (disco  / 100));
  loss = sp - cp;
  margin = (loss / cp) * 100;

  if(loss < 0){
    margin = -margin;
    printf("The seller made a loss of %.2f%%\n", margin);
  } else {
    printf("The seller made a profit of %.2f%%\n", margin);
  }

  return 0;
}
