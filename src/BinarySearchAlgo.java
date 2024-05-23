import java.util.Arrays;

public class BinarySearchAlgo {
    public static void main(String[] args) {
        int[] arr = { 12, 16, 20, 40, 50, 70, 99, 125, 135,178};
        int n=178;
        for (int k: arr) {
            int index = binarySearchByWhile(arr, k);
            System.out.print(index +" ");
        }
        System.out.println();
        int index = binarySearchByIteration(arr, n);
        System.out.println("The index is: "+index);
        index = binarySearchByWhile(arr, n);
        System.out.println("The index through while loop method is: "+index);
        //        int index = binarySearchByRec(arr, n, 0, arr.length-1);
    }

//    static int binarySearchByRec(int[] arr, int target, int start, int end) {
//
//    }
    static int binarySearchByWhile(int[] arr, int n)
    {
        int start =0;
        int end = arr.length - 1;
        while(start<=end)
        {
            int mid = start + (end-start)/2;
            if(arr[mid] == n)
                return mid;
            if(n > arr[mid])
                start = mid+1;
            else
                end = mid-1;
        }
        return -1;
    }

    static int binarySearchByIteration(int[] arr, int n) {
        int len = arr.length;
        int mid, start =0, end=len;
       for (int i = 0; i < len; i++) {             //instead of for loop we are using while because we don't know no. of steps
            mid = start + (end-start)/2;
            if(arr[mid] == n)
                return mid;
            else {
                if(n>arr[mid])
                    start = mid;
                else
                    end = mid;
            }
        }
        return -1;
        
    }
}
