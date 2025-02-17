import java.util.Scanner;

public class printnumbers {
    
    static void printIncreasing(int n) {   // print numbers from 1 to n
        if (n == 1) {
            System.out.println(n);
            return;
        }
        printIncreasing(n - 1);
        System.out.println(n);
    }
    static void printDecreasing(int n){   // print numbers from n to 1
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printDecreasing(n-1);

    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printIncreasing(n);
        printDecreasing(n);
        sc.close();   // Don't forget to close the scanner
    }
}
