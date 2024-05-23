public class binarySearchPrac {
    public static void main(String[] args) {
        int[] arr = {4,8,10,15,19,21,25,36};
        int[] revArr = reverseArray(arr);
        int searchQuery = 4;
        printArr(arr);
//        System.out.println("Binary Search: " + binarySearch(arr, searchQuery));
        System.out.println("Order Agnostic: " + orderAgnosticBinarySearch(arr, searchQuery));
    }

    public static void printArr(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    private static int[] reverseArray(int[] arr) {
        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        return arr;
    }

    public static int orderAgnosticBinarySearch(int[] arr, int searchQuery) {
        int s = 0;
        int e = arr.length - 1;
        boolean isAsc = arr[e] > arr[s];

        while(s <= e)
        {
            int mid = s + (e-s)/2;
            if(arr[mid] == searchQuery)
                return mid;
            if(isAsc)
                return binarySearch(arr, searchQuery);
            else{
                if(arr[mid] > searchQuery)
                    s = mid + 1;
                else
                    e = mid - 1;
            }
        }
        return -1;
    }

    private static int binarySearch(int[] arr, int searchQuery) {
        int s = 0;
        int e = arr.length - 1;

        while(s <= e){
            int mid = (s+e) / 2;

            if(arr[mid] == searchQuery)
                return mid;

            if(arr[mid] < searchQuery)
                s = mid + 1;
            else
                e = mid-1;
        }
        return -1;
    }
}
