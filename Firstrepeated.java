
import java.util.HashSet;

public class Firstrepeated {
   static int repeate(int[] arr){
       HashSet<Integer> s=new HashSet<>();
       for (int i=0;i<arr.length;i++){
           if(s.contains(arr[i])){
               return arr[i];
           }
           s.add(arr[i]);
       }
       return -1;
   }

    public static void main(String[] args) {

        int[] arr={10, 5, 3, 4, 3, 5, 6};
        System.out.println(repeate(arr));
    }

}
