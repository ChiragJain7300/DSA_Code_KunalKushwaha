import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
//        to print all the three digit armstrong numbers
        for (int i = 100; i <= 99999; i++) {
            int k = i;
            int armSum=0;
            while(k!=0){
                int r = k%10;
                armSum += Math.pow(r,3);
                k=k/10;
            }
            if(armSum == i)
                System.out.print(i+", ");
        }

    }
}
