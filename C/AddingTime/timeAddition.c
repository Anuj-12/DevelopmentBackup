#include <stdio.h>

int main(){

  int h1,m1,s1;
  int h2,m2,s2;

  printf("Please enter the time in hh:mm:ss format : \n");
  scanf("%d:%d:%d",&h1, &m1, &s1);
  scanf("%d:%d:%d", &h2, &m2, &s2);

  printf("The sum of both the times given is \n");
  printf("%d:%d:%d", h2 + h1, m1 + m2, s1 + s2);

  return 0;
}
