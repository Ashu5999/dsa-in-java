package Stack;
import java.util.*;
public class MaxArea {

    public static void maxArea(int arr[]) {

    int MaxArea = 0;
    int nsr[] = new int[arr.length];
    int nsl[] = new int[arr.length];

    // Next Smaller Right
    Stack<Integer> s = new Stack<>();

    for (int i = arr.length - 1; i >= 0; i--) {

        while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
            s.pop();
        }

        if (s.isEmpty()) {
            nsr[i] = arr.length;
        } else {
            nsr[i] = s.peek();
        }

        s.push(i);
    }

    // Next Smaller Left
    s = new Stack<>();

    for (int i = 0; i < arr.length; i++) {

        while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
            s.pop();
        }

        if (s.isEmpty()) {
            nsl[i] = -1;
        } else {
            nsl[i] = s.peek();
        }

        s.push(i);
    }

    // Area Calculation
    for (int i = 0; i < arr.length; i++) {

        int width = nsr[i] - nsl[i] - 1;
        int area = arr[i] * width;

        MaxArea = Math.max(MaxArea, area);
    }

    System.out.println("Max Area = " + MaxArea);
}        

    
public static void main(String args[]){
    int arr[] = {2,1,5,6,2,3}; // height in histegram
  maxArea(arr);
}
}
// Golden Rule ⭐

// If the problem asks for a Greater element, pop Smaller elements (<=).
// If the problem asks for a Smaller element, pop Greater elements (>=).

// Stack Storage Rule
// Store values (arr[i]) → When only the next greater/smaller value is required.
// Store indices (i) → When the position (index) is required (e.g., Largest Rectangle in Histogram, Trapping Rain Water).