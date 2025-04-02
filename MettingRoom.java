public class MettingRoom {
    static boolean Findslot(int[][] mat){
        int col=mat[0].length;
        for(int i=0;i<col;i++){
            int row=0;
            while(row <mat.length){
                for(int j=row+1;j< mat.length;j++){
                    if(mat[row][i]==mat[j][i]){
                        return false;
                    }

                }
                row++;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 4}, {10, 15}, {7, 10}};
        System.out.println(Findslot(arr));

    }

}
