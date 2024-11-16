#include <stdio.h>

int main(){

  int n;
  printf("Please enter a number : ");
  scanf("%d",&n);

  for(n; n >= 1; n--){

    printf("%d\n",n);
  }
  
  return 0;
}
