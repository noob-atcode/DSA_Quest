public class QuestionAmazon {

    public static void main(String[] args) {
        int[] arr={0,5,2,1,4};
        int ans=  Cyclic_Sort(arr);
        System.out.println(ans);
    }
    static int  Cyclic_Sort(int[] arr){
        int i=0;
        while(i<arr.length)
        {
            int correct=arr[i];
            if(arr[i]<arr.length && arr[i]!=arr[correct]){
                swapped(arr,i,correct);
            }else{
                i++;
            }
        }
        for(int index=0;index<arr.length;index++)
        {
            if(arr[index]!=index)
                return index;
        }

        //case 2
        return arr.length;
    }
    static void swapped(int[]arr,int i,int correct){
        int temp=arr[i];
        arr[i]=arr[correct];
        arr[correct]=temp;
    }
}
