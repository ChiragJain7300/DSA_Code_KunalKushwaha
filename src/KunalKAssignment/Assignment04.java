package KunalKAssignment;

import java.util.ArrayList;
import java.util.Scanner;

public class Assignment04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter three numbers");
//        int num1=sc.nextInt();
//        int num2=sc.nextInt();
//        int num3=sc.nextInt();
//        max(num1,num2,num3);
//        min(num1,num2,num3);

//        System.out.println("Enter the number: ");
//        int n= sc.nextInt();
//        System.out.println(facto(n));
//        facByIteration(n);

//        System.out.println(isHappy(41));

//        double quadRoot = Math.sqrt(Math.sqrt(5764801));
//        System.out.println((Math.log(2048) / Math.log(2)));

//        maxProduct();
        
    }
    public static void maxProduct() {
        int[] nums = new int[] {-100,-98,-1,2,3,4};
        int maxProduct = 1;
        for(int i=0;i<3;i++){
            int max = Integer.MIN_VALUE;
            int maxIndex=-1;
            for(int j = 0; j < nums.length; j++)
            {
                if(nums[j] > max){
                    max=nums[j];
                    maxIndex=j;
                }
            }
            maxProduct *= max;
            System.out.println(max+ "  maxProduct: " + maxProduct);
            nums[maxIndex]=Integer.MIN_VALUE;
        }
    }
    public static boolean isHappy(int n) {
        int happySum = 0;
        boolean isHappy = false;
        while(n!=0)
        {
            int k = n%10;
            happySum += (k*k);
            n=n/10;
        }
        n=happySum;
        int firstHappySum=happySum;
        System.out.println(firstHappySum);
        while(happySum!=1){
            happySum = 0;
            while(n!=0)
            {
                int k = n%10;
                happySum += (k*k);
                n=n/10;
            }
            n=happySum;
            System.out.println(happySum);
            if(happySum == firstHappySum)
                return isHappy;
        }
        isHappy = true;
        return isHappy;

    }
    public static int facto(int n) {
        if(n==0 || n==1) return 1;
        else return n* facto(n-1);

    }
    static void facByIteration(int n){
        int fac=1;
        if(n==0 || n==1)
            System.out.println(fac);
        else
        {
            for(int i=n;i>0;i--) fac *= i;
            System.out.println(fac);
        }

    }

    static void max(int num1, int num2, int num3) {

//        if(num1>num2&&num1>num3) System.out.println(num1+" is max");
//
//        else if (num2>num1&&num2>num3) System.out.println(num2+" is max");
//
//        else System.out.println(num3+" is max");
//        EASIER METHOD
        int max = num1;
        if(num2>max)
            max=num2;
        if(num3>max)
            max=num3;

        System.out.println(max+" is max");
    }

    static void min(int num1, int num2, int num3) {
        int min = num1;
        if(num2<min)
            min=num2;
        if(num3<min)
            min=num3;
        System.out.println(min+" is min");
    }
}
