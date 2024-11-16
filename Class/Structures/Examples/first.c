#include <stdio.h>

int fun(int*);
int len = 0;

int main(){

  printf("Please enter the size of the array : ");
  scanf("%d", &len);
  int arr[len];

  printf("Please enter the values in the array : \n");
  for(int i = 0; i < len; i++){
    scanf("%d", &arr[i]);
  }

  printf("The second smallest number is : %d\n", fun(arr));

  return 0;
}

int fun(int* arr){

  int small = 0, last = 0;

  for(int i = 0; i < len; i++){
    if(i == 0){
      last = arr[i];
      small = arr[i];
    }

    if(small > arr[i]){
      last = small;
      small = arr[i];
    }
  }

  return last;
}
