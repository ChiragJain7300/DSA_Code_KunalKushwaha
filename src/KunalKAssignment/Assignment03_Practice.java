package KunalKAssignment;

import java.util.ArrayList;
import java.util.Scanner;

import static KunalKAssignment.Assignment04.facto;

public class Assignment03_Practice {
//    Question Links : https://github.com/kunal-kushwaha/DSA-Bootcamp-Java/blob/main/assignments/03-conditionals-loops.md
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        System.out.println("Choose the shape for which area will be calculated.\n1 for Triangle\n2 for Circle\n3 for Rectangle\n4 for Fibonacci Series\n5 for Factors\n6 for Factorial\n7 for Distance between two points\n8 for LCM");
        int chosenShape = sc.nextInt();

        switch (chosenShape) {
            case 1 -> areaOfTriangle();
            case 2 -> areaOfCircle();
            case 3 -> areaOfRectangle();
            case 4 -> fiboSeries();
            case 5 -> factors();
            case 6 -> factorial();
            case 7 -> distanceBetweenPoints();
            case 8 -> lcm();
            default -> System.out.println("Wrong Choice!!! Enter Again");
        }
    }

    private static void lcm() {
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        int lcm = Math.max(a, b);
        while(lcm%a==0 && lcm%b==0)
        {
            lcm += lcm;
        }
        System.out.println("The LCM of the given numbers is: "+lcm);
    }

    private static void distanceBetweenPoints() {
//        System.out.println("Enter the coordinates of the two points with spaces between them(x1 y1 x2 y2)");
        ArrayList<Integer> coordinates = new ArrayList<Integer>();
        for (int i = 0; i < 4; i++) {
            System.out.println("Enter the coordinate");
            coordinates.add(sc.nextInt());
        }
        double distance = Math.sqrt(Math.pow((coordinates.get(2) - coordinates.get(0)), 2) + Math.pow((coordinates.get(3) - coordinates.get(1)), 2));
        System.out.printf("The distance between the coordinates [%d, %d] and [%d, %d] is", coordinates.get(0),coordinates.get(1),coordinates.get(2),coordinates.get(3));
        System.out.print(" "+ distance);
    }

    private static void factorial() {
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        System.out.println("The factorial of the given number is " + facto(num));
    }

    private static void factors() {
        System.out.println("Enter the number");
        int num = sc.nextInt();
        ArrayList<Integer> factList = new ArrayList<Integer>();
        factList.add(1);
        for (int i = 2; i < num/2; i++) {
            if(num%i == 0)
                factList.add(i);
        }
        factList.add(num);
        for (Integer integer : factList) {
            System.out.print(integer + " ");
        }
    }

    private static void fiboSeries() {
        System.out.println("How many numbers do you want in the Fibonacci series? ");
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.print(fibo(i)+" ");
        }
    }

    private static int fibo(int n) {
        if(n==0 || n==1)
            return n;
        else  {
            return fibo(n-1) + fibo(n-2);
        }
    }

    private static void areaOfRectangle() {
        System.out.println("Enter the length and breadth of the Rectangle\nLength: ");
        double l = sc.nextInt();
        System.out.println("Breadth: ");
        int b = sc.nextInt();
        double area = l * b;
        System.out.println("The area of the right angles Triangle is: " + area);
    }

    private static void areaOfCircle() {
        System.out.println("Enter the radius:");
        double r = sc.nextDouble();
        double area = 3.14 * r* r;
        System.out.println("The area of the circle is: " + area);
    }

    private static void areaOfTriangle() {
        System.out.println("Enter the length and breadth of the right angled triangle\nLength: ");
        int l = sc.nextInt();
        System.out.println("Breadth: ");
        int b = sc.nextInt();
        double area = 0.5 * l * b;
        System.out.println("The area of the right angles Triangle is: " + area);
    }
}
