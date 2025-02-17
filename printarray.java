public class printarray {
    static void printarr(int[] arr,int idx){
        if(idx==arr.length){
            return;
        }
        System.out.println(arr[idx]);
        printarr(arr,idx+1);

    }
    public static void main(String[] args) {
        int[] arr = {23,43,65,78,12,34};
        printarr(arr,0);
    }
}
