import java.util.Arrays;

public class LinearSearchingAlgo {
    public static void main(String[] args) {
//        In Linear searching, we check every element of the array starting from 0th index till the asked element is found
        int[] arr = {1,5,6,9,8,54,25,56,76};
        int n = 76;
        int indexAt[] = linearSearch(arr, n);
        if(indexAt[0]==-1)
            System.out.println("The element is not present");
        System.out.println("The max array: "+ Arrays.toString(indexAt));

    }

    static int[] linearSearch(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == n)
            {
                return (new int[]{i,arr[i]});
            }
        }
        return (new int[]{-1,-1});
    }


}
