import java.util.Scanner;
public class Pivot {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 6, 7,8,-3, 0, 1, 2};
        Scanner input=new Scanner (System.in);
        System.out.print("Enter your target in the array:");
        int target=input.nextInt();
        int ans = Output(arr,target);
        System.out.println("Your target number index is:"+ans);
    }
    static int Output(int[]arr,int target)
    {
        int start=0;
        int peak= Pivot(arr);
        boolean First_half=binary_search(arr,0,peak,target)!=-1;
        if(First_half){
            return binary_search(arr,0,peak,target);
        }
        else{
            return binary_search(arr,peak+1,arr.length-1,target);
        }


    }
    static int binary_search(int[]arr,int start,int end,int target)
    {
      while(start<=end)
      {
          int mid=start+(end-start)/2;
          if(target==arr[mid])
          {
              return mid;
          }
          else if( target>arr[mid])
          {
           start=mid+1;
          }else {
              end=mid-1;
          }
      }
       return -1;
    }
//The new part is that to finding the pivot element int the rotatory array
    static int Pivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {//First case if my element of mid is >mid+1 then i got pivot
                return mid;
            } else if (arr[start] <= arr[mid]) {//this condition true until you found your last step
                start = mid + 1;          //where the pivot is your start and then it fail and go to else block
            } else {//In this block our mid==end and so it cut all left side and right side element
                end = mid;
            }
        }

        return start;
    }
}