import java.util.Arrays;
import java.util.Scanner;

public class varArgsAndArrays {
    public static void fun(int a, int b, float ...f)
    {
        System.out.println("The integer values are " + a + ", "+ b );
        System.out.println("The varArgs values " + f[0]+ ", "+f[1]+ ", "+f[2]+ ", "+f[3]);
    }
    public static void main(String[] args) {
//        VarArgs or Variable_Arguments as the name suggests are used when there are variable number of variable arguments
//        fun(10,15, 15,2.56f,48.65f,12.663f);

        Scanner sc = new Scanner(System.in);
//        Arrays are a collection of similar type of data (i.e. same datatype)
        int[] arr = {52,15,26,7,3,2012};
        System.out.println(Arrays.toString(arr));

//        Changing the values of arrays through a function as in case of arrays the object is passed through a function and not the value of the reference variable
        changeArr(arr);
//        2d Arrays
        int[][] arr2D = {{3,4,5},{5,12,13},{7,24,25}};
        int[][] UnevenArr2D = new int[4][3]; //        mxn array (m!=n)
        System.out.println(Arrays.toString(arr2D[0]));
//        System.out.println(Arrays.toString(arr2D[1]));
//        System.out.println(Arrays.toString(arr2D[2]));
        for (int[] ar: arr2D) {
            System.out.print(Arrays.toString(ar)+" ");
        }
        System.out.println("");

//        Taking Input for mxn array (m!=n)
        for (int i = 0; i < UnevenArr2D.length; i++) {
            for (int j = 0; j < UnevenArr2D[i].length; j++) {
                UnevenArr2D[i][j] = sc.nextInt();
            }
        }

        for (int[] ar: UnevenArr2D) {
            System.out.println(Arrays.toString(ar)+" ");
        }

//    reverse an array
        int[] newArr = {1,3,6,9};
        System.out.println(Arrays.toString(newArr));
        reverseArr(newArr);
        System.out.println(Arrays.toString(newArr));


            


    }

    private static void reverseArr(int[] newArr) {
        for (int i = 0; i < newArr.length/2 ; i++) {
            int temp = newArr[i];
            newArr[i] = newArr[newArr.length - i -1];
            newArr[newArr.length - i -1] = temp;
        }
    }

    private static void changeArr(int[] arr) {
        arr[0] = 50;
        System.out.println(Arrays.toString(arr));
    }

}
