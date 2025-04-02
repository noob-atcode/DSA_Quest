//INFINITE ARRAY CONCEPT:-ARRAY(lim x) → ∞
public class Infinite_array {
    public static void main(String[] args) {
      int[] arr={3,5,7,9,10,90,100,130,140,160,190,200,202,204,208,210,220,222,230,245,256} ;
      int target=160;
        System.out.println("From infinite array your target position is:"+ans(arr,target));
    }
    static int ans(int[]arr,int target){
        //start with chunk ;
        int start=0;
        int end=1;
        //condition is that is my target>arr[end]
        while(target>arr[end])
        {
            int new_start=end+1;
            //i want to find our next end
            //here we exponentially 2^k increase our range of chunk
            end=end+(end-start+1)*2;
            start=new_start;
        }
        return binary_search(arr,target,start,end);
    }
    static int binary_search(int[] arr,int target,int start,int end)
    {
        while (start<=end)
        {
            int mid=start+(end-start)/2;
            if(target<arr[mid])
            {
                end=mid-1;
            }else if(target>arr[mid]){
                start=mid+1;
            }else{
                return mid;
            }

        }
        return -1;
    }
}
