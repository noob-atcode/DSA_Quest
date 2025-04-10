package DSA_Quest.ArraysQuestions;
//https://www.geeksforgeeks.org/count-subarrays-with-all-elements-greater-than-k/
public class count_subarray {
    static void countsubarray(int[]arr,int k){

        for(int i=0;i<arr.length;i++){
            if(arr[i]>k){
                System.out.println(arr[i]);
                for(int j=i+1;j<arr.length;j++){
                    if(arr[j]>k){
                        System.out.println(arr[i]+","+arr[j]);
                    }
                    else {
                        break;
                    }
                }
            }else {
               continue;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr={8, 25, 10, 19, 19, 18, 20, 11, 18};
        countsubarray(arr,13);
    }
}
