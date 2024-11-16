// Less fun grading system
#include <stdio.h>

int main(){

  int marks;

  printf("Please enter the marks secured by the student : ");
  scanf("%d", &marks);

  printf("Secured grade is ");
  if(marks >= 90 && marks <= 100){
    printf("O\n");
  }
  
  if(marks >=  80 && marks <= 89){
    printf("E\n");
  }
  
  if(marks >= 70 && marks <= 79){
    printf("A\n");
  }
  
  if(marks >= 60 && marks <= 69){
    printf("B\n");
  }
  
  if(marks >= 50 && marks <= 59){
    printf("C\n");
  }

  if(marks >= 40 & marks <= 49){
    printf("D\n");
  }

  if(marks < 40){
    printf("F\n");
  }

  return 0;
}
