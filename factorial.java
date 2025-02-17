public class factorial {

    static int findfactorial(int n){
        if(n==0) return 1;
        return n*findfactorial(n-1);

    }
    public static void main(String[] args) {
        System.out.println(findfactorial(5));
    }
    
}
