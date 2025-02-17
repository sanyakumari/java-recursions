import java.util.Scanner;
public class ReverseString {

    static String reverse(String s,int idx){
        if(idx==s.length()){
            return "";
        }
        String smallans = reverse(s,idx+1);
        return smallans + s.charAt(idx);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(reverse(s,0));
        String rev = reverse(s,0);
        if(rev.equals(s)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
        sc.close();
    
    }
    
}
