public class Patterns {
    public static void main(String[] args) {
//        pattern3(4);
//        pattern4(5);
//        pattern5(8);
//        pattern28(6);
//        pattern30(6);
//        pattern31(4);
        pattern16(5);
    }

    private static void pattern16(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) System.out.print("  ");
            for (int j = 0; j < i+1; j++) {
                int k = i+1;
                System.out.print("  " + k + "  ");
            }
            System.out.println();
        }
    }

    private static void pattern31(int n) {
        for (int i = 0; i < 2*n-1; i++) {

            for (int j = 0; j < 2*n-1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    private static void pattern30(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < 2*(n-i); j++) System.out.print(" ");
            for (int j = i; j > 1; j--) System.out.print(j+" ");
            for (int j = 1; j <= i; j++) System.out.print(j+" ");
            System.out.println();
        }
    }

    private static void pattern28(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) System.out.print(" ");
            for (int j = 0; j < i+1; j++) System.out.print("* ");
            System.out.println();
        }
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < i+1; j++) System.out.print(" ");
            for (int j = 0; j < n-i-1; j++) System.out.print("* ");
            System.out.println();
        }
    }
    private static void pattern5(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = n-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    private static void pattern4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(j+1+" ");
            }
            System.out.println();
        }
    }

    private static void pattern3(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
