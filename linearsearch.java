public class linearsearch {

    static boolean search(int[] a, int target,int idx){
        if(idx>=a.length) return false;
        if(a[idx]==target)return true;
        return(search(a,target,idx+1));
    }

    static int findindex(int[] a, int target,int idx){ //returns the index if element is present,otherwise returns -1
        if(idx>=a.length) return -1;
        if(a[idx]==target)return idx;
        return(findindex(a,target,idx+1));

    }

    static void findallindices(int[] a, int target,int idx){
        if(idx>=a.length) return;
        if(a[idx]==target){
            System.out.print( idx +" ");
        }
        findallindices( a, target, idx+1);

    }
    public static void main(String[] args) {
        int[] a = {12,45,67,4,6,7,4};
        int target = 4;
        if(search(a,target,0)){
            System.out.println(true); 
        }else{
            System.out.println(false);
        }
        System.out.println(findindex(a,target,0));
        findallindices( a, target, 0);
    }
    
}
