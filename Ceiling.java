public class Ceiling {
    public static void main(String[] args) {
        int[] arr={2,3,5,9,14,16,18};
        int target=4;
        int ans=binary_search(arr,target);
        System.out.println("Your next element is: "+arr[ans]);

    }
    static int binary_search(int arr[],int target)
    {
        int start=0;
        int end=arr.length-1;
        boolean isAsc;
        if(arr[start]<arr[end])
        {
            isAsc=true;
        }else{
            isAsc=false;
        }
        while(arr[start]<=arr[end])
        {
            int mid=start+(end-start)/2;
            if(target==arr[mid])
            {
                return mid;
            }
            if(isAsc)
            {
                if(target<arr[mid])
                {end=mid-1;}
                else
                {start=mid+1;}
            }else
            {
                if(target>arr[mid])
                {end=mid-1;}
                else
                {start=mid+1;}
            }
        }
   return start;
    }
}
