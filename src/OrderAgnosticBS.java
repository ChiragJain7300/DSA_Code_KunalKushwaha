public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {12, 16, 20, 40, 50, 70, 99, 125, 135,178};
        int n=178;
        int index = orderAgnosticBS(arr, n);
        System.out.println("The index is: "+index);
        ArraylistDemo.reverseArray(arr);
        index = orderAgnosticBS(arr, n);
        System.out.println("The index is: "+index);

    }

    static int orderAgnosticBS(int[] arr, int n) {
        int s=0;
        int e=arr.length-1;
        boolean isAsc = arr[e] > arr[s];
        while(s<=e)
        {
            int mid = s + (e-s)/2;
            if(arr[mid] == n)
                return mid;
            if(isAsc)
            {
                if(n > arr[mid])
                    s = mid+1;
                else
                    e = mid-1;
            }
            else{
                if(n > arr[mid])
                    e = mid-1;
                else
                    s = mid+1;
            }

        }
        return -1;
    }
}
