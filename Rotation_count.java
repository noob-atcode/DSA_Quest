public class Rotation_count {
    public static void main(String[] args) {
        int[] arr={15,18,2,3,6,12};
        int ans=Pivot_element(arr)+1;
        System.out.println("No's of time it rotated is:"+ans);
    }
    static  int Pivot_element(int[]arr)
    {
        int start=0;
        int end=arr.length-1;
        while(start<end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1])
            {return mid;}
            else if(arr[start]<=arr[mid])
            {start=mid+1;}
            else{
                end=mid;
            }
        }
       return start;
    }
}
