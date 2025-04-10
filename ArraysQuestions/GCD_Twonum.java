package DSA_Quest.ArraysQuestions;

public class GCD_Twonum {
    static int GCD(int n1,int n2){
        int mini_of=Math.min(n1,n2);
        int MAX= Integer.MIN_VALUE;
        for(int i=1;i<=mini_of;i++){
            if(n1%i==0 && n2%i==0 ){
                MAX=Math.max(MAX,i);
            }else{
                continue;
            }
        }
        return MAX;
    }
/* via recursion
 static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
 */

    public static void main(String[] args) {

        System.out.println( GCD(24,26));
    }
}
