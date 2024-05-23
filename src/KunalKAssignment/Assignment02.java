package KunalKAssignment;
import java.util.*;

public class Assignment02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        greeting(sc);
        System.out.println();
        IsOddOrEven(sc);
        simpleInterest(sc);
        MaxNumber(sc);
        Calculator(sc);
        RStoUSD(sc);
        fiboSeries(sc);
        isPalindrome(sc);
        isArmstrong(sc);
    }

    private static void isArmstrong(Scanner sc) {
        System.out.println("Enter number for ARMSTRONG checking: ");
        int num = sc.nextInt();
        int or = num;
        int r=0;
        while(num!=0){
            int  k = num%10;
            r= r + (k*k*k);
            num = num/10;
        }
        if(or == r) System.out.println("ARMSTRONG");
        else System.out.println("not ARMSTRONG");
    }

    private static void isPalindrome(Scanner sc) {
        int reverseNum=0;
        System.out.println("Enter the number for PALINDROME checking: ");
        int Num = sc.nextInt();
        int or = Num;
        while(or!=0){
            int k = or%10;
            reverseNum= reverseNum*10+ k;
            or=or/10;
        }
        if(reverseNum == Num) System.out.println("PALINDROME");
        else System.out.println("not PALINDROME");

    }

    static void fiboSeries(Scanner sc) {
        System.out.println("Enter the upper limit: ");
        int n = sc.nextInt();
        for (int i =1 ; i <= n; i++) {
            System.out.print(fibo(i)+" ");
        }

    }

    static int fibo(int n) {
        if(n==2 || n==1)
            return n-1;
        return fibo(n-1) + fibo(n-2);
    }

    private static void RStoUSD(Scanner sc) {
        System.out.println("Enter the currency in rupees ₹ ");
        int rs = sc.nextInt();
        System.out.println("The currency exchange rate is 82.63 so the equal USD to your amount is: " + (float)(rs/82.63));
    }

    private static void Calculator(Scanner sc) {
        System.out.println("Enter 2 numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("Enter operator");
        char op = sc.next().charAt(0);
        if(op == '+')
            System.out.println("Their sum is "+(num1 + num2));
        else if(op == '-')
            System.out.println("Their difference is "+(num1 - num2));
        else if(op == '*')
            System.out.println("Their product is "+(num1 * num2));
        else if(op == '/')
            System.out.println("Their quotient is "+(num1 / num2));
        else if(op == '%')
            System.out.println("Their remainder is "+(num1 % num2));
        else
            System.out.println("Not a proper operation. SORRY!!!");
    }

    private static void MaxNumber(Scanner sc) {
        System.out.println("Enter 2 numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(Math.max(num1, num2));
    }

    static void simpleInterest(Scanner sc) {
        System.out.println("Enter P, T, R: ");
        int p= sc.nextInt();
        int t= sc.nextInt();
        int r= sc.nextInt();
        System.out.println( (p*t*r)/100 );
    }

    static void IsOddOrEven(Scanner sc) {
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        if(num%2==0) System.out.println("The number is Even");
        else System.out.println("The number is Odd");
    }

    static void greeting(Scanner sc) {
        System.out.println("Enter a name: ");
        String name = sc.nextLine();
        System.out.println("Welcome "+name);

    }


}
