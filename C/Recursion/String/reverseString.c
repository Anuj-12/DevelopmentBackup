#include <stdio.h>
#include <stdlib.h>

void reverse(char*, int n);
int stringlen(char s[], int);
char* stringcat(char s1[], char s2[], int, int);

int main(){

  char str[100];
  char s1[10] = "Hello";
  char s2[10] = " World!";

  printf("Enter the string : ");
  int count = 0;
  do{
    str[count] = getchar();
    count++;

  }while (str[count - 1] != '\n');

  str[count] = '\0';
  printf("The entered string is : %s\n", str);
  printf("It's length is : %d\n", stringlen(str, 0));
  printf("Concatinating s1 and s2 : %s\n", stringcat(s1, s2, 0, 0));

  return 0;
}

void reverse(char* s, int n){

  if(n == stringlen(s, 0) / 2) return;
}

int stringlen(char s[], int i){

  if(s[i] == '\0') return i;

  return stringlen(s, ++i);
}

char* stringcat(char s1[], char s2[], int i, int j){

  int len = stringlen(s1, 0) + stringlen(s2, 0);
  char* cat = malloc(len * sizeof(char));
  if(i+j == len){
    cat[i+j] = '\0';
    return cat;
  }

  if(i <= stringlen(s1, 0)) cat[i] = s1[i];
  else cat[i] = s2[j];


  return stringcat(s1, s2, ++i, ++j);
}
