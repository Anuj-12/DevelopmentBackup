#include <stdio.h>

int main(){

  int len, item, count = 0;

  // Creating the array
  printf("Enter the length of the array : ");
  scanf("%d", &len);

  if(len <= 0){
    printf("Length must be greater than 0");
    return 0;
  }

  int arr[len];

  printf("Enter the values : ");

  for(int i = 0; i < len; i++){
    scanf("%d", &arr[i]);
  }

  // Linear search
  printf("Enter the value to search : ");
  scanf("%d", &item);

  for(int j = 0; j < len; j++){

    if(arr[j] == item){
      count++;
    }
  }

  if(count > 0){
    printf("Search Successful!\n");
    printf("%d Occurred %d times\n", item, count);
  }else{
    printf("Search Unsuccessful\n");
  }

  return 0;
}
