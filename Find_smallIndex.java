public class Find_smallIndex {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,4,3,2,1};
        int target=3;
        int ans=search(arr,target);
        System.out.println(ans);

    }
    static int search(int []arr,int target )
    {
        int peak=binary_seach(arr);
        int firstTry=orderAgnosticbc(arr,target,0,peak);
        if(firstTry!=-1)
        {
            return firstTry;
        }
        return orderAgnosticbc(arr,target,peak+1,arr.length-1);
    }
    static  int orderAgnosticbc(int[] arr,int target,int start,int end)
    {boolean isAsc;
        if(arr[start]<arr[end]){
             isAsc=true;
        }else{
            isAsc=false;
        }
       while (start<=end)
       {
          int mid=start+(end-start) /2;
          if(arr[mid]==target){
              return  mid;
          }
          if(isAsc) {

              if (target < arr[mid]) {
                  end = mid - 1;
              } else {
                  start = mid + 1;
              }
          } else {
                  if (target > arr[mid]) {
                      end = mid - 1;
                  } else {
                      start = mid + 1;
                  }
              }
       }
        return -1;
    }
    static int binary_seach(int[] arr)
    {
        int start=0;
        int end=arr.length-1;

        while(start<end)
        {
         int mid=start+(end-start)/2;
         if(arr[mid]>arr[mid+1])
         {
             end=mid;
         }else{
             start=mid+1;
         }
        }
        return start;
    }
}