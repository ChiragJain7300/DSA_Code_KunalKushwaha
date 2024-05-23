package KunalKAssignment;

import java.util.ArrayList;
import java.util.Scanner;

public class Assignment03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        factors(sc);
        sumandMaxTIllZero(sc);
    }

    private static void sumandMaxTIllZero(Scanner sc) {
        int input=1,sum=0,maxInput=Integer.MIN_VALUE;
        while(input!=0)
        {
            input = sc.nextInt();
            sum+=input;
            if(input>maxInput)
                maxInput=input;

        }
        System.out.println("sum: "+sum+" max: "+maxInput);



    }

    private static void factors(Scanner sc) {
        System.out.println("Enter the number");
        int num = sc.nextInt();
        ArrayList<Integer> factors  = new ArrayList<>();
        for (int i = 1; i <= num/2; i++) {
            if(num%i == 0)
                factors.add(i);
        }
        factors.add(num);
        System.out.println("The factors are: "+factors);
    }
}
