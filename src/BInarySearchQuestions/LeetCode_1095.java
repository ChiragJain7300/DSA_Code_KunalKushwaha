package BInarySearchQuestions;

public class LeetCode_1095 {
    public static int binarySearch(int[] mountainArr, int s, int e, int target)
    {
        while(s <= e)
        {
            int mid = s + (e-s)/2;
            System.out.println(mountainArr[mid]);
            if(mountainArr[mid] == target)
                return mid;
            else if(mountainArr[mid] > target)
                e = mid-1;
            else
                s = mid+1;
        }
        return -1;
    }
    public static int peakValue(int[] mountainArr)
    {
        int s  = 0;
        int e = mountainArr.length - 1;
        while(s < e)
        {
            int mid = s + (e-s)/2;
            if(mountainArr[mid + 1] > mountainArr[mid] )
                s = mid +1;
            else
                e = mid;


        }
        System.out.println(e);
        return e;
    }
    public static int findInMountainArray(int target, int[] mountainArr) {
        int pI = peakValue(mountainArr);
        if(target == mountainArr[pI])
            return pI;
//        if(binarySearch(mountainArr, 0, pI, target) != -1)
//            return binarySearch(mountainArr, 0, pI, targ[1,5,2]et);
        if(binarySearch(mountainArr, pI + 1, mountainArr.length-1, target) != -1)
            return binarySearch(mountainArr, pI + 1, mountainArr.length-1, target);
        return -1;
    }
    public static void main(String[] args) {
//        System.out.println(findInMountainArray(2,new int[]{1,5,2}));
        int[] arr = {0,5,3,1};
        System.out.println(binarySearch(arr, 2, 3, 1));
    }
}
