public class BinarySearch {

    public int find(int[] arr, int item, int left, int right){

        //Search miss
        if(left>right) return -1;

        int middleIndex = (right + left) / 2;

        if(item == arr[middleIndex]) return middleIndex;

        if(item < arr[middleIndex]){
            return find(arr, item, left, middleIndex-1);
        } else{
            return find(arr, item, middleIndex+1, right);
        }
    }
}
