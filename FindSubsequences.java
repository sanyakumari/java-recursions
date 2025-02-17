import java.util.ArrayList;

public class FindSubsequences {  

    static ArrayList<String> getSSQ(String s){   //returns subsequences in an arraylist
        ArrayList<String> ans= new ArrayList<>();
        if(s.length()==0){
            ans.add ("");
            return ans;

        }
        char curr = s.charAt(0);
        ArrayList<String> smallans = getSSQ(s.substring(1));
        for(String ss:smallans){
            ans.add(ss);
            ans.add(curr+ss);
        }
        return ans;

     }

     static void printSSQ(String s, String currans){
        if(s.length()==0){
            System.out.println(currans);
            return;
        }
        char currchar= s.charAt(0);
        String remstring = s.substring(1);
        printSSQ(remstring,currans + currchar);
        printSSQ(remstring, currans);

     }
    public static void main(String[] args) {
        ArrayList<String> ans = getSSQ("abc");
        for(String ss:ans){
            System.out.println(ss);
        }
        printSSQ("abc","");
        
    }
    
}
