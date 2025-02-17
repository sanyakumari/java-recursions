public class sumofdigits {

    static  int sod(int n){
        if(n>=0 && n<=9) return n;

        return sod(n/10)+ n%10; // adding last element of n to recursive answer
    }
    public static void main(String[] args) {
        System.out.println(sod(1234));
    }
    
}
