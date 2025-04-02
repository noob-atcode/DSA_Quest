public class Mountain_array {
    public static void main(String[] args) {
        int[] arr={3,5,6,7,8,9,10,11,10,8,6,4};
        int ans= binary_search(arr);
        System.out.println(arr[ans ]);
    }
    static int binary_search(int[]arr)
    {
        int start=0;
        int end=arr.length-1;
        while (start<end)
        { int mid=start+(end-start)/2;
            if (arr[mid] > arr[mid+1]) {
                end=mid;
            }else{
                start=mid+1;
            }
        }
        return start;//(end)Same result for start and end.
    }
}
