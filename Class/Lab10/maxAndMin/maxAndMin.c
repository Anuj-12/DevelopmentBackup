#include <stdio.h>

int main(){

  int min, max, len;

  //Creating the array
  printf("Please enter the length of the array : ");
  scanf("%d", &len);

  int arr[len];

  printf("Please enter the values in the array : ");

  for(int i = 0; i < len; i++){
    scanf("%d", &arr[i]);
  }

  //Initializing both the values as the first element to set the basis for comparision
  min = arr[0];
  max = arr[0];

  //Finding the max and min
  for(int j = 1; j < len; j++){   //Loop starts from 1 bcz 0 is already used to initialize

    if(arr[j] < min){
      min = arr[j];
    }else if(arr[j] >= max){
      max = arr[j];
    }
  }

  printf("The maximum value is : %d\n", max);
  printf("The minimum value is : %d\n", min);

  return 0;
}
