public class sumofArray {
    static int sum(int[] arr,int idx){
        if(idx==arr.length){
            return 0;
        }
        int smallans = sum(arr,idx+1);
        return smallans + arr[idx];
    }
    public static void main(String[] args) {
        int [] arr = {65,32,45,67,89};
        System.out.println(sum(arr,0));
        
    }
    
}
