import java.util.HashSet;

public class Intersection {
    static void intersect(int[]a,int[]b){
        HashSet<Integer> hash=new HashSet<>();
       if(a.length>b.length){
           for(int i=0;i<a.length;i++){
               for(int j=0;j< b.length;j++){
                   if(a[i]==b[j]&&!(hash.contains(b[j]))){
                       hash.add(b[j]);
                   }
               }
           }
       }else{
           for(int i=0;i<b.length;i++){
               for(int j=0;j< a.length;j++){
                   if(b[i]==a[j] && !(hash.contains(a[j]))){
                       hash.add(a[j]);
                   }
               }
           }
       }
        System.out.println(hash);
    }

    public static void main(String[] args) {
        int[] a = {1, 1, 2, 2, 2, 4};
        int[] b = {2, 2, 4, 4};
        intersect(a,b);
    }
}
