#include <stdio.h>

int main(){

  struct book{
    int pages;
    char name[20];
    float price;
  };

  struct book b1, b2, b3;

  printf("Enter the elements one by one ");

  scanf("%d%s%f", &b1.pages, &b1.name, &b1.price);

  printf("%d %s %f", b1.pages, b1.name, b1.price);

  return 0;
}

