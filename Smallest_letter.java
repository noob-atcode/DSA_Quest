public class Smallest_letter {
    public static void main(String[] args) {
        char[] arr={'c','f','j'};
        char target='z';
        int ans=binary_search(arr,target);
        System.out.println(arr[ans]);
    }
    static int binary_search(char arr[],char target)
    {
      int start=0;
      int end=arr.length-1;

      while(start<=end)
      {
          int mid=start+(end-start)/2;
//          if(arr[mid]==target)
//          {return start;}
          if(arr[mid]<target)
          {
              start=mid+1;
          }else{
              end=mid-1;
          }
      }
      return start%arr.length;

    }
}
