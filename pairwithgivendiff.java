import java.util.Arrays;

public class pairwithgivendiff {
    static boolean diff(int[]arr,int target){
        Arrays.sort(arr);
        int res=Integer.MAX_VALUE;
        for(int i=0;i< arr.length;i++){
            int x=arr[i];
            int start=i+1;
            int end=arr.length-1;

            while(start<=end){
                int mid=start+(end-start)/2;
                res=Math.abs(arr[i]-arr[mid]);
                if(res==target){
                    return true;
                }
                if(res>target){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr={90, 70, 20, 80, 50};
        System.out.println(diff(arr,50));
    }
}
