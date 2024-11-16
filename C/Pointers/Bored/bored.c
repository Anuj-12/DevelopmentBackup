#include <stdio.h>

int node(int value);
int append(int value)

int *next = NULL;
int tail = 0, head = 0;

int main(){
  int *next = NULL;
  printf("%d\n", node(5));
  return 0;
}

// Node
int node(int value){
  int head = node(value);
  int tail = node(value);
  return value;
}

int append(int value){
  int val = node(value);

  if(tail == NULL){
    tail = val;
    head = val;
  }else {
    next = &node(value);
    
  }
}
