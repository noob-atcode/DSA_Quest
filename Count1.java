public class Count1 {
    static int count1(int[]arr ,int start,int end,int target){
        int count=1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==0){
                end=mid-1;
            }else if(arr[mid]==1 && arr[end]==1 && start!=end){
                count=count+end;
                return count;
            }else if(arr[mid]==1 && arr[end]==0){
                count=count+mid;
                start=mid+1;
            }
            if(arr[mid]==1 && arr[end]==1 && start==end){
                count=count+1;
                return count;
            }
            return count;
        }

        return  0;
    }

    public static void main(String[] args) {
        int[] arr={1, 1, 0, 0, 0, 0, 0};
        System.out.println(count1(arr,0,arr.length-1,1));
    }
}
