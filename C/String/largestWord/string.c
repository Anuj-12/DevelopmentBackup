#include <stdio.h>
#include <string.h>

int main(){

  char str[100] = "Hello world\0";
  int count = 0, last = 0, pos = 0;

  for(int i = 0; i < strlen(str) + 1; i++){

    if(str[i] != '\0' && str[i] != ' ' && str[i] != '\n'){
      count++;
      printf("%d\n", count);
    }else{
      if(last < count){
        last = count;
        pos = i - last;
      }
      count = 0;
    }
  }

  printf("Position = %d\n", pos);
  printf("Length = %d\n", last);
  printf("The largest word is : ");
  for(int j = pos; j <= last + pos; j++){
    printf("%c", str[j]);
  }
  printf("\n");

  return 0;
}
