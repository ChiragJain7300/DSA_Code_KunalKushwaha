import java.util.ArrayList;
import java.util.Scanner;

public class ArraylistDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <Integer> arr = new ArrayList<Integer>(10);
        for (int i = 0; i < 4; i++) {
            arr.add(sc.nextInt());
        }


//        Multi Dimensional Array
        ArrayList<ArrayList<Integer>> list  = new ArrayList<>();

//        Initializing the three new list
        for (int i = 0; i <3 ; i++) {
            list.add(new ArrayList<>());
        }

//        max number from the arraylist
        System.out.println("The greatest number in the list is: " +max(arr));

//        Reverse the list
        System.out.println(arr);
        reverseList(arr);
        System.out.println(arr);
        
    }

    static void reverseList(ArrayList<Integer> arr) {
        int len = arr.size();
        for (int i = 0; i < len/2; i++) {
            int temp = arr.get(i);
            arr.set(i,arr.get(len - i - 1));
            arr.set(len - i - 1, temp);
        }
    }
    static void reverseArray(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len/2; i++) {
            int temp = arr[i];
            arr[i] = arr[len - i - 1];
            arr[len - i - 1] = temp;
        }
    }

    static int max(ArrayList<Integer> arr) {
        int max = arr.get(0);
        for (Integer integer : arr) {
            if (integer > max)
                max = integer;
        }
        return max;
    }
}
