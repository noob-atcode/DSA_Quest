public class subarray {
    static int maxsum(int[] arr){
       int max=Integer.MIN_VALUE;
       //by o(n^2) complexity
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum=arr[j]+sum;
                max=Math.max(sum,max);

            }
        }
        return  max;


    }

    public static void main(String[] args) {
       int[] arr={-2,-3,4,-1,-2,1,5,-3} ;
        System.out.println(maxsum(arr));
    }
}
