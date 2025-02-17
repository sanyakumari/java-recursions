public class power {

    static int pow(int p,int q){ // TC=O(q)
        if(q==0) return 1;
        
        return pow(p,q-1)*p;
    }
    static int pow2(int p,int q){  // TC=O(logq)
        if(q==0) return 1;
        int smallpow= pow(p,q/2);
        if(q%2==0){  //even p
            return smallpow*smallpow;
        }
        else{  //odd p
            return smallpow*smallpow*p;
        }
    }
    public static void main(String[] args) {
        System.out.println(pow(4,5));
        System.out.println(pow2(4,5));
        
    }
    
}
