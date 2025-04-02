public class FindKthSmallestElement {
    static int helperfun(int[][]mat,int mid){
        int row=0;
        int col=mat.length-1;
        int count=0;
         while (row< mat.length && col>=0){
             if(mat[row][col]<=mid){
                 count+=(col+1);
                 row++;
             }else {
                 col--;
             }
         }
    return  count;
    }

    static int binarysearch(int[][]mat,int k){
        int n=mat.length-1;
        int start=mat[0][0];
        int end=mat[n][n];
        int ans=0;
        while(start<=end){
            int mid=start+(end-start)/2;
            int count=helperfun(mat,mid);
            if(count<k){
                //we want more count
                start=mid+1;
            }else{
                ans=mid;
                end=mid-1;
            }
        }

        return  ans;
    }

    public static void main(String[] args) {
        int[][] mat={
                {1, 5, 9},
                {10, 11, 13},
                {12, 13, 15}
        };
        System.out.println(binarysearch(mat,2));
    }
}
