#include <stdio.h>

int main(){

  int len, item;

  // Creating the array
  printf("Please enter the length of the array : ");
  scanf("%d", &len);

  int arr[len];

  printf("Please enter the values in the array : ");

  for(int i = 0; i < len; i++){
    scanf("%d", &arr[i]);
  }

  // Linear search
  printf("Please enter the value to be searched : ");
  scanf("%d", &item);

  for(int j = 0; j < len; j++){

    if(arr[j] == item){
      printf("Search Successful\n");
      return 0;
    }
  }

  printf("Search Unsuccessful\n");

  return 0;
}
