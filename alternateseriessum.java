import java.util.Scanner;

public class alternateseriessum {
    // problem:-1-2+3-4+5....till n

    static int seriessum(int n){  //TC=O(n)
        if(n==0) return 0;

        if(n%2==0){
            return seriessum(n-1)-n;
        }
        else{
            return seriessum(n-1)+n;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(seriessum(n));
        sc.close();
    }
    
}
