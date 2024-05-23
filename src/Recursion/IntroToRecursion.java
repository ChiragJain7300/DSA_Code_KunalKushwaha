package Recursion;

import java.util.Arrays;

public class IntroToRecursion {
    public static void main(String[] args) {
//        printNumbersByRecursion(5);
//        printFibonacciSeries(15);
//        System.out.println(binarySearch(new int[]{-1,0,3,5,9,12}, 9, 0, 5));
//        sumTriangleByIteration(new int[]{1, 2, 3, 4, 5});
//        sumTriangleByRecursion(new int[]{1, 2, 3, 4, 5});
//        convertToDiffBase(25, 2);
//        System.out.println(evenOrOdd(18870));
        System.out.println(hammingWeight(00000000000000000000000000001011));
        System.out.println(Arrays.toString(new int[]{1,2,0,0}));
//        System.out.println((18870 >> 2) << 2);
//        System.out.println(findUnique(new int[]{1,4,8,4,8,5,6,5,6,1,25}));
    }

    private static int hammingWeight(int i) {
        int count = 0;
        return i;
//        while()
    }

    private static int findUnique(int[] nums) {
        int k = 0;
        for (int num : nums) {
            k = k ^ num;
        }
        return k;
    }

    private static String evenOrOdd(int n) {
        if((n & 1) == 1)
            return "odd";
        else
            return "even";
    }

    private static void convertToDiffBase(int n, int base) {
        int newBase = 0;
        while(n != 0){
            int r = n%base;
            newBase = r + newBase * 10;
            n = n/base;
        }
        newBase = reverseInt(newBase);
        System.out.println(newBase);
    }

    private static int reverseInt(int newBase) {
        int rev = 0;
        while(newBase != 0){
            int r = newBase%10;
            rev = r + rev * 10;
            newBase = newBase/10;
        }
        return rev;
    }


    private static void sumTriangleByIteration(int[] nums) {
//        https://www.geeksforgeeks.org/sum-triangle-from-array/
        for (int num : nums) System.out.print(num + " ");
        System.out.println();
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                nums[j] = nums[j] + nums[j+1];
                System.out.print(nums[j] + " ");
            }
            System.out.println();
        }
    }

    private static void printFibonacciSeries(int n) {
        System.out.println( Math.log10(-10) / Math.log10(3));
        for (int i = 0; i <= n; i++) System.out.print(fibonacci(i) + " ");
        System.out.println();
    }
    private static int binarySearch(int[] nums, int target, int s, int e){
        if(s<=e){
            int mid = s+(e-s)/2;
            if(nums[mid] == target)
                return mid;
            else if(target > nums[mid])
                return binarySearch(nums, target, mid+1, e);
            else
                return binarySearch(nums, target, s, mid-1);
        }
        return -1;
    }
    private static int fibonacci(int n) {
        if(n==0 || n==1)
            return n;
        else{
            return (fibonacci(n-1) + fibonacci(n-2));
        }

    }

    private static void printNumbersByRecursion(int i) {
        if(i > 0){
            System.out.print(i + " ");
            printNumbersByRecursion((i-1));
        }
    }
}
