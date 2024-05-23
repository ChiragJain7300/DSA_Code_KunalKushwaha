import java.util.Scanner;

public class KunalAssignment01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
// =============================lEAP YEAR Q1
//        System.out.println("Enter the year: ");
//        int year = sc.nextInt();
//        leapYearChecker(year);
// =============================MULTIPLICATION TABLE Q2
//        multiplicationTable(year);
// =============================LCM AND HCF Q4
//        System.out.println("Enter two numbers: ");
//        int num1 = sc.nextInt();
//        int num2 = sc.nextInt();
//        LCMandHCF(num1, num2);
// =============================LEETCODE 1201 LCM OF THREE NUMBERS
//        lcmOfThree(5,15,25);
// =============================Sum till 'x' Q5
        System.out.println(sumTillX());
    }

    static int sumTillX() {
        Scanner sc= new Scanner(System.in);
        int sum = 0;
        String values="";
        do {
            values = sc.next();
            if(!values.equals("x"))
                sum += Integer.parseInt(values);
        } while (!values.equals("x"));
        return sum;
    }

    static void LCMandHCF(int num1, int num2) {
        int lcm,i=1;
        int mult = Math.max(num1, num2);
        lcm=mult;
        while(i!=0){
            if(mult%num1==0 && mult%num2==0){
                lcm=mult;
                i=0;
            }
            else
            {
                i++;
                mult = lcm*i;
            }

        }
        int hcf = (num1*num2)/lcm;
        System.out.println("LCM: "+lcm+" HCF: "+hcf);
    }
    static void lcmOfThree(int a, int b, int c)
    {
        int lcm,i=1;
        int mult = Math.max(c,Math.max(a,b));
        lcm=mult;
        while(i!=0){
            if(mult%a==0 && mult%b==0 && mult%c==0){
                lcm=mult;
                i=0;
            }
            else
            {
                i++;
                mult = lcm*i;
            }

        }
        System.out.println(lcm);
    }

    static void multiplicationTable(int year) {
        for (int i = 1; i <=10 ; i++) System.out.println(year + "x" + i + "=" + (i * year));
    }

    static void leapYearChecker(int year) {
        if(year%4==0)
        {
            if(year%100==0){
                if(year%400==0)
                    System.out.println(year + " is a leap year");
                else
                    System.out.println(year+" is not a leap year.");
            }
            else
                System.out.println(year + " is a leap year");

        }
        else
            System.out.println(year+" is not a leap year.");


    }
}
