//{ Driver Code Starts
import java.util.*;
import java.util.Scanner;
import java.util.Stack;

class SortedStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            Stack<Integer> s = new Stack<>();
            int n = sc.nextInt();
            while (n-- > 0) s.push(sc.nextInt());
            GfG g = new GfG();
            Stack<Integer> a = g.sort(s);
            while (!a.empty()) {
                System.out.print(a.peek() + " ");
                a.pop();
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends




class GfG {
    // Function to sort the stack
    public Stack<Integer> sort(Stack<Integer> s) {
        // Base case: If stack is empty, return it
        if (s.isEmpty()) {
            return s;
        }

        // Remove the top element
        int topElement = s.pop();

        // Recursively sort the remaining stack
        sort(s);

        // Insert the removed element back in sorted order
        sortedInsert(s, topElement);

        return s;
    }

    // Helper function to insert an element in a sorted manner
    private void sortedInsert(Stack<Integer> s, int element) {
        // Base case: If stack is empty or element is greater than top element
        if (s.isEmpty() || element > s.peek()) {
            s.push(element);
            return;
        }

        // If the element is smaller, pop the top element
        int top = s.pop();

        // Recursive call
        sortedInsert(s, element);

        // Push the popped element back onto the stack
        s.push(top);
    }

    
}
