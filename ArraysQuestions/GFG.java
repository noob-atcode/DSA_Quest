package DSA_Quest.ArraysQuestions;

import java.util.*;
class GFG
{

    // Function to return maximum count
    public static int pick_max_elements(int pos, int sum,
                                        int n, int arr[])
    {

        // Return if the end of the array
        // is reached
        if (pos == n)
            return 0;

        int taken = 0;

        // If we select element at index pos
        if (sum + arr[pos] >= 0)
            taken = 1 + pick_max_elements(pos + 1, sum + arr[pos], n, arr);

        int not_taken = pick_max_elements(pos + 1, sum, n, arr);

        // Return the maximize steps taken
        return Math.max(taken, not_taken);
    }

    // Driver code
    public static void main(String[] args)
    {
        int arr[] = { 5, -7, 0, -5, -3, -1 };
        int N = arr.length;

        // Function to pick maximum number
        // of elements
        System.out.print(pick_max_elements(0, 0, N, arr));
    }
}
