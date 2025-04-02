public class first_last_pos {
    public static void main(String[] args) {
      int[] arr={5,7,7,7,7,8,8,10};
      int target=8;
        int[] ans=new int[2];
    int start=binary_search(arr,target,true);
    int end=binary_search(arr,target,false);
    ans[0]=start;
    ans[1]=end;
        System.out.println("["+ans[0]+","+ans[1]+"]");
    }
    static int binary_search(int[] arr,int target,boolean findstartIndex)
    {    int ans=-1;
        int start=0;
        int end=arr.length-1;
        while (start<=end)
        {
            int mid=start+(end-start)/2;
            if(target<arr[mid])
            {
                end=mid-1;
            }else if(target>arr[mid]){
                start=mid+1;
            }else{
                ans=mid;
                if(findstartIndex){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }

        }
        return ans;
    }
}
