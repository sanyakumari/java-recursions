public class KeypadCombinations {

    static void combination(String dig,String[] kp ,String res){
        if(dig.length()==0){
            System.out.print(res + " ");
            return;
        }
        int currnum = dig.charAt(0) - '0';// converting digit into int from string
        String currchoices = kp[currnum];
        for(int i=0;i<currchoices.length();i++){
            combination(dig.substring(1),kp,res + currchoices.charAt(i));
        }

    }
    public static void main(String[] args) {
        String dig = "23";

        String[] kp = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
                 //     0  1     2      3       4     5      6       7      8        9
        combination(dig,kp,"");
    }
    
}
