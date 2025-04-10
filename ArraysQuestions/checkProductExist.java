package DSA_Quest.ArraysQuestions;

//https://www.geeksforgeeks.org/check-if-subarray-with-given-product-exists-in-an-array/

public class checkProductExist {
    static boolean checkIt(int[]arr,int k){

       for(int i=0;i <arr.length;i++){
           int product=1;
           for(int j=i+1;j< arr.length;j++){
               product*=arr[j];
               if(product==k){
                   return true;
               }
           }
       }
       return false;
    }

    public static void main(String[] args) {
        int[] arr={3, -1, -1, -1, 5};

        System.out.println(checkIt(arr,5));
    }
}
