public class fibonacci {
    static int fib(int n) {
        if(n==0 || n==1 ) return n;
        
        return fib(n-1) + fib(n-2);
        }
    
    public static void main(String[] args) {
        System.out.println(fib(6)); // to print 6th fibonacci number
        for(int i=0;i<=6;i++){
            System.out.println(fib(i)); // prints fibonacci series till 6
        }
        
    }
    
}
