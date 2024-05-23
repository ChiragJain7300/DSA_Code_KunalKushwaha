public class SortingAlgos {
    public static void main(String[] args) {
        int[] targetArr2 = {18,-7,19,63,15,25,-78,14,55,10,3,-59};
        int[] targetArr = {0, 23, 14, 12, 9};
        int[] targetArr3 = {4,2,1,7,3,3,2,8};
        int[] targetArr4 = {1};
//        int[] targetArr2 = {14, 12};
//        printArr(targetArr2);
//        printArr(bubbleSort(targetArr2));

//        printArr(targetArr);
//        printArr(selectionSort(targetArr));

//        printArr(targetArr2);
//        printArr(insertionSort(targetArr2));

        printArr(targetArr4);
//        printArr(cycleSort(targetArr3));
        printArr(sort(targetArr4));
    }
    public static int[] sort(int[] nums)
    {
//        3,4,-1,1
        int n = nums.length;
        int i=0;
        while(i<n){
            int correct = nums[i]  - 1;
            if(correct>=0 && correct < n && nums[correct] != nums[i] )
                swap(nums, correct, i);
            else
                i++;
        }
        return nums;
    }
    private static int[] cycleSort(int[] arr){
        int l = arr.length;
        int i=0;
        while(i<l){
            if(arr[i] != i+1)
                swap(arr, i, arr[i] - 1);
            i++;
        }
        return arr;
    }
    private static int[] insertionSort(int[] targetArr) {
        for (int i = 1; i < targetArr.length; i++) {
            for (int j = i; j > 0; j--) {
                if(targetArr[j] < targetArr[j-1])
                    swap(targetArr, j-1, j);
                else
                    break;
            }
        }
        return targetArr;
    }

    private static int[] selectionSort(int[] targetArr) {
        for (int i = 0; i < targetArr.length; i++) {
            int maxIndex = getMaxIndex(targetArr, targetArr.length - i - 1);
            swap(targetArr, maxIndex, targetArr.length - i - 1);
        }
        return targetArr;
    }

    private static int getMaxIndex(int[] targetArr, int last) {
        int maxIndex = 0;
        for (int i = 1; i <= last; i++) {
            if(targetArr[i] > targetArr[maxIndex])
                maxIndex = i;
        }
        return maxIndex;
    }

    private static void swap(int[] targetArr, int maxIndex, int i) {
        int temp = targetArr[i];
        targetArr[i] = targetArr[maxIndex];
        targetArr[maxIndex] = temp;
    }

    private static void printArr(int[] arr) {
        for (int j : arr) System.out.print(j + " ");
        System.out.println();
    }
    private static int[] bubbleSort(int[] arr) {
//        18,7,19,63,15,25,78,14,55,10,3,59  i(max) = 11
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j+1] < arr[j]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return arr;
    }
}
