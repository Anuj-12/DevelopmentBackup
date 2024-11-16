#include <stdio.h>

int main(){

  int len, check;

  // Defining the array
  printf("Please enter the length of the array : ");
  scanf("%d", &len);

  int arr[len];

  printf("Please enter the values in the array : ");

  for(int j = 0; j < len; j++){
    scanf("%d", &arr[j]);
  }

  // Actual code for sorting
  for(int n = 0; n < len; n++){
    for(int i = 0; i < len - n - 1; i++){
      if(arr[i] > arr[i + 1]){
        int temp = arr[i + 1];
        arr[i + 1] = arr[i];
        arr[i] = temp;
      }
    }
  }

  printf("The array in ascending order is: ");
  for(int j = 0; j < len; j++){
    printf(" %d", arr[j]);
  }
  printf("\n");
}
