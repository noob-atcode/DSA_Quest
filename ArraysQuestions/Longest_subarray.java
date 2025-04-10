package DSA_Quest.ArraysQuestions;

public class Longest_subarray {
    static int findLength(int[] arr, int n)
    {
        // To store the maximum number
        // present in the array
        int x = 0;

        // Finding the maximum element
        for (int i = 0; i < n; i++)
            x = Math.max(x, arr[i]);

        int ans = 0, count = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                count++;
                ans = Math.max(ans, count);
            } else {
                count = 0;
            }
        }

        return ans;
    }

    // Driver code
    public static void main(String[] args)
    {
        int arr[] = { 2, 4, 6, 8, 16, 32 };
        int n = arr.length;

        System.out.println(findLength(arr, n));
    }
}
