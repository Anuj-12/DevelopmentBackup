public class Main {

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        BinarySearch b = new BinarySearch();
        System.out.println(b.find(array, 8,0,array.length-1));
    }
}
