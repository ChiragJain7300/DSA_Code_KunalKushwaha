import java.util.Scanner;



public class Main_BasicJava {
    public static boolean checkPrime(int n)
    {
        boolean isPrime = true;
        for (int i = 2; i <= n/2 ; i++) {
            if(n % i == 0)
            {
                isPrime=false;
                break;
            }
        }
        return isPrime;
    }
    public static void checkCase(char c)
    {
        if(c > 64 && c < 97)
            System.out.println("upper case");
        else
            System.out.println("lower case");
    }
    public static int fibo(int n)
    {
        int a=0;
        int b=1;
        int fibo=0;
        if(n==1 || n==2)
            return n-1;
        else {
            for (int i = 0; i < n-2; i++) {
                fibo = a+b;
                a=b;
                b=fibo;
            }

            return fibo;
        }

    }
    public static int fiboByRecursion(int n)
    {
        if(n==1 || n==2)
            return n-1;
        else{
            return fiboByRecursion(n-1) + fiboByRecursion(n-2);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello world!");
//        System.out.println(args[0]+"\t"+args[1]);
//        System.out.println("Check Prime or not");
//        int n = sc.nextInt();
//        System.out.println(checkPrime(n));

//        Each primitive data type has a corresponding Wrapper class associated with it which provides additional functionality as explored below.
        Integer wrapperInt = 125;

//        The below example showcases typecasting in java
        int i = 25;
        byte b = 25;
        float f = 25;
        int j = i+b;
//        byte bb = i+b
//        ;   this shows error as byte<int in terms of size
        System.out.println(j);
        System.out.println(f+i);
        checkCase('A');
        System.out.println(fibo(9));
        System.out.println(fiboByRecursion(9));
    }
}