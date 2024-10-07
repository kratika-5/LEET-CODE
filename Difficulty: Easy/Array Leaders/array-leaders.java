//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.util.stream.*;

class Array {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter ot = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases

        while (t-- > 0) {

            // input size of array
            int n = Integer.parseInt(br.readLine().trim());
            int arr[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");

            // inserting elements in the array
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            Solution obj = new Solution();

            StringBuffer str = new StringBuffer();
            ArrayList<Integer> res = new ArrayList<Integer>();

            // calling leaders() function
            res = obj.leaders(n, arr);

            for (int i = 0; i < res.size(); i++) {
                ot.print(res.get(i) + " ");
            }

            ot.println();
        }
        ot.close();
    }
}

// } Driver Code Ends


class Solution {
    // Functi ArrayList<Integer> result = new ArrayList<>();


static ArrayList<Integer> leaders(int n, int arr[]) {
    // Initialize the ArrayList to store leaders
    ArrayList<Integer> result = new ArrayList<>();
    
    // Start from the last element (it is always a leader)
    int maxFromRight = arr[n-1];
    result.add(maxFromRight);
    
    // Traverse the array from second-last element to the first
    for (int i = n - 2; i >= 0; i--) {
        // If the current element is greater than or equal to maxFromRight
        if (arr[i] >= maxFromRight) {
            maxFromRight = arr[i];
            result.add(maxFromRight); // Add this leader to the list
        }
    }
    
    // Since we're traversing from the right, the result list is in reverse order
    // So reverse the result list
    ArrayList<Integer> finalResult = new ArrayList<>();
    for (int i = result.size() - 1; i >= 0; i--) {
        finalResult.add(result.get(i));
    }
    
    return finalResult;
}
}
