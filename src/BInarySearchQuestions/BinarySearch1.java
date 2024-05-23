package BInarySearchQuestions;

public class BinarySearch1 {
    public static void main(String[] args) {
//        int[] arr = {999, 2,3,5,9,14,16,18,69,89,129, 269,276,325,350, 352, 455, 500, 666, 777, 779, 781, 800, 825, 850, 888, 889, 900, 925, 950, 960, 970, 980, 990};
        int[] arr = {4,5,6,7,0,1,2};
//        int[] arr = {7, 9, 11, 12, 5};
        int target=999;
//        System.out.println(ceiling(arr, 1));
//        System.out.println(floor(arr, target));
//        System.out.println(floor2(arr, target));
//        System.out.println(bS(arr, target));

//        System.out.println(searchInInfiniteArr(arr, target));
        System.out.println(rotationCount(arr));

    }

    private static int rotationCount(int[] arr) {
        int s = 0;
        int e = arr.length - 1;
        while(s <= e)
        {
            int mid = s + (e-s)/2;
            if(mid < e && arr[mid+1] < arr[mid])
                return mid+1;
            if(mid > s && arr[mid-1] > arr[mid])
                return mid;
            if(arr[mid] >= arr[s])
                s = mid+1;
            else
                e = mid-1;

        }
        return 0;
    }

    private static int searchInInfiniteArr(int[] arr, int target) {
        int index = -1;
        int s = 0;
        int e = 1;
        while(target > arr[e]){
            int newS = e + 1;

             e = e + (e-s+1) * 2;
             s = newS;
        }

        return binarySearchInf(arr, target, s, e);
    }

    private static int binarySearchInf(int[] arr, int target, int s, int e) {
        int mid = -1;
        while(s <= e){
            mid = (s + e)/ 2;
            if(arr[mid] == target)
                return mid;
            else {
                if(arr[mid] > target)
                    e = mid-1;
                else
                    s = mid+1;
            }
        }
        return mid;

    }

    private static int floor2(int[] arr, int target) {
        int s = 0;
        int e = arr.length - 1;

        while(s<e){
            int mid = s + (e-s)/2;
            if(arr[mid] > target)
                e = mid - 1;
            else
                s = mid + 1;


        }
        return arr[s];
    }

    private static int bS(int[] arr, int target) {
        int s = 0;
        int e = arr.length - 1;
        int mid;

        while(s <= e){
            mid = (s + e)/ 2;
            if(arr[mid] == target)
                return mid;
            else {
                if(arr[mid] > target)
                    e = mid-1;
                else
                    s = mid+1;
            }
        }

        return -1;

    }

//    works only if the sorted array does not have repetition
    private static int floor(int[] arr, int target) {
        int s = 0;
        int e = arr.length - 1;
        if(target >= arr[e])
            return -1;
        int ceil = Integer.MAX_VALUE;
        while(s <= e)
        {
            int mid = s + (e-s)/2;
                if(arr[mid] == target)
                    return arr[mid + 1];
                else if(arr[mid] < target)
                    s = mid + 1;
                else{
                    e = mid - 1;
                    if(arr[mid] < ceil)
                        ceil = arr[mid];
                }
        }
        return ceil;
    }
    private static int ceiling(int[] arr, int target) {
        int s = 0;
        int e = arr.length - 1;
        int floor = Integer.MIN_VALUE;
        while(s <= e)
        {
            int mid = s + (e-s)/2;
            if(arr[mid] == target)
                return arr[mid];
            else
            {
                if(arr[mid] < target)
                {
                    s = mid + 1;
                    if(arr[mid] > floor)
                        floor = arr[mid];
                }
                else
                    e = mid - 1;

            }
        }
        return floor;
    }
}
