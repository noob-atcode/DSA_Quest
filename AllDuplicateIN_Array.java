import java.util.ArrayList;
import java.util.List;

public class AllDuplicateIN_Array {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8,8, 2, 3, 1};
        List<Integer> result = search(arr);
        System.out.println(result);
    }

    static List<Integer> search(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (correct >= 0 && correct < arr.length && arr[correct] != arr[i]) {
                swapped(arr, i, correct);
            } else {
                i++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1 ) {
                ans.add(arr[index]);
            }
        }
        return ans;
    }

    static void swapped(int[] arr, int i, int correct) {
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }
}