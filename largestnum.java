public class largestnum {
    public static int largestnum(int[] arr){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 324, 45, 90, 9808 };
        System.out.println(largestnum(arr));
    }
}
