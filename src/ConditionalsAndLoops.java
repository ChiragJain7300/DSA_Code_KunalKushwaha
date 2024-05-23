import java.util.Scanner;

public class ConditionalsAndLoops {
    public static int countSeven(long n)
    {
        int temp;
        int count=0;
        while(n!=0){
            temp = (int) (n%10);
            if(temp == 7 )
                count++;
            n = n/10;
        }
        return count;
    }
    public static int reverse(int n)
    {
        int r=0;
        int t;
        while(n!=0){
            t = n%10;
            r = r*10 + t;
            n = n/10;
        }
        return r;
    }
    public static void main(String[] args) {
//        Find number of times '7' occurs in the number
        Scanner sc = new Scanner(System.in);
//        long n = sc.nextLong();
//
//        System.out.println("The number of '7' in the number are "+countSeven(n));
//        System.out.println("The reverse of the number is "+reverse((int) n));

//        Switch Case demo
        String fruit  = sc.nextLine();
        switch (fruit) {
            case "Apple" -> System.out.println("An Apple a day keeps the doctor away");
            case "Orange" -> System.out.println("Pulpy Orange");
            case "Mango" -> System.out.println("रसीला आम ");
            case "Kiwi" -> System.out.println("Prevent Cancer");
            default -> System.out.println("Worthless Fruits");
        }

    }
}
