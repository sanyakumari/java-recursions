import java.util.Scanner;

public class RemoveOccurrences {
    static String removeA(String s,int idx){  //TC=O(n^2)
        if(idx == s.length()){
            return "";
        }
        String smallans = removeA(s,idx+1);  // or removeA(s.subsrting(1)) ,here idx need not to define
        char currchar=s.charAt(idx);  //character at index 0
        if(currchar != 'a'){
            return currchar + smallans;  //performing concatenation
        }else{
            return smallans;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(removeA(s,0));
        sc.close();

    }
    
}
