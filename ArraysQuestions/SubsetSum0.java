//question Link GFG
//https://www.geeksforgeeks.org/find-if-there-is-any-subset-of-size-k-with-0-sum-in-an-array-of-1-and-1/


public class SubsetSum0 {
    static boolean IScheck(int[]arr,int k){
        if(k%2==0){//k is even

            int[] x=new int[2];
            x=Findcount(0,0,arr);
            return x[0]>=(k/2)&& x[1]>=(k/2);
        }
        return false;
    }
    static int[] Findcount(int count1,int count2,int[]arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                count1++;
            }else{
                count2++;
            }
        }
        return new int[]{count1,count2} ;
    }

    public static void main(String[] args) {
        int []a = { 1, 1, -1, -1, 1 };
        int k=0;
        System.out.println(IScheck(a,k));
    }
}
