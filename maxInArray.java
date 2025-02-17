public class maxInArray {
    static int max(int[] arr,int idx){
        if(idx==arr.length - 1){
            return arr[idx];
        }
        int smallans=max(arr,idx+1);
        return Math.max(smallans,arr[idx]);

    }
    public static void main(String[] args) {
        int[] arr={12,45,65,23,87,44};
        System.out.println(max(arr,0));
    }
    
}
