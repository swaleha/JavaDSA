/*
 * Time and space complexity: O(n)
 */
public class CheckSortedArray {

    public static boolean isSorted(int arr[], int i){
        //Base case
        if(i == arr.length-1){
            return true;
        }

        if(arr[i] > arr[i+1]) {
            return false;
        }
        return isSorted(arr, i+1);
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        System.out.println("Is array sorted? " + isSorted(arr, 0));
    }
}
