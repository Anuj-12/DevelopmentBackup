#include <stdio.h>

int main(){

  int len;

  // Creating the array
  printf("Enter the length of the array : ");
  scanf("%d", &len);

  if(len <= 0){
    printf("The array length must be greater than 0\n");
    return 0;
  }
  int arr[len];

  printf("Enter the values : ");

  for(int i = 0; i < len; i++){
    scanf("%d", &arr[i]);
  }

  // Printing the reverse of the array
  for(int k = len - 1; k >= 0; k--){
    printf("%d ", arr[k]);
  }
  printf("\n");

  return 0;
}
